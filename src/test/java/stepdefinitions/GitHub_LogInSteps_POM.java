package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class GitHub_LogInSteps_POM {
	protected WebDriver driver;
	 LoginPage lp;
	 
	 
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.findElement(By.xpath("//div[@class='position-relative mr-lg-3 d-lg-inline-block']/a")).click();
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		 Thread.sleep(3000);
		 lp = new LoginPage(driver);
		 lp.enterUserName(username);
		 lp.enterPassword(password);
		 
//		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@And("clicks login button")
	public void clicks_login_button() {
		
		 lp.clicksignin();
//		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}

//	@Then("user should be logged in")
//	public void user_should_be_logged_in() throws InterruptedException {
//		
//		lp.checkdashboard();
//		driver.close();
//		driver.quit();
//	}
}
