package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	WebDriver driver;	
	
	public AdminPage(WebDriver driver){
		
		this.driver=driver;
		
	  
	}
		
		 @FindBy(xpath="//a[@id='menu_admin_viewAdminModule")
		 WebElement admin;
		 
		 @FindBy(xpath="//a[@id='welcome']")
		 WebElement welcomeadmin;
	     
	     List< WebElement> ele=driver.findElements(By.xpath("/a[text()='Logout']"));
			
			
	     
	     public void clickOnAdminPage() 
	     {
	    	 admin.click();
	    	 
	    	 
	    	 
	     }
	    
	     public void clickOnWelcomeAdminLink()
	     {
	    	 
	 		{
	 			for(WebElement element:ele)
	 			element.click();
	 		}
	 			 
	    		
	     }   
	     
	     
	

}
