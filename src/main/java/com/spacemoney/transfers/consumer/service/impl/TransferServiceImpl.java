package com.spacemoney.transfers.consumer.service.impl;

import com.spacemoney.transfers.consumer.domain.Transfer;
import com.spacemoney.transfers.consumer.entity.TransferEntity;
import com.spacemoney.transfers.consumer.mapper.TransferMapper;
import com.spacemoney.transfers.consumer.repository.TransferRepository;
import com.spacemoney.transfers.consumer.service.ITransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TransferServiceImpl implements ITransferService {

    @Autowired
    TransferRepository repository;

    @Autowired
    TransferMapper mapper;

    @Override
    public void registerTransfer(Transfer transfer) {

     /*
        //este transfer recibe un entity y  no un tipo domain que no es una entidad
        //necesitamos enviar en entity a la capa de persistencia

        //para eso vamos a usar una libreria que es Mapstrust que convierte
        //MapStruct Core » 1.3.1.Final
        //MapStruct Processor » 1.3.1.Final
        // convierte un objeto a otro de diferentes capas
        // convierte de un objeto de domain a un objeto entity
      */

        log.info("Save transfer {} ", transfer);

        //convirtiendo el objeto para que lo convierta en un TransferEntity
        TransferEntity transferEntity = mapper.mapperTransfer(transfer);
        repository.save(transferEntity);
    }

    @Override
    public List<TransferEntity> listarProductos() {
        return repository.findAll();
    }
}
