package com.Cyrano.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserFactory {

	WebDriver driver;
	@BeforeClass
	public static WebDriver startApp(WebDriver driver, String browserName, String url) {
		

		if(browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
			
		}else if(browserName.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if(browserName.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Browser not Supported");
		}
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	
	}
	@AfterClass
	public static void closeApp(WebDriver driver) {
		
		driver.quit();
	}
	
	
}
