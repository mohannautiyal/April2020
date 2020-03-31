package com.home;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestGetAPITest {
	
	@Test
	public void getRequest() {
		
		RestAssured.baseURI ="http://dummy.restapiexample.com";
		
		RequestSpecification rs = RestAssured.given();
		
		Response response = rs.get("/api/v1/employees");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		
	}

}
