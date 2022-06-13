package com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.mapper;

import com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.dto.FundTransfer;
import com.core.banking.fund.transfer.service.internetbankingfundtransferservice.model.entity.FundTransferEntity;
import org.springframework.beans.BeanUtils;

public class FundTransferMapper extends BaseMapper<FundTransferEntity, FundTransfer> {
    @Override
    public FundTransferEntity convertToEntity(FundTransfer dto, Object... args) {
        FundTransferEntity entity = new FundTransferEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    @Override
    public FundTransfer convertToDto(FundTransferEntity entity, Object... args) {
        FundTransfer dto = new FundTransfer();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
