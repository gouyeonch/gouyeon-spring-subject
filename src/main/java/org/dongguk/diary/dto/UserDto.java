package org.dongguk.diary.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserDto {
    private Long id;
    private String name;

    @Builder
    public UserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
