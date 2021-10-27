package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	@FindBy (xpath = "//button[@data-id='watchlistAdd']")
	private WebElement Add ;
	
	@FindBy (xpath = "//input[@autocomplete='on']")
	private WebElement SearchStock;
	
	@FindBy (xpath = "//button[@id='NSE_EQ|13611']")
	private WebElement Add1;
	
	@FindBy (xpath = "//div[text()='IRCTC']")
	private WebElement ClickStock;
	
	@FindBy (xpath = "//cq-hu-static[@class='hide-sm']")
	private WebElement ClickBuy;
	
	@FindBy (xpath = "//div[text()='Buy order']")
	private WebElement Buy; 
	
	@FindBy (xpath = "//input[@id='quantity']")
	private WebElement Quantity;
	
	@FindBy (xpath = "//div[@data-id='productDropdown']")
	private WebElement Intraday;
	
	@FindBy (xpath = "//div[text()='Delivery']")
	private WebElement Delivery;
	
	@FindBy (xpath = "//div[@data-id='orderTypeDropdown']")
	private WebElement LimitDropdown;
	
	@FindBy (xpath = "//div[text()='SL Limit']")
	private WebElement Limit;
	
	@FindBy (xpath = "//input[@id='trigger_price']")
	private WebElement Trigger;
	
	@FindBy (xpath = "//div[text()='Review Buy Order']")
	private WebElement ReviewOrder;
	
	@FindBy (xpath = "//span[text()='manish t.']")
	private WebElement Manish;
	
	@FindBy (xpath = "//main[@id='root']//div[text()='Logout']")
	private WebElement LogOut;
	
	@FindBy (xpath = "//button[@id='NSE_EQ|19913']")
	private WebElement Add2;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void AddButton()
	{
		Add.click();
	}
	public void ListOfStock()
	{
		SearchStock.sendKeys("IRCTC");
	}
	public void AddStock()
	{
		Add1.click();
	}
	public void ClickWatchListedStock()
	{
		ClickStock.click();
	}
	public void ClickOnBuy(WebDriver driver)
	{
		Actions alt = new Actions(driver);
		alt.moveToElement(ClickBuy).contextClick().build().perform();
	}
	public void BuyOrder()
	{
		Buy.click();
	}
	public void SelectQuantityOfStock()
	{
		Quantity.sendKeys("100");
		Intraday.click();
	}
	public void SelectDelivery()
	{
		Delivery.click();
		LimitDropdown.click();
		Limit.click();
	}
	public void TriggerPrice()
	{
		Trigger.sendKeys("4835");
	}
	public void ReviewBuyOrder() 
	{
		ReviewOrder.click();
	}
	public void ClickOnManish()
	{
		Manish.click();
	}
	public void LogOut()
	{
		LogOut.click();
	}
	public void ListOfStock1()
	{
		SearchStock.sendKeys("Dmart");
	}
	public void AddStock2()
	{
		Add2.click();
	}
	
}
