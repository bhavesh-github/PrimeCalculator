package com.nw.primenum.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import com.nw.primenum.controller.PrimeNumController;
import com.nw.primenum.service.PrimeNumService;

@WebMvcTest(PrimeNumController.class)
public class PrimeCalculatorIntegrationTest {
	
	@Autowired
	MockMvc mvc;
	
	@MockBean
	public PrimeNumService primeNumService;
	
	@Test
	public void getPrimeNumberListTest() throws Exception {
		RequestBuilder request = get("/primenum?upperLimit=3");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(result.getResponse().getStatus(),200);
	}

}
