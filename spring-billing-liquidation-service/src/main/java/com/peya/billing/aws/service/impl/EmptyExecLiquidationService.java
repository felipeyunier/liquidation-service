package com.peya.billing.aws.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peya.billing.aws.service.interfaces.IExecLiquidationService;

@Service
public class EmptyExecLiquidationService implements IExecLiquidationService {

	private final static Logger LOGGER = LoggerFactory.getLogger(EmptyExecLiquidationService.class);
	
	@Override
	public Boolean exec(Long idLiquidationTaks) {
		try {
			Thread.sleep(5*1000);
			LOGGER.info("LIQUIDATION: Task id {} was finished", idLiquidationTaks);
		} catch (InterruptedException e) {
			LOGGER.info("LIQUIDATION: Task id {} with error", idLiquidationTaks, e);
			return Boolean.FALSE;
		}
		
		return Boolean.TRUE;
	}

}
