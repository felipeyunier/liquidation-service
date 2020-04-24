package com.peya.billing.aws.service.interfaces;

@FunctionalInterface
public interface IExecLiquidationService {

	Boolean exec(Long idLiquidationTaks);
}
