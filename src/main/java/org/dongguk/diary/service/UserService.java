package org.dongguk.diary.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.domain.User;
import org.dongguk.diary.dto.UserDto;
import org.dongguk.diary.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto readUserProfile(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("유저 없어용"));

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName()).build();
    }

    @Transactional
    public UserDto updateUserProfile(Long userId, String name) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("유저 없어용"));

        user.setName(name);
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName()).build();
    }

    @Transactional
    public Boolean deleteUserProfile(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("유저 없어용"));

        userRepository.delete(user);
        return Boolean.TRUE;
    }
}
