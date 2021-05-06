package com.gus.microservice.user.rest;

import com.gus.microservice.user.domain.entity.KakaoDTO;
import com.gus.microservice.user.domain.lifecycle.ServiceLifecycle;
import com.gus.microservice.user.domain.spec.GobbyIsntFreeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GobbyIsntFreeResource {

    public final GobbyIsntFreeService gobbyIsntFreeService;

    public GobbyIsntFreeResource(ServiceLifecycle serviceLifecycle){
        this.gobbyIsntFreeService = serviceLifecycle.requestGobbyIsntFreeService();
    }

    @CrossOrigin
    @PostMapping(value = "/sendmail")
    public boolean sendMail(@RequestBody KakaoDTO kakaoDTO) {
        return gobbyIsntFreeService.sendMail(kakaoDTO);
    }
}
