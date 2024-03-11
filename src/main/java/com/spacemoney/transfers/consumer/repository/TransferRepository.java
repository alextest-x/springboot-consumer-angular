package com.spacemoney.transfers.consumer.repository;

import com.spacemoney.transfers.consumer.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferEntity, Long> {
}
