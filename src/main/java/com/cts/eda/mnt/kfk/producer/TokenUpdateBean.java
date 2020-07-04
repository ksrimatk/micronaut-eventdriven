package com.cts.eda.mnt.kfk.producer;

import javax.inject.Inject;

public class TokenUpdateBean {
    @Inject
    TokenUpdateClient tokenUpdateClient;

    public void sendSampleMessage(String tokenId, String Status){
        tokenUpdateClient.updateToken(tokenId, Status);
    }
}
