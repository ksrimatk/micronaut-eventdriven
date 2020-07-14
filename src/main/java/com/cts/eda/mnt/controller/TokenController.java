package com.cts.eda.mnt.controller;

import com.cts.eda.mnt.service.TokenOpsService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.concurrent.ThreadLocalRandom;

@Controller("/tokenUpdate")
public class TokenController {

    @Inject
    TokenOpsService tokenOpsService;

    @Post(produces = MediaType.APPLICATION_JSON)
    public String emitTokenUpdate() {
        String tokenId = Integer.valueOf(ThreadLocalRandom.current().nextInt(100000, 999999)).toString();
        tokenOpsService.updateToken(tokenId, tokenId+": Active");
        return "Token Number"+tokenId;
    }
}
