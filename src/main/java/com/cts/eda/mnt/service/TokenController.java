package com.cts.eda.mnt.service;

import com.cts.eda.mnt.event.producer.TokenUpdateBean;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.concurrent.ThreadLocalRandom;

@Controller("/tokenUpdate")
public class TokenController {

    @Inject
    TokenUpdateBean tokenUpdateBean;

    @Post(produces = MediaType.APPLICATION_JSON)
    public String emitTokenUpdate() {
        String tokenId = Integer.valueOf(ThreadLocalRandom.current().nextInt(100000, 999999)).toString();
        tokenUpdateBean.sendSampleMessage(tokenId, tokenId+": Active");
        return "Token Number"+tokenId;
    }
}
