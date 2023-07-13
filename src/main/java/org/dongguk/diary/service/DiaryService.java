package org.dongguk.diary.service;

import lombok.RequiredArgsConstructor;
import org.dongguk.diary.dto.DiaryRequestDto;
import org.dongguk.diary.dto.DiaryResponseDto;
import org.dongguk.diary.entity.Diary;
import org.dongguk.diary.repository.DiaryRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRepository diaryRepository;

    public DiaryResponseDto readDiary(Integer id){
        Diary diary = diaryRepository.findByDid(id).orElseThrow(() -> new NoSuchElementException());

        return DiaryResponseDto.builder()
                .title(diary.getTitle())
                .content(diary.getContent()).build();
    }

    public void creatDiary(DiaryRequestDto data){
        diaryRepository.save(Diary.builder()
                .user(data.getUser())
                .title(data.getTitle())
                .content(data.getContent()).build());
    }
}
