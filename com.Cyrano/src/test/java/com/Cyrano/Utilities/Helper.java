package com.Cyrano.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Helper {

	public void screenShot(WebDriver driver)  {
		
		//  TakesScreenshot ss = (TakesScreenshot)driver;
     	//	File src = ss.getScreenshotAs(OutputType.FILE);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./ScreenShot/login.png"));
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
