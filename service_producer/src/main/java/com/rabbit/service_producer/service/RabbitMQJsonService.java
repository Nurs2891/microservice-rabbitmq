package com.rabbit.service_producer.service;

import com.rabbit.service_producer.dto.UserDtoRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQJsonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonService.class);

    private final RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(UserDtoRequest userDtoRequest){
        LOGGER.info(String.format("Json message sent -> %s", userDtoRequest.toString()));
        rabbitTemplate.convertAndSend("java_exchange", "java_routing_json_key", userDtoRequest);
    }
}
