package com.cemserit.pubSub;

import com.cemserit.pubSub.service.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class PubSubApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PubSubApplication.class, args);
        Publisher redisMessagePublisher = context.getBean(Publisher.class);

        redisMessagePublisher.publish("New subscriber[" + UUID.randomUUID() + "]");
    }
}
