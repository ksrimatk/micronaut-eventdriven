package com.cts.eda.mnt.event.producer;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
@KafkaClient
public interface  TokenUpdateClient {
        @Topic("token-update")
        void updateToken(@KafkaKey Long tokenId, String status);
        void updateTokenCustomTopic(@Topic Long topic, String tokenId, String status);
}

