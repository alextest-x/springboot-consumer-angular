package com.spacemoney.transfers.consumer.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transfers")
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String origin;

    private String destin;

    private String bank;

    private String amount;

}
