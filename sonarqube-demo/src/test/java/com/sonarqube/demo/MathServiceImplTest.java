/**
 * 
 */
package com.sonarqube.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author Hidayath
 *
 */
public class MathServiceImplTest {

	private MathService mathService = new MathServiceImpl();
	
	
	@Tag("Add")
	@Test
	void add() {
		int sum = mathService.add(10, 20);
		Assertions.assertEquals(30, sum);
		
	}

	@Tag("Multiply")
	@Test
	void multiply() {
		int multiply = mathService.multiply(10, 20);
		Assertions.assertEquals(200, multiply);
	}
}
