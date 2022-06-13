package com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.repository;

import com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}
