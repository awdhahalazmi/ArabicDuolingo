package com.ArabicDuolingo.Arabic.duolingo.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class QuestionEntity {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "questionText",nullable = false)
    private String questionText;

    @Column(name = "correct_Answer_Text",nullable = false)
    private String correctAnswerText;
    @Column(name = "first_options",nullable = false)
    private String firstOption;
    @Column(name = "second_options",nullable = false)
    private String secondOption;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private LessonEntity lessonEntity;

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

    public LessonEntity getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(LessonEntity lessonEntity) {
        this.lessonEntity = lessonEntity;
    }

    public String getFirstOption() {
        return firstOption;
    }

    public void setFirstOption(String firstOption) {
        this.firstOption = firstOption;
    }

    public String getSecondOption() {
        return secondOption;
    }

    public void setSecondOption(String secondOption) {
        this.secondOption = secondOption;
    }
}
