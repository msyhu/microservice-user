package com.gus.microservice.user.domain.spec;

import com.gus.microservice.user.domain.entity.KakaoDTO;

public interface GobbyIsntFreeService {

    boolean sendMail(KakaoDTO kakaoDTO);
}
