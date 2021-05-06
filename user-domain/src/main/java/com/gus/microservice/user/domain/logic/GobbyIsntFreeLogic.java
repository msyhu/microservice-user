package com.gus.microservice.user.domain.logic;

import com.gus.microservice.user.domain.entity.KakaoDTO;
import com.gus.microservice.user.domain.spec.GobbyIsntFreeService;

public class GobbyIsntFreeLogic implements GobbyIsntFreeService {
    @Override
    public boolean sendMail(KakaoDTO kakaoDTO) {
        System.out.println(kakaoDTO.toString());
        return false;
    }
}
