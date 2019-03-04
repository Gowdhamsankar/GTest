package com.Cyrano.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver idriver) {
		
		this.driver = idriver;
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='username']") WebElement uname;
	@FindBy(how=How.XPATH, using="//input[@name='password']") WebElement pwd;
	@FindBy(how=How.XPATH, using="//div[@class='d-inline-block']") WebElement submit;
	
	public void loginCyrano(String unameApp, String pwdApp) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		uname.sendKeys(unameApp);
		submit.click();
		pwd.sendKeys(pwdApp);
		submit.click();
		
	}
}
