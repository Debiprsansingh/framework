							package com.orangehrm.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.orangehrm.base.TestBase;
import com.orangehrm.utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.log(LogStatus.PASS ,result.getName().toUpperCase()+ "PASS");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			TestUtil.capturescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+ "Failed with Exception"+ result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotname));
		Reporter.log("capturing screenshot");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotname+">screenshot</a>");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		test=rep.startTest(context.getName().toUpperCase());
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
