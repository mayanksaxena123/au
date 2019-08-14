package cucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoTestScript {
	WebDriver driver;
	@Given("^i have chosen to sign up$")
	public void i_have_chosen_to_sign_up() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("http://demowebshop.tricentis.com");
	    // Write code here that turns the phrase above into concrete actions
	    

	}
	
	@When("^i sign up with\"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_sign_up_with_and(String arg1, String arg2) throws Throwable {
		  driver.findElement(By.linkText("Log in")).click();
		  //driver.findElement(By.id("Email")).sendKeys(arg1);
		  driver.findElement(By.id("Password")).sendKeys(arg2);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^Pass the UserName and Password$")
	public void pass_the_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



	


}
