package com.ArabicDuolingo.Arabic.duolingo.service.chapter;

import com.ArabicDuolingo.Arabic.duolingo.entity.ChapterEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.ChapterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChapterServiceImpl implements ChapterService{
    private final ChapterRepository chapterRepository;

    public ChapterServiceImpl(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @Override
    public List<ChapterEntity> getAllChapters() {
        return chapterRepository.findAll();
    }
}
