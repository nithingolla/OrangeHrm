package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(id="txtUsername")WebElement username;
	
	@FindBy(name="txtPassword")WebElement password;
	
	@FindBy(xpath="//*[@id='btnLogin']")WebElement submitButton;
	
	public void  loginApplication(String uid,String pass)
	{
		username.sendKeys(uid);
		
		password.sendKeys(pass);
		
		submitButton.click();
	}

}
