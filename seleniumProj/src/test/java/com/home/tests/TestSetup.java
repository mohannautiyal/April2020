package com.home.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.home.base.TestBase;

public class TestSetup extends TestBase {
	
	
	@BeforeTest
	public void Reporter() {
		System.out.println("Running Once");
		htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}	
	
	
	@AfterTest
	public void FlushReport() {
		extent.flush();
	}

}
