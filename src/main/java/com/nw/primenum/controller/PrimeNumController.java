package com.nw.primenum.controller;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nw.primenum.entity.ResponseData;
import com.nw.primenum.service.PrimeNumService;


@RestController
public class PrimeNumController {
	
	@Autowired
	public PrimeNumService primeNumService;
	
	@GetMapping(value = "/primenum")
    public ResponseEntity<ResponseData> getPrimeNumberList(@RequestParam Integer upperLimit) {
        
		TreeSet<Integer> result = primeNumService.getPrimeNumbersTill(upperLimit);
		HttpHeaders responseHeaders = new HttpHeaders();
		
		ResponseData responseData = new ResponseData();
		responseData.setData(result);
		responseData.setStatusCode(200);
		responseData.setSuccess(true);
		return new ResponseEntity<ResponseData>(responseData, responseHeaders, HttpStatus.OK);
		
    }

	

}
