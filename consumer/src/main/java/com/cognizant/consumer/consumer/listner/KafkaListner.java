package com.cognizant.consumer.consumer.listner;

import com.cognizant.consumer.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

    /*@KafkaListener(topics = "Topic_One_Demo", groupId = "Group_Id")
    public void consume(String message){
        System.out.println("consumed message: " + message);
    }*/


    @KafkaListener(topics = "Topic_One", groupId = "Group_Json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("USer : " + user);
    }


}

