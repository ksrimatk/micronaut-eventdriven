package com.cts.eda.mnt.event.consumer;

import com.cts.eda.mnt.domain.token.Token;
import com.cts.eda.mnt.domain.token.service.TokenDomainService;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import org.apache.kafka.clients.consumer.ConsumerConfig;

import javax.inject.Inject;

@KafkaListener(
        groupId = "tokens",
        pollTimeout = "500ms",
        properties = @Property(name = ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, value = "10000")
)

public class TokenUpdateListener {
    public static final String ACTIVE_STATUS="Active";
    public static final String SUSPENDED_STATUS="Suspend";

    @Inject
    private TokenDomainService tokenDomainService;

    @Topic("token-update")
    public void receive(
            @KafkaKey String tokenId,
            String tokenStatus,
            long offset,
            int partition,
            String topic,
            long timestamp) {
        System.out.println("Token Status - " + tokenStatus + " for Token Id  " + tokenId);
        Token updatedToken = tokenDomainService.updateToken();
        System.out.println("Updated Token"+updatedToken);
    }

    @Topic("token-update")
    public void receive(String tokenStatus){
        System.out.println("Token Status >>> " + tokenStatus);
        Token updatedToken = tokenDomainService.updateToken();
        System.out.println("Updated Token"+updatedToken);
    }
}
