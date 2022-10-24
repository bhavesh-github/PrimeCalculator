package com.nw.primenum.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PrimeNumServiceTest {
	
	@InjectMocks
	PrimeNumService primeNumService;
	
	
	@Test
	public void checkPrimeNumber_Success() {
		boolean result = primeNumService.isPrimeNumber(3);
		assertEquals(result, true);
	}
	
	@Test
	public void checkPrimeNumber_Failure() {
		boolean result = primeNumService.isPrimeNumber(4);
		assertEquals(result, false);
	}
	
	@Test
	public void checkPrimeNumber_Error() {
		boolean result = primeNumService.isPrimeNumber(-1);
		assertEquals(result, false);
	}

	@Test void getPrimeNumbersTill_Success(){
		TreeSet<Integer> result = primeNumService.getPrimeNumbersTill(3);
		assertEquals(result.first(), 2);
	}

}
