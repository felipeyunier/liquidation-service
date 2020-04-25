package com.peya.billing.aws.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peya.billing.aws.service.interfaces.IGeneratorFileService;

@Service
public class EmptyGeneratorFileService implements IGeneratorFileService {

	private final static Logger LOGGER = LoggerFactory.getLogger(EmptyGeneratorFileService.class);
	
	@Override
	public Boolean generateFile(Long idLiquidation) {
		try {
			Thread.sleep(5*1000);
			LOGGER.info("LIQUIDATION: Generation File of Liquidation with id {} was finished", idLiquidation);
		} catch (InterruptedException e) {
			LOGGER.info("LIQUIDATION: Generation File of Liquidation with id {} with error", idLiquidation, e);
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

}
