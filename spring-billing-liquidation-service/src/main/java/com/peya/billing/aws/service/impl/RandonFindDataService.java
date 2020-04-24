package com.peya.billing.aws.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peya.billing.aws.service.interfaces.IFindDataService;
import com.peya.billing.aws.snapshot.LiquidationTaskSnapshopt;

@Service
public class RandonFindDataService implements IFindDataService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(RandonFindDataService.class);
	
	@Override
	public List<LiquidationTaskSnapshopt> findDataToLiquidate(LocalDate dateToLiquidate) {
		LOGGER.info("LIQUIDATION: Init {}", dateToLiquidate);
		return  LongStream.range(0, 100).boxed().map(LiquidationTaskSnapshopt::new).collect(Collectors.toList());
	}

}
