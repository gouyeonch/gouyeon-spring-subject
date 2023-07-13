package org.dongguk.diary.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DiaryResponseDto {
    private String title;
    private String content;

    @Builder
    public DiaryResponseDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
