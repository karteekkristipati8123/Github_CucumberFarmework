package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	private By txt_username = By.xpath("//input[@id='login_field']");
	private By txt_password = By.xpath("//input[@id='password']");
	private By btn_signin = By.xpath("//input[@name='commit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clicksignin()
	{
		driver.findElement(btn_signin).click();
	}



}

