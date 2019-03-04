package com.Cyrano.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class V2toV1Test extends BaseClass {

	
	
	@FindBy(how=How.XPATH, using="//body[@class='analytic-default-skin']/cyrano-root[@ng-version='7.2.1']/ng-component/div[@id='divscroll']/sidebar/header/ul[@id='slide-out']/div[@class='nav-wrapper']/li/ul[@class='collapsible collapsible-accordion menu-icon']/li[1]/a[1]") WebElement v1;
	public void HomePage () {
		v1.click();
	}
	
}
