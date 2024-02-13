package Basuc.DemoAppLoginError;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Lisetner extends Base implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test case Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Executed Successfully",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case Failed",true);
	}

	

}
