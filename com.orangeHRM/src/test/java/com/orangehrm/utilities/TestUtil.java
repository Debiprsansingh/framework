package com.orangehrm.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrm.base.TestBase;

public class TestUtil extends TestBase {
	public static String screenshotpath;
	public static String screenshotname;
	public static void capturescreenshot() throws IOException
	{
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		screenshotname="error.jpg";

		File destFile=new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotname);
		FileUtils.copyFile(scrFile,destFile);
	}

}
