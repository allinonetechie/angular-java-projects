package com.cognizant.kafka.kafka.resource;

import com.cognizant.kafka.kafka.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC="Topic_One";

    @GetMapping("/publish/{name}")
    public String publishMessage(
            @PathVariable("name") final String name
    ){
        kafkaTemplate.send(TOPIC, new User(name,"IT", 12000L));
        return "Message published successfully to kafka";
    }

}
