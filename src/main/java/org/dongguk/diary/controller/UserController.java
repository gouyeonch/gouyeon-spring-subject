package org.dongguk.diary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.dto.UserDto;
import org.dongguk.diary.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public UserDto readUserProfile() {
        return userService.readUserProfile(1L);
    }

    @PutMapping("/user")
    public UserDto updateUserProfile() {
        return userService.updateUserProfile(1L, "수정이용");
    }

    @DeleteMapping("/user")
    public Boolean deleteUserProfile() {
        return userService.deleteUserProfile(1L);
    }
}
