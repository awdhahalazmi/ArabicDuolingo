package com.ArabicDuolingo.Arabic.duolingo.controllers.chapter;

import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.service.chapter.ChapterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chapter")
public class ChapterController {
    private final ChapterService chapterService;


    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }
    @GetMapping("/chapters")
    public ResponseEntity<List<ChapterEntity>> getAllChapters(){
        List<ChapterEntity> chapterEntities = chapterService.getAllChapters();
        return ResponseEntity.ok(chapterEntities);
    }
}
