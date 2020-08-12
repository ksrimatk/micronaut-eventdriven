package com.cts.eda.mnt.bean;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotNull;

@Introspected
public class Token {
    @NotNull
    private  Long tokenId;

    private String tokenStatus;
    
    private  String tokenRequestor;

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public String getTokenRequestor() {
        return tokenRequestor;
    }

    public void setTokenRequestor(String tokenRequestor) {
        this.tokenRequestor = tokenRequestor;
    }
}
