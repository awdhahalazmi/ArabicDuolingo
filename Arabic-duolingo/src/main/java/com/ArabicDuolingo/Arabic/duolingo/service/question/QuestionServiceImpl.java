package com.ArabicDuolingo.Arabic.duolingo.service.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;
import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.LessonRepository;
import com.ArabicDuolingo.Arabic.duolingo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
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

    private QuestionEntity mapToQuestionEntity(CreateQuestionRequest request) {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestionText(request.getQuestionText());
        questionEntity.setCorrectAnswerText(request.getCorrectAnswerText());
        LessonEntity lessonEntity = lessonRepository.findById(request.getLessonId())
                .orElseThrow(() -> new EntityNotFoundException("Lesson not found"));
        questionEntity.setLessonEntity(lessonEntity);
        return questionEntity;
    }
}
