package com.javarevesion.springbootrabbotmqtutorial.publisher;

import com.javarevesion.springbootrabbotmqtutorial.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);

    @Value("${rabbitmq.queue.exchange}")
    private String exchange;

    @Value("${rabbitmq.queue.routingJsonKey}")
    private String jsonRoutingKey;

    private RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(User user) {
        LOGGER.info(String.format("Json message sent: %s", user.toString()));
        rabbitTemplate.convertAndSend(exchange, jsonRoutingKey, user);
    }
}
