package cucumberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageObject{
public PageObject (WebDriver driver){
	PageFactory.initElements(driver,this);

}
@FindBy(linkText="Log in")
public WebElement login;
@FindBy(id="Email")
public  WebElement username;
@FindBy(id="Password")
public  WebElement password;
@FindBy(xpath="//input[@value='Log in']")
public  WebElement loginbutton ;



}