package com.peya.billing.aws.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peya.billing.aws.service.interfaces.IFindDataService;
import com.peya.billing.aws.snapshot.LiquidationTaskSnapshopt;

@Controller
@RequestMapping("/liquidation")
public class LiquidationController {

	@Autowired
	private IFindDataService randonFindDataService;
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/tasks")
	public ResponseEntity<List<LiquidationTaskSnapshopt>> findLiquidationByGenerate( @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd") LocalDate dateToLiquidate){
		return ResponseEntity.ok(randonFindDataService.findDataToLiquidate(dateToLiquidate));
	}	
}