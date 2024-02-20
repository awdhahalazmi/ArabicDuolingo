package com.ArabicDuolingo.Arabic.duolingo.controllers.lesson;


import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;
import com.ArabicDuolingo.Arabic.duolingo.service.lesson.LessonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lessons")
public class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }


    @GetMapping()
    public ResponseEntity<List<LessonEntity>> getAllLessons(){
        List<LessonEntity> lessonEntities = lessonService.getAllLessons();
        return ResponseEntity.ok(lessonEntities);
    }
}
