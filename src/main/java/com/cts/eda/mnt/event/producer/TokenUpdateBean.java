package com.cts.eda.mnt.event.producer;

import javax.inject.Inject;

public class TokenUpdateBean {
    @Inject
    com.cts.eda.mnt.event.producer.TokenUpdateClient tokenUpdateClient;

    public void sendSampleMessage(String tokenId, String Status){
        tokenUpdateClient.updateToken(tokenId, Status);
    }
}
