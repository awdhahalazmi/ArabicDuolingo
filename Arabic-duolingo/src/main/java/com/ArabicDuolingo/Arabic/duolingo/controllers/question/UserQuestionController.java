package com.ArabicDuolingo.Arabic.duolingo.controllers.question;

import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;
import com.ArabicDuolingo.Arabic.duolingo.service.question.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/question")
public class UserQuestionController {

    private final QuestionService questionService;

    public UserQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/all-questions")
    public ResponseEntity<List<QuestionEntity>> getAllQuestionsAndAnswers(
            @RequestParam(required = false) Long chapterId,
            @RequestParam(required = false) Long lessonId) {
        List<QuestionEntity> questionEntities = questionService.getAllQuestionsAndAnswers(chapterId, lessonId);
        return ResponseEntity.ok(questionEntities);
    }
}
