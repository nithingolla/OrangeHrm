package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.AdminPage;
import pages.LoginPage;

public class VerifyAdminPage {
	

	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
      driver=BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());}
		
		@Test
		
		public void testLoginPage() throws InterruptedException{
			
		LoginPage home=PageFactory.initElements(driver, LoginPage.class);
		
		       
		home.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 0));
		
		
	   AdminPage admin=PageFactory.initElements(driver, AdminPage.class);
	
	   admin.clickOnAdminPage();
	   admin.clickOnWelcomeAdminLink(); 
		
	}
	
	@AfterMethod
	
		public void tearDown()
		{
			BrowserFactory.closeBrowser(driver);
	}

    
     	
	{
			
		
		
		
		
	
		
		
		
	
		
		
		
					
		
	}
	
	
	
	}
	
	
	
	
	
	
	


