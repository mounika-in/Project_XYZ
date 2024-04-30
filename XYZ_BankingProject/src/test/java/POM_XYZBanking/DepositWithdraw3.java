package POM_XYZBanking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestMethods.GenericMethod;

public class DepositWithdraw3 extends GenericMethod {
	WebDriver driver;
	public DepositWithdraw3(WebDriver driver) {
		super(driver);
          this.driver = driver;
	}
	//Click on "Customer Login" button.
   By Customer_Login_button=  By.xpath("//button[@class='btn btn-primary btn-lg']");
   public WebElement Customer_Login_btn() {
	   return driver.findElement(Customer_Login_button);
   }
   //"Click on --Your Name-- dropdown button under "Your Name:" 
	By CustomerName_dropdown= By.xpath("//select[@id='userSelect']");
	public Select CustomerName_drpdwn() {
		//Select any of the customer
		Select name= new Select(driver.findElement(CustomerName_dropdown));
		return name;
	}
	//Click on Login button
	By Login_button= By.xpath("//button[text()='Login']");
	public void Login_btn() {
		Click(driver.findElement(Login_button));
    }
	// Click on "Deposite" tile
    By deposite_title = By.xpath("(//button[@class='btn btn-lg tab'])[2]");
	public WebElement deposite_title() {
			return driver.findElement(deposite_title);
	}
	//Enter text in amount field
    By Amount_to_be_deposited = By.xpath("//input[@type='number']");
	public WebElement Amount_to_be_deposited() {
		return driver.findElement(Amount_to_be_deposited);
	}
	//Click on "Deposit" button.
	By deposite_button = By.xpath("//button[text()='Deposit']");
	 public WebElement deposite_btn() {
			return driver.findElement(deposite_button);
			
	    }
	 
	//Click on "Withdrawl" tile 
	By Withdraw_title = By.xpath("//button[@class='btn btn-lg tab btn-primary']");
	 public void Withdraw_title() {
			 driver.findElement(Withdraw_title);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(deposite_button));
		}
	//Enter the amount to be withdrawn in amount text field 
	By Amount_to_be_withdrawn = By.xpath("//input[@type='number']");
		public WebElement Amount_to_be_withdrawn() {
			return driver.findElement(Amount_to_be_withdrawn);
		}
	//Click on "Withdraw" button
	By Withdraw_button = By.xpath("//button[text()='Withdraw']");
		public WebElement Withdraw_btn() {
			return driver.findElement(Withdraw_button);
		}
	 
	//Validate that user gets "Transaction successful" message.
	By Validate_message = By.xpath("//span[text()='Transaction successful']");
		public WebElement Validate_msg() {
			return driver.findElement(Validate_message);
		}
	 
    //Validate that user is able to see correct balance after withdrawl.
	By Validate_balance = By.xpath("(//strong[@class='ng-binding'])[2]");
		public WebElement Validate_balance() {
			return driver.findElement(Validate_balance);
		}
	
 

}
