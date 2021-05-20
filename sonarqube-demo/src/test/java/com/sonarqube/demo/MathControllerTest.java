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
public class MathControllerTest {

	
	private MathController mathController = new MathController(new MathServiceImpl());
	
	@Tag("MCAdd")
	@Test
	void add()
	{
		int sum = mathController.add(10, 20);
		Assertions.assertEquals(30, sum);
	}
	
	@Tag("MCMultiply")
	@Test
	void multiply() {
		int multiply = mathController.multiply(10, 20);
		Assertions.assertEquals(200, multiply);
	}
}
