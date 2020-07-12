package com.cts.eda.mnt.event.consumer;

import com.cts.eda.mnt.domain.token.TokenRepositoryImpl;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import org.apache.kafka.clients.consumer.ConsumerConfig;

@KafkaListener(
        groupId = "tokens",
        pollTimeout = "500ms",
        properties = @Property(name = ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, value = "10000")
)

public class TokenUpdateListener {
    protected final TokenRepositoryImpl tokenRepositoryImpl;

    public TokenUpdateListener(TokenRepositoryImpl tokenRepositoryImpl) {
        this.tokenRepositoryImpl = tokenRepositoryImpl;
    }

    @Topic("token-update")
    public void receive(
            @KafkaKey String tokenId,
            String tokenStatus,
            long offset,
            int partition,
            String topic,
            long timestamp) {

        System.out.println("Token Status - " + tokenStatus + " for Token Id  " + tokenId);
        System.out.println(tokenRepositoryImpl.findById(10004L).orElse(null));

    }

    @Topic("token-update")
    public void receive(String tokenStatus){
        System.out.println("Token Status >>> " + tokenStatus);
        System.out.println(tokenRepositoryImpl.findById(10004L).orElse(null));
    }
}
