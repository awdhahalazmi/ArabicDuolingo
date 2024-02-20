package com.ArabicDuolingo.Arabic.duolingo.repository;

import com.ArabicDuolingo.Arabic.duolingo.entity.ProgressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProgressRepository extends JpaRepository<ProgressEntity,Long> {
//   List<ProgressEntity> findAllByChapterId(Long chapterId);
//
//   List<ProgressEntity> findAllByChapterEntityId(Long chapterId);
}
