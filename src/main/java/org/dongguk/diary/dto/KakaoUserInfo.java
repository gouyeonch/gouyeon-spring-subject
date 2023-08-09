package org.dongguk.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class KakaoUserInfo {
    Long id;
    String email;
    String nickname;
    String access_token;

    @Override
    public String toString() {
        return "KakaoUserInfo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", access_token='" + access_token + '\'' +
                '}';
    }
}