package com.orangehrm.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;

public class Addpim extends TestBase {


	@Test(dataProvider ="getData")
	public void addEmployee(String empName, String userName, String passWord, String cnfrPswd) throws InterruptedException{ 
		/*driver.findElement(By.xpath(or.getProperty("employeeName_xpath"))).sendKeys(empName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("userName_xpath"))).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("passWord_xpath"))).sendKeys(passWord);
		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("confirmPassword_xpath"))).sendKeys(cnfrPswd);
		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("saveBtn_xpath"))).click();
		Log.debug("employee added is successful");
		Reporter.log("employee added is successful");*/
		type("employeeName_xpath","empName" );
		type("userName_xpath","userName");
		type("passWord_xpath","passWord");
		type("confirmPassword_xpath","cnfrPswd");
		click("saveBtn_xpath");
		
	}

	@DataProvider
	public Object[][] getData() {
		String sheetName="AddEmployee";
		 int rows=excel.getRowCount(sheetName);
		 System.out.println("row is"+rows);
		 int cols=excel.getColumnCount(sheetName);
		 System.out.println("cols is" +cols);
		 Object[][] data =new Object[rows-1][cols];
		 for(int rowNum=2;rowNum<rows;rowNum++)
		 {
			 for (int colNum=0;colNum<cols;colNum++)
			 {
				 data[rowNum-2][colNum]=excel.getCellData(sheetName,colNum,rowNum);
			 }
		 }
		return data;

	}
	
	
}
