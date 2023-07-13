package org.dongguk.diary.dto;

import lombok.Getter;
import org.dongguk.diary.entity.User;

@Getter
public class DiaryRequestDto {
    private User user;
    private String title;
    private String content;
}
