package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberProject.PageObject;

public class LoginPage {
	WebDriver driver;
	@Given("^Navigate to the home page$")
public void navigate_to_the_home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
		   driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
  
}

@When("^user enterusername and password$")
public void user_enterusername_and_password() throws Throwable {
	PageObject Po=new PageObject(this.driver);
	Po.login.click();
	Po.username.sendKeys("m.k.saxena123@gmail.com");
	Po.password.sendKeys("mayank");
	Po.loginbutton.click();
	  //driver.findElement(By.linkText("Log in")).click();
	 // driver.findElement(By.id("Email")).sendKeys("m.k.saxena123@gmail.com");
	  //driver.findElement(By.id("Password")).sendKeys("mayank");
	 // driver.findElement(By.xpath("//input[@value='Log in']")).click();
    // Write code here that turns the phrase above into concrete actions
 
}

@Then("^user logged in sucessfully$")
public void user_logged_in_sucessfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("user login sucesssfully");
}



}