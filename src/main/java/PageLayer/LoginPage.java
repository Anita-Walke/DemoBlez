package PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilLayer.Wait;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//ul[@class='navbar-nav ml-auto']/li[5]")
	WebElement loginLink;
	
	@FindBy(id="loginusername")
	WebElement userName;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginLink() throws InterruptedException
	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginLink);
		Wait.click(loginLink);
	}
	public void enterUnamAndPass(String uname,String pass)
	{
		Wait.sendKeys(userName, uname);
		Wait.sendKeys(password, pass);
	}
	public void clickonLoginButton()
	{
		Wait.click(loginButton);
	}
	
}
