/**
 * 
 */
package com.sonarqube.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hidayath
 *
 */
@RestController
@RequestMapping("/maths")
public class MathController {

	private MathService mathService;
	
	@Autowired
	public MathController(MathService mathService) {
		this.mathService = mathService;
	}
	

	@GetMapping("/add/{firstNumber}/{secondNumber}")
	public int add(@PathVariable("firstNumber") int firstNumber, @PathVariable("secondNumber") int secondNumber) {
		return mathService.add(firstNumber, secondNumber);
	}
	
	@GetMapping("/multiply/{firstNumber}/{secondNumber}")
	public int multiply(@PathVariable("firstNumber") int firstNumber, @PathVariable("secondNumber") int secondNumber) {
		return mathService.multiply(firstNumber, secondNumber);
	}

}
