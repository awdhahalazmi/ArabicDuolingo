package com.ArabicDuolingo.Arabic.duolingo.controllers.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;

import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;
import com.ArabicDuolingo.Arabic.duolingo.service.question.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/question")
public class AdminQuestionController {

    private final QuestionService questionService;

    public AdminQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/question")
    public ResponseEntity<String> addQuestionsWithAnswer(@RequestBody List<CreateQuestionRequest> createQuestionRequest){
        questionService.saveAll(createQuestionRequest);
        return ResponseEntity.ok("Questions with the Answers create successfully");
    }
    @GetMapping("/get_question")
    public ResponseEntity<List<QuestionEntity>> getAllQuestionsAndAnswers(@RequestParam Long chapterId,
                                                                          @RequestParam Long lessonId){
        List<QuestionEntity> questionEntities = questionService.getAllQuestionsAndAnswers(chapterId,lessonId);
        return ResponseEntity.ok(questionEntities);
    }
}
