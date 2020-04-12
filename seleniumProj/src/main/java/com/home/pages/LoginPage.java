package com.home.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.home.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//a[@title='free crm home']")
	WebElement pageBanner;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement signIn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public FlightFinderPage LoginToApplication() throws InterruptedException {
		username.sendKeys("guest");
		password.sendKeys("guest");
		signIn.click();
		System.out.println("Sign into Application");
		return new FlightFinderPage();
	}
	
		
	public String verifyPageBanner() {
		return pageBanner.getAttribute("title");
		
	}

	
	
}
