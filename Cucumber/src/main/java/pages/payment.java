package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment {public payment(WebDriver driver){
	PageFactory.initElements(driver,this);}

@FindBy(xpath="//input[@title='Continue']")
public WebElement nextaddress;
@FindBy(xpath="//input[@onclick='Shipping.save()']")
public  WebElement shippingsave;
@FindBy(xpath="//input[@value='Ground___Shipping.FixedRate']")
public  WebElement groundsave;
@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
public  WebElement shippingmethod;
@FindBy(xpath="//input[@value='Payments.Manual']")
public  WebElement paymentmanual;
@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
public  WebElement paymentmethodsave;
@FindBy(id="CardholderName")
public  WebElement cardholdername;
@FindBy(id="CardNumber")
public  WebElement cardnumber;
@FindBy(xpath="//select[@id='ExpireMonth']")
public  WebElement expiremonth;
@FindBy(id="ExpireYear")
public  WebElement expireyear;
@FindBy(id="CardCode")
public  WebElement cardcode;
@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
public  WebElement paymentinfosave;
@FindBy(xpath="//input[@value='Confirm']")
public  WebElement confirm;


}


