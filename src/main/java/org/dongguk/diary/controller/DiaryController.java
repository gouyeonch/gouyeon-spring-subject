package org.dongguk.diary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.dto.DiaryRequestDto;
import org.dongguk.diary.dto.DiaryResponseDto;
import org.dongguk.diary.service.DiaryService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    @GetMapping("/read/{id}")
    public ResponseEntity<DiaryResponseDto> readDiary(@PathVariable Integer id){
        DiaryResponseDto diary = diaryService.readDiary(id);
        return ResponseEntity.ok().body(diary);
    }

    @PostMapping("/creat")
    public ResponseEntity<DiaryResponseDto> creatDiary(@RequestBody DiaryRequestDto data){
        DiaryResponseDto diary = diaryService.creatDiary(data);
        return ResponseEntity.ok().body(diary);
    }
}
