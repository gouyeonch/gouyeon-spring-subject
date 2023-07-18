package org.dongguk.diary.service;

import lombok.RequiredArgsConstructor;
import org.dongguk.diary.domain.Diary;
import org.dongguk.diary.repository.DiaryRepository;
import org.springframework.stereotype.Service;
import org.dongguk.study.dto.DiaryDto;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRepository diaryRepository;

    public Boolean creatDiary(DiaryDto data){

        Diary diary = Diary.builder().
                name(data.getName()).
                title(data.getTitle()).
                content(data.getContent()).build();

        diaryRepository.save(diary);

        return Boolean.TRUE;
    }

    public DiaryDto readDiary(Long id){
        Diary diary = diaryRepository.findByDid(id).orElseThrow(() -> new NoSuchElementException());

        return DiaryDto.builder()
                .name(diary.getName())
                .title(diary.getTitle())
                .content(diary.getContent()).build();
    }

    public DiaryDto updateDiary(DiaryDto data){
        Diary diary = diaryRepository.findByDid(data.getId()).orElseThrow(() -> new NoSuchElementException());

        diary.setName(data.getName());
        diary.setTitle(data.getTitle());
        diary.setContent(data.getContent()); //?일케 하는거 맞나 ?

        return DiaryDto.builder()
                .name(diary.getName())
                .title(diary.getTitle())
                .content(diary.getContent()).build();
    }

    public Boolean deleteDiary(Long id){

        Diary diary = diaryRepository.findByDid(id).orElseThrow(() -> new NoSuchElementException());

        diaryRepository.delete(diary);

        return Boolean.TRUE;
    }
}
