package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login_PF {
	
	@FindBy(id="login_field")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(name="commit")
	WebElement btn_signin;
	
	WebDriver driver;
	public GitHub_Login_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	 
	public void clickOnSignin()
	{
		btn_signin.click();
	}
	
	
	
}
