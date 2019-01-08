package com.cg.app.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public Integer add(int num1, int num2) {
		return num1+num2;
		
	}
	/*
	 * public void printThrowException(){ System.out.println("Exception raised");
	 * throw new IllegalArgumentException(); }
	 */
}
