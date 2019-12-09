package com.orangehrm.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
public class BtnForAddEmp extends TestBase{
@Test
public void clickAdminBtn() {
		/*driver.findElement(By.xpath(or.getProperty("admin_xpath"))).click();
		driver.findElement(By.xpath(or.getProperty("addBtn_xpath"))).click();*/
		click("admin_xpath");
		click("addBtn_xpath");
		Log.debug("login into homepage");
		Reporter.log("login into homepage");		
		Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("admin_xpath"))),"element  found");
	
}

}