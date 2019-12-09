package com.orangehrm.rough;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;

public class AddEmpRough extends TestBase {
	@Test(dataProvider = "getData")
	public void addEmployee(String empname, String username, String password, String confirmpassword){ 
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("sfgdrsg");
		/*driver.findElement(By.xpath(or.getProperty("userName"))).sendKeys(username);
		driver.findElement(By.xpath(or.getProperty("passWord"))).sendKeys(password);
		driver.findElement(By.xpath(or.getProperty("confirmPassword"))).sendKeys(confirmpassword);
		driver.findElement(By.xpath(or.getProperty("saveBtn"))).click();*/
	}
	

}
