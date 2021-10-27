package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {


	@FindBy (xpath = "//b[text()='Recruitment']")
	private WebElement Recruitment;
	
	@FindBy (xpath = "//select[@id='candidateSearch_jobTitle']")
	private WebElement Title;
	
	@FindBy (xpath = "//select[@id='candidateSearch_jobVacancy']")
	private WebElement Vacancy;
	
	@FindBy (xpath = "//select[@id='candidateSearch_hiringManager']")
	private WebElement hiring;
	
	@FindBy (xpath = "//select[@id='candidateSearch_status']")
	private WebElement status;
	
	@FindBy (xpath = "//input[@id='candidateSearch_candidateName']")
	private WebElement Candidate;
	
	@FindBy (xpath = "//input[@id='ohrmList_chkSelectRecord_2_2']")
	private WebElement CheakBox;
	
	@FindBy (xpath = "//input[@id='btnAdd']")
	private WebElement AddButton;
	
	@FindBy (xpath = "//input[@id='addCandidate_firstName']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@id='addCandidate_middleName']")
	private WebElement MiddleName;
	
	@FindBy (xpath = "//input[@id='addCandidate_lastName']")
	private WebElement LastName;
	
	@FindBy (xpath = "	//input[@id='addCandidate_email']")
	private WebElement Email;
	
	@FindBy (xpath = "//input[@id='addCandidate_contactNo']")
	private WebElement ContactNumber;
	
	@FindBy (xpath = "//select[@id='addCandidate_vacancy']")
	private WebElement Vacancy1;
	
	@FindBy (xpath = "//input[@id='btnSave']")
	private WebElement Save;
	
	@FindBy (xpath = "//a[@id='welcome']")
	private WebElement WelcomeClick;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement LogOut;
	public HomePage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}

	public void Recruitment()
	{
		Recruitment.click();	
	}
	public void JobTitle()
	{
		Select S = new Select(Title);
		S.selectByVisibleText("Sales Representative");
	}
		
	public void Vacancy()
	{
		Select T = new Select(Vacancy);
		T.selectByVisibleText("Sales Representative");
	}
	public void Hiring ()
	{
		Select U = new Select(hiring);
		U.selectByVisibleText("Linda Jane Anderson");
	}
	public void Status()
	{
		Select V = new Select(status);
		V.selectByVisibleText("Application Initiated");
	}
	public void CandidateName() 
	{
		Candidate.sendKeys("Jo Denton");
	}
	public void CheakBox ()
	{
		CheakBox.click();
	}
	public void AddButton()
	{
		AddButton.click();
	}
	public void FirstName()
	{
		FirstName.sendKeys("Mani");
	}
	
	public void MiddleName()
	{
		MiddleName.sendKeys("G");
	}
	
	public void LastName()
	{
		LastName.sendKeys("Thak");
	}
	public void Email()
	{
		Email.sendKeys("Thak.Man@gmail.com");
	}
	public void ContactNumber()
	{
		ContactNumber.sendKeys("1234567891");
	}
	public void Vacancy1()
	{
		Select T = new Select(Vacancy1);
		T.selectByVisibleText("Sales Representative");
	}
	public void Save()
	{
		Save.click();
	}
	public void Welcome()
	{
		WelcomeClick.click();
	}
	public void LogOut()
	{
		LogOut.click();
	}
	
	
}
