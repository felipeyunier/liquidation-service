package com.peya.billing.aws.service.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.peya.billing.aws.snapshot.LiquidationTaskSnapshopt;

public interface IFindDataService {
	List<LiquidationTaskSnapshopt> findDataToLiquidate(LocalDate dateToLiquidate);
}
