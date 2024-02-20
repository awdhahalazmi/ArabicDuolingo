package com.ArabicDuolingo.Arabic.duolingo.service.lesson;

import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;

import java.util.List;

public interface LessonService {
    List<LessonEntity> getAllLessons();

}
