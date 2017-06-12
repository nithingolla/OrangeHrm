package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.LoginPage;

public class VerifyLoginPageWithReport {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
		
		
		@BeforeMethod
		
		public void setUp()
		{
			report=new ExtentReports("./Reports/loginPageReport.html",true);
			
			logger=report.startTest("Verify Test Login");
			
	      driver=BrowserFactory.getBrowser("chrome");
			
			driver.get(DataProviderFactory.getConfig().getApplicationUrl());
			
			logger.log(LogStatus.INFO, "Application up and running");
			}
		
			
			@Test
			
			public void testLoginPage(){
				
			LoginPage home=PageFactory.initElements(driver, LoginPage.class);
			
			       
			home.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 0));		
			
			logger.log(LogStatus.PASS, "Login Page is Loaded");
			
		}
		
		@AfterMethod
		
			public void tearDown()
			{
				BrowserFactory.closeBrowser(driver);
				
				report.endTest(logger);
				report.flush();
		}

	    
	     	
		{
				
		}
}
