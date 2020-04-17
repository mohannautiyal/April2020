package com.home;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerwithChrome {
	
	
	
	


	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();		
		URL url = new URL("http://192.168.99.100:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.toolsqa.com/");
		System.out.println(driver.getTitle());
		
	//docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:3.141.59-20200409	
	//  docker ps
	// docker images
		
		
	}

}
