package com.spacemoney.transfers.consumer.mapper;

import com.spacemoney.transfers.consumer.domain.Transfer;
import com.spacemoney.transfers.consumer.entity.TransferEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T03:20:29-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (JetBrains s.r.o.)"
)
@Component
public class TransferMapperImpl implements TransferMapper {

    @Override
    public TransferEntity mapperTransfer(Transfer transfer) {
        if ( transfer == null ) {
            return null;
        }

        TransferEntity transferEntity = new TransferEntity();

        transferEntity.setOrigin( transfer.getOrigin() );
        transferEntity.setDestin( transfer.getDestin() );
        transferEntity.setBank( transfer.getBank() );
        transferEntity.setAmount( transfer.getAmount() );

        return transferEntity;
    }
}
