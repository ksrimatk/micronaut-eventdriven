package com.cts.eda.mnt.event.producer;

import javax.inject.Inject;

public class TokenOpsResponseBean {
    @Inject
    TokenOpsResponseClient tokenOpsResponseClient;

    public void sendSampleMessage(String tokenId, String Status){
        tokenOpsResponseClient.notifyTokenOperaton(tokenId, Status);
    }
}
