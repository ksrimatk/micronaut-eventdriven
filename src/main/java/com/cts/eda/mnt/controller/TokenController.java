package com.cts.eda.mnt.controller;

import com.cts.eda.mnt.bean.Token;
import com.cts.eda.mnt.service.TokenOpsService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.validation.Valid;

@Controller("/tokenUpdate")
public class TokenController {

    @Inject
    TokenOpsService tokenOpsService;

    @Post(consumes = MediaType.APPLICATION_JSON , produces = MediaType.APPLICATION_JSON)
    public Token emitTokenUpdate(@Body @Valid Token inputToken) {
        Single<Token> token = null;
//        String tokenId = Integer.valueOf(ThreadLocalRandom.current().nextInt(100000, 999999)).toString();
        tokenOpsService.updateToken(inputToken.getTokenId(), inputToken.getTokenStatus());
        return inputToken;
    }
}
