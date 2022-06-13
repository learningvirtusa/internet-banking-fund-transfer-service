package com.core.banking.fund.transfer.service.internetbankingfundtransferservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InternetBankingFundTransferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingFundTransferServiceApplication.class, args);
	}

}
