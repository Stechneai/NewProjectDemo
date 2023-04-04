package reports;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;



public abstract class listener implements ITestListener 
{

	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test case execution start ==="+ result.getName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case is passed === "+ result.getName());
	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is failed ==="+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case is skipped =="+ result.getName());
	}

}
