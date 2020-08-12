package com.cts.eda.mnt.event.consumer;

import com.cts.eda.mnt.domain.token.Token;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import org.apache.kafka.clients.consumer.ConsumerConfig;

@KafkaListener(
        groupId = "tokens",
        pollTimeout = "500ms",
        properties = @Property(name = ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, value = "10000")
)
public class TokenOpsResponseListener {
    @Topic("tkn-ops-res")
    public void receive(Token token){
        System.out.println("Token Response ::" + token);
    }
}
