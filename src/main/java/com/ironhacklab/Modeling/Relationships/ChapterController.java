package com.ironhacklab.Modeling.Relationships;

import com.ironhacklab.Modeling.Relationships.model.Chapter;
import com.ironhacklab.Modeling.Relationships.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chapters")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @PostMapping
    public Chapter createChapter(@RequestBody Chapter chapter) {
        return chapterService.saveChapter(chapter);
    }

    @GetMapping("/{id}")
    public Chapter getChapter(@PathVariable Long id) {
        return chapterService.findChapterById(id);
    }

    // Additional endpoints for update and delete can be added here
}
