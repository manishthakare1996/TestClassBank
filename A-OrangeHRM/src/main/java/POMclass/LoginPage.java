package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy (xpath = "//input[@id='txtUsername']")
	private WebElement Username; 
	
	@FindBy (xpath = "//input[@id='txtPassword']")
	private WebElement Passward;
	
	@FindBy (xpath = "//input[@value='LOGIN']")
	private WebElement Login;
	
	public LoginPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	public void LoginOrangeHRM()
	{
		Username.sendKeys("Admin");
		Passward.sendKeys("admin123");
		Login.click();
	}
	
}
