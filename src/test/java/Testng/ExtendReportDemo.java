package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportDemo {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeMethod
	public void startReport()
	{
		htmlReporter = new ExtentSparkReporter("Extent Report.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		// add environmental deatils
		
		reports.setSystemInfo("Machine", "testpc");
    	reports.setSystemInfo("OS", "Linux");
    	reports.setSystemInfo("browser", "chrome");
    	reports.setSystemInfo("username", "Aman");
    	reports.setSystemInfo("class","Automation");
    	
    	// add configuration
    	
    	htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
    	htmlReporter.config().setReportName(" This is My First Report");
    	htmlReporter.config().setTheme(Theme.DARK);
    	
		
	}
	
	
	@Test
	public void verifyTitle()
	{
		test = reports.createTest("Verify the title of webpage");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Fail",ExtentColor.RED));
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Pass", ExtentColor.GREEN));
		}
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}
}
