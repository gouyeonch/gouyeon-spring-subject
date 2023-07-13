package org.dongguk.diary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.dto.DiaryRequestDto;
import org.dongguk.diary.dto.DiaryResponseDto;
import org.dongguk.diary.service.DiaryService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    @GetMapping("/read/{id}")
    public DiaryResponseDto readDiary(@PathVariable Integer id){
        DiaryResponseDto diary = diaryService.readDiary(id);
        return diary;
    }

    @PostMapping("/creat")
    public DiaryResponseDto creatDiary(@RequestBody DiaryRequestDto data){

    }
}
