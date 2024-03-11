package com.spacemoney.transfers.consumer.mapper;

import com.spacemoney.transfers.consumer.domain.Transfer;
import com.spacemoney.transfers.consumer.entity.TransferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TransferMapper {


    //generando una instancia

    TransferMapper INSTANCE = Mappers.getMapper(TransferMapper.class);

    /*
            //metodo que regresa un mapeo de objetos
            //recibe un transfer de Domain y lo convierte a un Entity
            //pero como en la clase Tranfer que es la domain no tiene in id
            //hay que poner una anotacion  en TransferMapper
            //@Mapping(target = "id", ignore = true) ignora el id en la clase domain
    */

    @Mapping(target = "id", ignore = true)
    TransferEntity mapperTransfer(Transfer transfer);

}
