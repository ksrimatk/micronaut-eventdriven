package com.cts.eda.mnt.event.producer;

import io.micronaut.runtime.context.scope.ThreadLocal;

import javax.inject.Inject;

@ThreadLocal
public class TokenUpdateBean {
    @Inject
    com.cts.eda.mnt.event.producer.TokenUpdateClient tokenUpdateClient;

    public void updateToken(String tokenId, String Status){
        tokenUpdateClient.updateToken(tokenId, Status);
    }
}
