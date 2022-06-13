package com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.entity;

import com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "fund_transfer")
public class FundTransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionReference;
    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

}
