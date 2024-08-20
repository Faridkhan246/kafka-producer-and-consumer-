package com.javatechie.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javatechie.dto.Customer;

@Service
public class KafkaMessageListener {
	
	Logger log=LoggerFactory.getLogger(KafkaMessageListener.class);
	
	@KafkaListener(topics="javatecjie-demo",groupId="jt-group")
	public void consumeEvents(Customer customer) {
		log.info("consumer consume the events {}" ,customer.toString());
	}
	
//	@KafkaListener(topics="javatecjie-demo1",groupId="jt-group")
//	public void consume2(String message) {
//		log.info("consumer2 consume the message {}" ,message);
//	}
//	@KafkaListener(topics="javatecjie-demo1",groupId="jt-group")
//	public void consume3(String message) {
//		log.info("consumer3 consume the message {}" ,message);
//	}
//	@KafkaListener(topics="javatecjie-demo1",groupId="jt-group")
//	public void consume4(String message) {
//		log.info("consumer4 consume the message {}" ,message);
//	}


}
