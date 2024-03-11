package com.spacemoney.transfers.consumer.listener;

 /*
    escucha la Q cada vez que reciba mesajes
 */

import com.spacemoney.transfers.consumer.domain.Transfer;
import com.spacemoney.transfers.consumer.service.ITransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TransferListener {

    //inyectamos el service
    @Autowired
    private ITransferService service;



    //recibimos el objeto json de rabbitmq
    //el objeto Transfer
    //@RabbitListener para escuchar los mensajes

    @RabbitListener(queues = "q.spacemoney.transfer")
    public void recieveMessage(Transfer transfer){

        // para recibir el json es necesario recibir en un objeto
        // crear una clase de dominio
        // configurar una clase para recibir el json y convertirlo a un objeto
        //en RabbitMqConfigConsumer

        log.info("Listener Transfer consumer: ");
        log.info("Transefer consumer {} ", transfer);

        service.registerTransfer(transfer);

    }
}
