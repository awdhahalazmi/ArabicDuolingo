package com.ArabicDuolingo.Arabic.duolingo.entity;

import javax.persistence.*;

@Entity
public class QuestionEntity {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "questionText",nullable = false)
    private String questionText;

    @Column(name = "correct_Answer_Text",nullable = false)
    private String correctAnswerText;

    @Column(name = "wrong_Answer_Text",nullable = false)
    private String WrongAnswerText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return WrongAnswerText;
    }

    public void setWrongAnswerText(String wrongAnswerText) {
        WrongAnswerText = wrongAnswerText;
    }
}
