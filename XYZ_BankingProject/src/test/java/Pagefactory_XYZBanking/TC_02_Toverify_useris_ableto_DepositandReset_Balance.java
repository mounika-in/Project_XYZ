package Pagefactory_XYZBanking;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestMethods.GenericMethod;

public class TC_02_Toverify_useris_ableto_DepositandReset_Balance extends GenericMethod {
	WebDriver driver;
	
	public TC_02_Toverify_useris_ableto_DepositandReset_Balance(WebDriver driver) {
        super(driver); 
		this.driver = driver;
          
          PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//button[text()='Customer Login']") public WebElement CustomerLoginButton;
	@FindBy(xpath = "//select[@id='userSelect']") public WebElement YourName_Dropdown;
	@FindBy(xpath = "//button[text()='Login']") public WebElement LoginButton;
	@FindBy(xpath ="(//button[@class='btn btn-lg tab'])[2]") public WebElement DepositTitle;
	@FindBy(xpath = "//input[@type='number']") public WebElement AmounttobeDeposited;
	@FindBy(xpath = "//button[text()='Deposit']") public WebElement DepositButton;
	@FindBy(xpath = "(//strong[@class='ng-binding'])[2]") public WebElement ValidateBalance;
	@FindBy(xpath = "//button[@class='btn btn-lg tab'][1]") public WebElement Transactiontitle;
	@FindBy(xpath = "//button[text()='Reset']") public WebElement ResetButton;
	@FindBy(xpath = "//button[text()='Back']") public WebElement BackButton;
	@FindBy(xpath = "//button[text()='Logout']") public WebElement LogoutButton;
	
	


	public Select ClickCustomerLogin() {

		try {
			CustomerLoginButton.click();
			WebDriverWait webwait= new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement elements = null;
			elements = webwait.until(ExpectedConditions.elementToBeClickable(CustomerLoginButton));
			YourName_Dropdown().selectByVisibleText("Hermoine Granger");
			LoginButton.click();
			DepositTitle.click();
			AmounttobeDeposited.sendKeys("200");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(AmounttobeDeposited));
			DepositButton.click();
			System.out.println("Amount deposited=200");
			Thread.sleep(3000);
			DepositTitle.click();
			AmounttobeDeposited.sendKeys("250");
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(AmounttobeDeposited));
			System.out.println("Amount deposited=250");
			Boolean s=((WebElement) Validate_balance()).isDisplayed();
			System.out.println("Balance is dislayed" +s );
			Thread.sleep(3000);
			Transactiontitle.click();
			Thread.sleep(3000);
			ResetButton.click();
			Thread.sleep(3000);
			Click(BackButton);
			
			String ActualStr=Validate_balance().getText();
			int actualval=Integer.parseInt(ActualStr);
			int expected=0;
			Assert.assertEquals(actualval, expected);
			System.out.println("balance is 0");
			Click(LogoutButton);
			
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
		return null;
		}




	private WebElement Validate_balance() {
		// TODO Auto-generated method stub
		return null;
	}




	private Select YourName_Dropdown() {
		// TODO Auto-generated method stub
		Select name= new Select((YourName_Dropdown));
		return name;
		
	}
	}
	


