package com.ArabicDuolingo.Arabic.duolingo.controllers.progress;

import com.ArabicDuolingo.Arabic.duolingo.bo.progress.Progress;
import com.ArabicDuolingo.Arabic.duolingo.service.progress.ProgressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/progress")
public class ProgressController {
    private final ProgressService progressService;

    public ProgressController(ProgressService progressService) {
        this.progressService = progressService;
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveQuestionId(@RequestBody Progress progress){
        progressService.saveQuestionId(progress);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
