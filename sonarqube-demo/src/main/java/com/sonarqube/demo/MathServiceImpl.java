/**
 * 
 */
package com.sonarqube.demo;

import org.springframework.stereotype.Service;

/**
 * @author Hidayath
 *
 */
@Service
public class MathServiceImpl implements MathService{

	
	@Override
	public int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber*secondNumber;
	}

}
