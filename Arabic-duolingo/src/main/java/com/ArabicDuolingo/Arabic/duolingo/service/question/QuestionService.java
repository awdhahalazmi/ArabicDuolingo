package com.ArabicDuolingo.Arabic.duolingo.service.question;

import com.ArabicDuolingo.Arabic.duolingo.bo.question.CreateQuestionRequest;
import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;

import java.util.List;

public interface QuestionService {
    public void saveAll(List<CreateQuestionRequest> createQuestionRequests);
    List<QuestionEntity> getAllQuestionsAndAnswers(Long chapterId, Long lessonId);
}
