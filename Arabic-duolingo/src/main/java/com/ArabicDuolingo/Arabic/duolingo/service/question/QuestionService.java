package com.ArabicDuolingo.Arabic.duolingo.service.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;

import java.util.List;

public interface QuestionService {
    public void saveAll(List<CreateQuestionRequest> createQuestionRequests);}
