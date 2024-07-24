package com.ironhacklab.Modeling.Relationships.service;

import com.ironhacklab.Modeling.Relationships.model.Chapter;
import com.ironhacklab.Modeling.Relationships.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    private final ChapterRepository chapterRepository;

    @Autowired
    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public Chapter saveChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public List<Chapter> findAllChapters() {
        return chapterRepository.findAll();
    }

    public Chapter findChapterById(Long id) {
        return chapterRepository.findById(id).orElse(null);
    }

    // Additional methods to manipulate chapters
}


