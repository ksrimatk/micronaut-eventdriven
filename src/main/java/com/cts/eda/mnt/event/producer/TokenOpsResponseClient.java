package com.cts.eda.mnt.event.producer;

import com.cts.eda.mnt.domain.token.Token;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface TokenOpsResponseClient {
    @Topic("tkn-ops-res")
    void notifyTokenOperaton(@KafkaKey Long tokenId, Token token);
    void notifyTokenOperaton(@Topic String topic, String tokenId, String status);
}
