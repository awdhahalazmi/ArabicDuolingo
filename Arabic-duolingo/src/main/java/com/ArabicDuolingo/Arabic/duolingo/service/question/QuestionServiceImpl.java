package com.ArabicDuolingo.Arabic.duolingo.service.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;
import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.LessonRepository;
import com.ArabicDuolingo.Arabic.duolingo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final LessonRepository lessonRepository;

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(LessonRepository lessonRepository, QuestionRepository questionRepository) {
        this.lessonRepository = lessonRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public void saveAll(List<CreateQuestionRequest> createQuestionRequests) {
        List<QuestionEntity> questionEntities = createQuestionRequests.stream()
                .map(this::mapToQuestionEntity)
                .collect(Collectors.toList());

        questionRepository.saveAll(questionEntities);
    }

    @Override
    public List<QuestionEntity> getAllQuestionsAndAnswers(Long chapterId, Long lessonId) {
        return questionRepository.findAll()
                .stream()
                .filter(question -> chapterId == null || Objects.equals(question.getLessonEntity().getChapter().getId(), chapterId))
                .filter(question -> lessonId == null || Objects.equals(question.getLessonEntity().getId(), lessonId))
                .collect(Collectors.toList());
    }
    private QuestionEntity mapToQuestionEntity(CreateQuestionRequest request) {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestionText(request.getQuestionText());
        questionEntity.setCorrectAnswerText(request.getCorrectAnswerText());
        questionEntity.setFirstOption(request.getFirstOption());
        questionEntity.setSecondOption(request.getSecondOption());
        LessonEntity lessonEntity = lessonRepository.findById(request.getLessonId())
                .orElseThrow(() -> new EntityNotFoundException("Lesson not found"));
        questionEntity.setLessonEntity(lessonEntity);
        return questionEntity;
    }
}
