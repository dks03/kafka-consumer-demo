package com.kafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = { "core-event" }, containerFactory = "containerFactory")
    public void consume(String message, Acknowledgment acknowledgement) {
        log.info("Event on main message={}", message);
        throw new RuntimeException("Failed to process message");
    }

}
