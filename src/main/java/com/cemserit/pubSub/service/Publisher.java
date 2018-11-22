package com.cemserit.pubSub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

/**
 * Created by cemserit on 12.11.2018.
 */
@Service
public class Publisher implements MessagePublisher {

    private final StringRedisTemplate stringRedisTemplate;
    private final ChannelTopic topic;

    @Autowired 
    public Publisher(StringRedisTemplate stringRedisTemplate,
                     ChannelTopic topic) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.topic = topic;
    }

    @Override
    public void publish(String message) {
        stringRedisTemplate.convertAndSend(topic.getTopic(), message);
    }
}
