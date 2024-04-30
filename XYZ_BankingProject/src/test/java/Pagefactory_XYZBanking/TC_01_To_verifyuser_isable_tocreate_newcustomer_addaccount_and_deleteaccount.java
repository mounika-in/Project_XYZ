package Pagefactory_XYZBanking;

import org.apache.maven.model.Scm;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestMethods.GenericMethod;

public class TC_01_To_verifyuser_isable_tocreate_newcustomer_addaccount_and_deleteaccount extends GenericMethod {
	WebDriver driver;
	public TC_01_To_verifyuser_isable_tocreate_newcustomer_addaccount_and_deleteaccount(WebDriver driver) {
         super(driver); 
		this.driver = driver;
          PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Bank Manager Login']") public WebElement BankmanagerLogin;
	@FindBy(xpath = "//button[@class='btn btn-lg tab'][1]") public WebElement Addcustomerbutton;
	@FindBy(xpath = "//input[@placeholder='First Name']") public WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']") public WebElement LastName;
	@FindBy(xpath = "//input[@placeholder='Post Code']") public WebElement PostCode;
	@FindBy(xpath = "//button[text()='Add Customer']") public WebElement AddCustomerbutton1;
	@FindBy(xpath = "//button[@class='btn btn-lg tab'][1]") public WebElement Openaccount;
	@FindBy(xpath ="//select[@id='userSelect']") public WebElement CustomerName_Dropdown;
	@FindBy(xpath = "//select[@id='currency']") public WebElement CurrencyName_Dropdown;
    @FindBy(xpath = "//button[text()='Process']") public WebElement ProcessButton;
    @FindBy(xpath = "//button[@class='btn btn-lg tab'][2]") public WebElement CustomersButton;
    @FindBy(xpath = "//input[@placeholder='Search Customer']") public WebElement SearchButton;
    @FindBy(xpath = "(//button[text()='Delete'])") public WebElement DeleteButton;
	
    public Select ClickBankmanagerLogin() {
		
		try {
			Click(BankmanagerLogin);
			Addcustomerbutton.click();
			FirstName.sendKeys("Javaji");
			LastName.sendKeys("Mounika");
			PostCode.sendKeys("456");
			
			AddCustomerbutton1.click();		
			
			Alert alert1 = driver.switchTo().alert();
			String alertMessage1= driver.switchTo().alert().getText();
			System.out.println(alertMessage1);
			Thread.sleep(5000);
			alert1.accept();
			
			Openaccount.click();
			CustomerName_Dropdown.click();
			Thread.sleep(5000);
			
			((Select) CustomerName_Dropdown()).selectByVisibleText("Javaji Mounika");
			Thread.sleep(5000);
			((Select) CurrencyName_Dropdown()).selectByValue("Rupee");
			ProcessButton.click();
			Thread.sleep(5000);
			
			Alert alert2 = driver.switchTo().alert();
			String alertMessage2= driver.switchTo().alert().getText();
			System.out.println(alertMessage2);
			alert2.accept();
			CustomersButton.click();
			SearchButton.sendKeys("Java");
			Thread.sleep(5000);
			DeleteButton.click();
			Thread.sleep(5000);
			
			
			
			
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
		return null;
		
		
		
		
	}


	private Select CustomerName_Dropdown() {
		// TODO Auto-generated method stub
		Select name= new Select((CustomerName_Dropdown));
		return name;
	}
	private Select CurrencyName_Dropdown() {
		// TODO Auto-generated method stub
		Select Currency = new Select((CurrencyName_Dropdown));
		return Currency;
		
	}



	
	
	
	
	
	
	

}
