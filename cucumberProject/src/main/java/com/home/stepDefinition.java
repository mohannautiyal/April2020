package com.home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinition {
	
	
		
	@Given("user provides two numbers {string} and {string}")
	public void user_provides_two_numbers_and(String string, String string2) {
	    System.out.println("two numbers provided here");
	}

	@Then("the sum of the two numbers should be {string}")
	public void the_sum_of_the_two_numbers_should_be(String string) {
	    System.out.println("Sum is shown here");
		
		
	}

}
