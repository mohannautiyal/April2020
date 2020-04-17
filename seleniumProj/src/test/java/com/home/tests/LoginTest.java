package com.home.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.home.base.TestBase;
import com.home.pages.FlightFinderPage;
import com.home.pages.HomePage;
import com.home.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage LoginPage;
	HomePage HomePage;
	ExtentTest testReporter;
       
	@BeforeMethod
	public void setUp() {		
		initialize();
		HomePage = new HomePage();
	}
	
		
	
	  @Test (priority=2)
	  public void verifyLogin() throws InterruptedException {
		   testReporter =extent.createTest("Verify Login functionality");
            LoginPage =   HomePage.navigateToLoginPage();
            testReporter.log(Status.PASS, "Navigated to Login Page");
    		//extent.flush();

	  }
	  
	 

	@Test(priority=1)
	public void verifyHomePage(){
		testReporter =extent.createTest("Verify Login Test Banner");

		String PageBanner =HomePage.verifyPageBanner();
		System.out.println("Page Banner text "+PageBanner );
		assertTrue(PageBanner.equals("free crm home"));
		testReporter.log(Status.PASS, "Login Page Banner Verified");
	//	extent.flush();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
