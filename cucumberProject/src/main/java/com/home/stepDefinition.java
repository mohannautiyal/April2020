package com.home;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinition {
	
	public context ctx;
	
	
	
	public stepDefinition(context ctx) {
		super();
		this.ctx = ctx;
	}

	int num1,num2;
	
	@Before
	public void RunBefore() {
		System.out.println("==============================");;
		System.out.println("Run this before each scenario");
		
	}
	
	
	@After
	public void RunAfter() {
		System.out.println("Run this ater each scenario");
		System.out.println("==============================");;
		
	}
	
	
	
	/*
	 * @Before("@subs, @add") public void RunBeforeT() {
	 * System.out.println("==============================");;
	 * System.out.println("Run this before add and subs scenario");
	 * 
	 * }
	 */
	
		
	@Given("user provides two numbers {int} and {int}")
	public void user_provides_two_numbers_and(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	    System.out.println("two numbers provided here");
	}

	@Then("the sum of the two numbers should be {int}")
	public void the_sum_of_the_two_numbers_should_be(int sum) {
		
	   System.out.println("Calculating sum ");
	    ctx.setSum(sum);

		assertTrue("Sum is incorrect", sum == (num1 + num2));
		
		
	}
	
	@Then("display the sum on the screen")
	public void display_the_sum_on_the_screen() {
	   System.out.println("Sum is " + ctx.getSum());
	   ;
	}

}
