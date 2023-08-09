package org.dongguk.diary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.diary.dto.KakaoUserInfo;
import org.dongguk.diary.service.KakaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class KakaoController {

    private final KakaoService kakaoService;
    @GetMapping("/oauth/kakao")
    public String kakaoLogin(@RequestParam("code") String code) {
        log.info("kakaoLogin");
        KakaoUserInfo userInfo = kakaoService.getUserInfo(code);

        System.out.println(userInfo.toString());

        return "redirect:/";
    }
}
