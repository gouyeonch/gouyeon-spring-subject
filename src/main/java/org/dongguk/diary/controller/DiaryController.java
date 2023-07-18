package org.dongguk.diary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.service.DiaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.dongguk.study.dto.DiaryDto;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    @PostMapping("/creat")
    public Boolean creatDiary(@RequestBody DiaryDto data){
        return diaryService.creatDiary(data);
    }

    @GetMapping("/read/{id}")
    public DiaryDto readDiary(@PathVariable Long id){
        return diaryService.readDiary(id);
    }

    @PutMapping("/update/{id}")
    public DiaryDto updateDiary(@RequestBody DiaryDto data){
        return diaryService.updateDiary(data);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteDiary(@PathVariable Long id){
        return diaryService.deleteDiary(id);
    }
}
