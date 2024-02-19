package com.ArabicDuolingo.Arabic.duolingo.repository;

import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Long> {
}
