package com.cts.eda.mnt.domain.token.service;

import com.cts.eda.mnt.domain.token.Token;
import com.cts.eda.mnt.domain.token.TokenRepository;
import com.cts.eda.mnt.event.producer.TokenOpsResponseBean;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class TokenDomainService {

    @Inject
    TokenRepository tokenRepository;

    @Inject
    TokenOpsResponseBean tokenOpsResponseBean;

    public static final String ACTIVE_STATUS="Active";
    public static final String SUSPENDED_STATUS="Suspend";

    public Token updateToken() {
        Optional<Token> token = tokenRepository.findById(10004L);
        if(token.isPresent() && (ACTIVE_STATUS.equals(token.get().getTokenStatus()))){
            token.get().setTokenStatus(SUSPENDED_STATUS);
        }else{
            token.get().setTokenStatus(ACTIVE_STATUS);
        }
        System.out.println(token.get());
        tokenOpsResponseBean.notifyTokenOperaton(token.get());
        return tokenRepository.update(token.get());
    }
}
