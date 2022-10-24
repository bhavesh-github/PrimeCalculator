package com.nw.primenum.service;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumService {
	
	
	public boolean isPrimeNumber(int input) {
		if(input < 2) {
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(input)).noneMatch(i->(input%i==0));
		
	}

	public TreeSet<Integer> getPrimeNumbersTill(Integer upperLimit) {
		if(upperLimit < 2) {
			return new TreeSet<Integer>();
		}
		Set<Integer> results = IntStream.rangeClosed(2,upperLimit).filter(i->isPrimeNumber(i)).boxed().collect(Collectors.toSet());
		return new TreeSet<Integer>(results);
	}

}
