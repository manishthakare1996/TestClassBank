package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy (xpath = "//input[@id='userCode']")
	private WebElement Username;
	
	@FindBy (xpath = "//input [@id='password']")
	private WebElement Passward ;
	
	@FindBy (xpath = "//div[text()='Sign into Upstox']")
	private WebElement Login ;
	
	
	
	public LoginPage(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
	}
	public void Login() 
	{
		Username.sendKeys("JA8649");
		Passward.sendKeys("Thak@1996");
		Login.click();
		
	}
	
	
	
	
	
	
}
