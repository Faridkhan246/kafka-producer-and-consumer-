//package com.javatechie.config;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//
//@Configuration
//public class KafkaConsumerConfig {
//	
//	@Bean
//	public Map<String,Object>consumerConfig(){
//		Map<String,Object> props=new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
//				"localhost:9092");
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, 
//				StringSerializer.class);
//		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
//		return props;
//	}
//	@Bean
//	public ConsumerFactory<String,Object> consumerFactory(){
//		return new DefaultKafkaConsumerFactory<>(consumerConfig());
//	}
//	
//	 @Bean
//	    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>> kafkaListenerContainerFactory() {
//	        ConcurrentKafkaListenerContainerFactory<String, Object> factory =
//	                new ConcurrentKafkaListenerContainerFactory<>();
//	        factory.setConsumerFactory(consumerFactory());
//	        return factory;
//	    }
//	}
