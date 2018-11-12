package com.cemserit.pubSub.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Created by cemserit on 12.11.2018.
 */
@Service
@Slf4j
public class Subscriber implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("Message received: " + message.toString());
    }
}
