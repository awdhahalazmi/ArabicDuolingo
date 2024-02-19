package com.ArabicDuolingo.Arabic.duolingo.controllers.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;
import com.ArabicDuolingo.Arabic.duolingo.service.question.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public ResponseEntity<String> addQuestionsWithAnswer(@RequestBody List<CreateQuestionRequest> createQuestionRequest){
        questionService.saveAll(createQuestionRequest);
        return ResponseEntity.ok("Questions with the Answers create succefully");
    }
}
