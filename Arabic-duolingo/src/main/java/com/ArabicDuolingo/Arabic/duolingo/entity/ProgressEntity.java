package com.ArabicDuolingo.Arabic.duolingo.entity;

import javax.persistence.*;

@Entity
@Table(name = "progress")
public class ProgressEntity {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userId;

    @OneToOne
    @JoinColumn(name = "chapter_id")
    private ChapterEntity chapterEntity;

    @OneToOne
    @JoinColumn(name = "lesson_id")
    private LessonEntity lessonEntity;
    @OneToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity questionEntity;


    @Column(name = "score")
    private Long score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public ChapterEntity getChapterEntity() {
        return chapterEntity;
    }

    public void setChapterEntity(ChapterEntity chapterEntity) {
        this.chapterEntity = chapterEntity;
    }

    public LessonEntity getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(LessonEntity lessonEntity) {
        this.lessonEntity = lessonEntity;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public QuestionEntity getQuestionEntity() {
        return questionEntity;
    }

    public void setQuestionEntity(QuestionEntity questionEntity) {
        this.questionEntity = questionEntity;
    }
}
