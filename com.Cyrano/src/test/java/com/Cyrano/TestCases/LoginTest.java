package com.Cyrano.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Cyrano.pages.BaseClass;
import com.Cyrano.pages.LoginPage;
import com.Cyrano.pages.V2toV1Test;

public class LoginTest extends BaseClass  {

	
	
	@Test
	public void test() {
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		V2toV1Test v1 = PageFactory.initElements(driver, V2toV1Test.class);
		login.loginCyrano(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
		v1.HomePage();
		
	}
	
}
