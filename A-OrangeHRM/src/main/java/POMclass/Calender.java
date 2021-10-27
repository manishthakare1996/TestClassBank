package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	@FindBy (xpath = "//input[@id='candidateSearch_fromDate']")
	private WebElement calender;
	
	@FindBy (xpath = "//select[@data-handler='selectYear']")
	private WebElement Year;
	
	@FindBy (xpath = "//select[@data-handler='selectMonth']")
	private WebElement Month;
	
	@FindBy (xpath = "//input[@id='candidateSearch_toDate']")
	private WebElement calender1;
	
	@FindBy (xpath = "//a[text()='8']")
	private WebElement Date;
	
	@FindBy (xpath = "//a[text()='10']")
	private WebElement Date1;
	
	@FindBy (xpath = "//input[@id='addCandidate_appliedDate']")
	private WebElement CalenderClick;
	
	@FindBy (xpath = "//select[@data-handler='selectYear']")
	private WebElement Year2;
	
	@FindBy (xpath = "//select[@data-handler='selectMonth']")
	private WebElement Month2;

	@FindBy (xpath = "//a[text()='10']")
	private WebElement Date2;
	
	public Calender(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	public void Calender()
	{
		calender.click();
	}
	public void Year()
	{
		Year.click();
		Select m = new Select(Year);
		m.selectByVisibleText("2020");
	}
	public void Month()
	{
		Month.click();
		Select n = new Select(Month);
		n.selectByIndex(9);
	}
	public void Date()
	{
		Date.click();
	}
	public void Calender1()
	{
		calender1.click();
	}
	public void Year1()
	{
		Year.click();
		Select m = new Select(Year);
		m.selectByVisibleText("2020");
	}
	public void Month1()
	{
		Month.click();
		Select n = new Select(Month);
		n.selectByIndex(9);
	}
	public void Date1()
	{
		Date1.click();
	}
	public void CalenderClick()
	{
		CalenderClick.click();
	}
	public void Year2()
	{
		Year2.click();
		Select m = new Select(Year2);
		m.selectByVisibleText("2020");
	}
	public void Month2()
	{
		Month2.click();
		Select n = new Select(Month2);
		n.selectByIndex(9);
	}
	public void Date2()
	{
		Date2.click();
	}
}
