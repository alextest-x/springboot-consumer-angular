package com.spacemoney.transfers.consumer.domain;

import lombok.Data;
import java.io.Serializable;

//ponemos el serializable porque se envia por el broker de mensajeria

@Data
public class Transfer implements Serializable {

    //aqui no tenemos el id que esta en la clase entity
    //entonces hay que poner una anotacion  en TransferMapper

    private String origin;

    private String destin;

    private String bank;

    private String amount;

}

