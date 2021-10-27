package TestClass;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMclass.HomePage;
import POMclass.LoginPage;
import POMclass.YearOfBirth;

public class TestNG extends Base{

static WebDriver driver;
	
	@BeforeClass
	@Parameters ("Browser")
	public void beforeClass(String Browser) {
			
		System.out.println("Browser");
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = OpenChromeBrowser();
		}
		if(Browser.equalsIgnoreCase("Edge"))
		{
			driver = OpenEdge();
		}
		if(Browser.equalsIgnoreCase("Fire"))
		{
			
			driver = OpenFirefoxBrowser();
		}
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage Page = new LoginPage(driver);
		Page.Login();
		
		YearOfBirth Birth = new YearOfBirth(driver);
		Birth.Birth();
		
	}
	@Test(priority = 0)
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		YearOfBirth Birth = new YearOfBirth(driver);
		 Birth.Good();
		
		HomePage Home = new HomePage(driver);
		Home.AddButton();
		Home.ListOfStock();
		
		Home.AddStock();
		Home.ClickWatchListedStock();
		
		
		Home.ClickOnBuy(driver);
		
		Home.BuyOrder();
		Home.SelectQuantityOfStock();
		
		
		Home.SelectDelivery();
		
		Home.TriggerPrice();
		Home.ReviewBuyOrder();
	}
	
//	@Test (priority = 1)
//	public void AddStock()
//	{
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		HomePage Home = new HomePage(driver);
//		Home.AddButton();
//		
//		Home.ListOfStock1();
//		Home.AddStock2();
//	}
	@AfterMethod
	public void aftermethod()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage Home = new HomePage(driver);
		Home.ClickOnManish();
//		Home.LogOut();
	}
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	
	
}
