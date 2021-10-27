package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMclass.Calender;
import POMclass.HomePage;
import POMclass.LoginPage;


public class TestNG extends Base{
  
	private WebDriver driver;
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
		LoginPage Login = new LoginPage(driver);
		Login.LoginOrangeHRM();
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage Home = new HomePage(driver);
		Home.Recruitment();
		Home.JobTitle();
		
		Thread.sleep(2000);
		Home.Vacancy();
		
		Home.Hiring();
		Thread.sleep(1000);
		Home.Status();
		
		Home.CandidateName();
		
		Calender Cal = new Calender(driver);
		Cal.Calender();
		Cal.Year();
		Cal.Month();
		Cal.Date();
		Cal.Calender1();
		Cal.Year1();
		Cal.Month1();
		Cal.Date1();
		
		//Home.CheakBox();
		Home.AddButton();
		
		Home.FirstName();
		Home.MiddleName();
		Home.LastName();
		
		Home.Email();
		Home.ContactNumber();
		
		Home.Vacancy1();
		
		Cal.CalenderClick();
		Cal.Year2();
		Cal.Month2();
		Cal.Date2();
		
		Home.Save();
		Home.Welcome();
		}
	@AfterMethod
	public void aftermethod()
	{
		HomePage Home = new HomePage(driver);
//		Home.LogOut();
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
	
	
	
	
 
  }

