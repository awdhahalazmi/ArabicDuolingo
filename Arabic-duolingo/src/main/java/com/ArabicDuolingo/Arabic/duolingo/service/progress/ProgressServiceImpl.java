package com.ArabicDuolingo.Arabic.duolingo.service.progress;

import com.ArabicDuolingo.Arabic.duolingo.bo.progress.Progress;
import com.ArabicDuolingo.Arabic.duolingo.entity.*;
import com.ArabicDuolingo.Arabic.duolingo.repository.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProgressServiceImpl implements ProgressService {

    private final ProgressRepository progressRepository;
    private final UserRepository userRepository;
    private final LessonRepository lessonRepository;

    private final ChapterRepository chapterRepository;
    private final QuestionRepository questionRepository;

    public ProgressServiceImpl(ProgressRepository progressRepository, ChapterRepository chapterRepository, UserRepository userRepository, LessonRepository lessonRepository, ChapterRepository chapterRepository1, QuestionRepository questionRepository) {
        this.progressRepository = progressRepository;
        //this.chapterRepository = chapterRepository;
        this.userRepository = userRepository;
        this.lessonRepository = lessonRepository;
        this.chapterRepository = chapterRepository1;
        this.questionRepository = questionRepository;
    }


    @Override
    public void saveQuestionId(Progress progress) {
        ProgressEntity progressEntity= new ProgressEntity();
        UserEntity user = userRepository.findById(progress.getUserId())
                        .orElseThrow();
        ChapterEntity chapterEntity = chapterRepository.findById(progress.getChapterId())
                        .orElseThrow();
        LessonEntity lessonEntity = lessonRepository.findById(progress.getLessonId())
                        .orElseThrow();
        QuestionEntity questionEntity = questionRepository.findById(progress.getQuestionId())
                        .orElseThrow();
        progressEntity.setUserId(user);
        progressEntity.setChapterEntity(chapterEntity);
        progressEntity.setLessonEntity(lessonEntity);
        progressEntity.setQuestionEntity(questionEntity);
        progressEntity.setScore(progress.getScore());
        progressRepository.save(progressEntity);
    }
}
