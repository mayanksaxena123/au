package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart{
	public AddToCart (WebDriver driver){
	PageFactory.initElements(driver,this);}
	
		 @FindBy(linkText="APPAREL & SHOES")
		 public WebElement apparelshoes;
		 @FindBy(linkText="Casual Golf Belt")
		 public  WebElement casualgolfbelt;
		 @FindBy(id="addtocart_40_EnteredQuantity")
		 public  WebElement enterquantity;
		 @FindBy(id="add-to-cart-button-40")
		 public  WebElement addtocart;
		 @FindBy(className="cart-label")
		 public  WebElement cartlabel;
		 @FindBy(id="termsofservice")
		 public  WebElement tnc;
		 @FindBy(id="checkout")
		 public  WebElement checkout;
		 
	 }
 
