package com.cts.eda.mnt.event.producer;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface TokenOpsResponseClient {
    @Topic("tkn-ops-res")
    void notifyTokenOperaton(@KafkaKey String tokenId, String status);
    void notifyTokenOperaton(@Topic String topic, String tokenId, String status);
}
