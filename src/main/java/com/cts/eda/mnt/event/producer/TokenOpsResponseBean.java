package com.cts.eda.mnt.event.producer;

import com.cts.eda.mnt.domain.token.Token;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

public class TokenOpsResponseBean {
    @Inject
    TokenOpsResponseClient tokenOpsResponseClient;

    public void notifyTokenOperaton(@NotNull Token token){
        tokenOpsResponseClient.notifyTokenOperaton(token.getTokenId(), token);
    }
}
