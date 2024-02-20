package com.ArabicDuolingo.Arabic.duolingo.service.lesson;

import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class LessonServiceImpl implements LessonService{
    private final LessonRepository lessonRepository;

    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public List<LessonEntity> getAllLessons() {
        return  lessonRepository.findAll();
    }
}
