package com.peya.billing.aws.service.interfaces;

@FunctionalInterface
public interface IGeneratorFileService {

	Boolean generateFile(Long idLiquidation);
}
