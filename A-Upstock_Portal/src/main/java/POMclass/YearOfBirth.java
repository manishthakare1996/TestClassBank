package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YearOfBirth {


	@FindBy (xpath = "//input[@id='yob']")
	private WebElement YearOfBirth;
	
	@FindBy (xpath = "//button[@data-id='declineTour']")
	private WebElement IMok;
	
	public YearOfBirth(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Birth()
	{
		YearOfBirth.sendKeys("1996");
		
	}
	public void Good()
	{
		IMok.click();
	}
	
	
	
	
	
	
	
	
	
}
