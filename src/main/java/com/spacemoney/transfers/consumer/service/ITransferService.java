package com.spacemoney.transfers.consumer.service;

import com.spacemoney.transfers.consumer.domain.Transfer;
import com.spacemoney.transfers.consumer.entity.TransferEntity;

import java.util.List;

public interface ITransferService {

    public void registerTransfer(Transfer transfer);

    public List<TransferEntity> listarProductos();




}
