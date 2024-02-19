package com.ArabicDuolingo.Arabic.duolingo.repository;

import com.ArabicDuolingo.Arabic.duolingo.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
}
