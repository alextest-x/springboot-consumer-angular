package com.spacemoney.transfers.consumer.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfigConsumer {
    //metodo que obtiene el objeto y lo convierte a json

    @Bean
    public MessageConverter jsonMessageConverter(){

        return new Jackson2JsonMessageConverter();
    }

}
