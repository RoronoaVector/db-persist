package com.victor.dbpersist.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.victor.dbpersist.dto.FileDto;
import com.victor.dbpersist.dto.FileEmployeeDto;
import com.victor.dbpersist.service.FileEmployeeService;
import com.victor.dbpersist.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final FileService service;
    private final FileEmployeeService fileEmployeeService;

    @KafkaListener(topics = "${kafka.topic.destination.files}")
    public void filesListener(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
        System.out.println("mensaje ricibido " + message);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            FileDto file = objectMapper.readValue(message,FileDto.class);
            service.persist(file);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "${kafka.topic.destination.employees}")
    public void filesEmployeesListener(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
        System.out.println("mensaje ricibido " + message);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            FileEmployeeDto file = objectMapper.readValue(message,FileEmployeeDto.class);
            fileEmployeeService.persist(file);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
