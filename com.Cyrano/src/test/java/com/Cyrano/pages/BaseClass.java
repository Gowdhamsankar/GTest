package com.Cyrano.pages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.Cyrano.Utilities.BrowserFactory;
import com.Cyrano.Utilities.DataProvider;
import com.Cyrano.Utilities.ExcelData;

public class BaseClass {

	public WebDriver driver;
	public ExcelData excel;
	DataProvider data;
	
	@BeforeSuite
	public void setExcel() {
		excel = new ExcelData(); 
	}
	@BeforeMethod
	public void setup() {
		data = new DataProvider();
		driver = BrowserFactory.startApp(driver, data.getBrowser(), data.getUrl());
	}
}
