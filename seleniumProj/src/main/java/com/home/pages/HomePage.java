package com.home.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.home.base.TestBase;

public class HomePage extends TestBase{
		
	@FindBy(xpath="//a[@title='free crm home']")
	WebElement pageBanner;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement loginButton;
	
	
	
	public String verifyPageBanner() {
		return pageBanner.getAttribute("title");
		
	}
	
	public LoginPage navigateToLoginPage() {
		loginButton.click();

      return new LoginPage();		
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

}
