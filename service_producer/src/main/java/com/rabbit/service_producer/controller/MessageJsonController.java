package com.rabbit.service_producer.controller;

import com.rabbit.service_producer.dto.UserDtoRequest;
import com.rabbit.service_producer.service.RabbitMQJsonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MessageJsonController {

    private final RabbitMQJsonService rabbitMQJsonService;

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody UserDtoRequest user){
        rabbitMQJsonService.sendJsonMessage(user);
        return ResponseEntity.ok("Message sent to RabbitMQ ...");
    }
}
