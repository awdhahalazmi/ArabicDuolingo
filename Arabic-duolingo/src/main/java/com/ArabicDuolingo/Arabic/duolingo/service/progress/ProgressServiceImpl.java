package com.ArabicDuolingo.Arabic.duolingo.service.progress;

import com.ArabicDuolingo.Arabic.duolingo.bo.progress.Progress;
import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.entity.ProgressEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.ChapterRepository;
import com.ArabicDuolingo.Arabic.duolingo.repository.ProgressRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProgressServiceImpl implements ProgressService {

    private final ProgressRepository progressRepository;

    public ProgressServiceImpl(ProgressRepository progressRepository, ChapterRepository chapterRepository) {
        this.progressRepository = progressRepository;
        //this.chapterRepository = chapterRepository;
    }


//    @Override
//    public Progress saveProgress(Progress progress) {
//
//        return null;
//    }
//
//    @Override
//    public Progress getProgress(Long userId, Long chapterId, Long lessonId) {
//        return null;
//    }





//    @Override
//    public Map<Long, Double> calculateChapterProgress() {
//        // Retrieve all chapters
//        List<ChapterEntity> chapters = chapterRepository.findAll();
//
//        Map<Long, Double> chapterProgressMap = new HashMap<>();
//
//        for (ChapterEntity chapter : chapters) {
//            Long chapterId = chapter.getId();
//
//            List<ProgressEntity> progressList = progressRepository.findAllByChapterEntityId(chapterId);
//
//            int totalLessons = chapter.getLesson().size();
//
//            if (totalLessons == 0) {
//                chapterProgressMap.put(chapterId, 0.0);
//                continue;
//            }
//
//            long completedLessons = progressList.stream().filter(progress -> progress.getScore() > 0).count();
//
//            double progress = (double) completedLessons / totalLessons * 100;
//
//            chapterProgressMap.put(chapterId, progress);
//        }
//
//        return chapterProgressMap;
//    }

}
