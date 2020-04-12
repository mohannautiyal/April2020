 package com.home.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.home.base.TestBase;

public class FlightFinderPage extends TestBase{
	
	
	@FindBy(xpath="/img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement findflightbanner;
	
	public FlightFinderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyFindFlightBanner() {
	 return	findflightbanner.isDisplayed();
		
	}

}
