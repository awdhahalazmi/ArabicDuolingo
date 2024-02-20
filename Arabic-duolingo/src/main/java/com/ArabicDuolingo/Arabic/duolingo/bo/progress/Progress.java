package com.ArabicDuolingo.Arabic.duolingo.bo.progress;

public class Progress {
    private Long scoreId;
    private Long chapterId;
    private Long lessonId;
    private Long userId;
    private Long score;

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
