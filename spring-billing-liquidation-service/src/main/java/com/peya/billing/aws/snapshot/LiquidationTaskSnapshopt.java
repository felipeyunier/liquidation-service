package com.peya.billing.aws.snapshot;

import java.io.Serializable;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class LiquidationTaskSnapshopt implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long liqudationId;
}
