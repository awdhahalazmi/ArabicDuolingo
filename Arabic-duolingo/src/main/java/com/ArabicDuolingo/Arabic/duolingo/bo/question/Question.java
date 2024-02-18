package com.ArabicDuolingo.Arabic.duolingo.bo.question;

public class Question {
private Long questionId;
    private String questionText;
    private String correctAnswerText;
    private String wrongAnswerText;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswerText() {
        return correctAnswerText;
    }

    public void setCorrectAnswerText(String correctAnswerText) {
        this.correctAnswerText = correctAnswerText;
    }

    public String getWrongAnswerText() {
        return wrongAnswerText;
    }

    public void setWrongAnswerText(String wrongAnswerText) {
        this.wrongAnswerText = wrongAnswerText;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
