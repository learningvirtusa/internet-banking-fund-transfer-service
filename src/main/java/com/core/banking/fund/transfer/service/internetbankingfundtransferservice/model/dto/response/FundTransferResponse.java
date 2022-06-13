package com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.dto.response;

import lombok.Data;

@Data
public class FundTransferResponse {
    private String message;
    private String transactionId;
}
