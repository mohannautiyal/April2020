package com.home.base;

import static com.home.utils.PropertiesUtil.configReader;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.home.utils.webDriverEventListener;



public class TestBase {

	
	public static WebDriver driver;
	public static EventFiringWebDriver e_Driver;
	public static WebDriverEventListener eventListener;
	
	 public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		
	
	
	public TestBase() {
		
		
	}
	
	public static void initialize() {
		
		String browserName = configReader.getProperty("browser");
		System.out.println("Initializing Browser ..");

		if (browserName.equals("internetExplorer")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		e_Driver = new EventFiringWebDriver(driver);
		eventListener = new webDriverEventListener();
		e_Driver.register(eventListener);
		driver = e_Driver;

		System.out.println("Launching application " + configReader.getProperty("AppUrl"));
		driver.get(configReader.getProperty("AppUrl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	
}
