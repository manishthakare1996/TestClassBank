package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver OpenChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\REASONING\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");	
		return driver;
	}
	public static WebDriver OpenFirefoxBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "G:\\REASONING\\geckodriver.exe");	
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");	
		
		return driver;
	}
	public static WebDriver OpenEdge() {
		
		System.setProperty("webdriver.edge.driver", "G:\\REASONING\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");	
		return driver;
		}
	

	
	
}