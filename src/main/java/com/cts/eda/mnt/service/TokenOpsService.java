package com.cts.eda.mnt.service;

import com.cts.eda.mnt.event.producer.TokenUpdateBean;
import io.micronaut.runtime.context.scope.ThreadLocal;

import javax.inject.Inject;

@ThreadLocal
public class TokenOpsService {
    @Inject
    TokenUpdateBean tokenUpdateBean;

    public String updateToken(String tokenId, String status) {
        tokenUpdateBean.updateToken(tokenId, tokenId+": Active");
        return "Token Number"+tokenId;
    }
}
