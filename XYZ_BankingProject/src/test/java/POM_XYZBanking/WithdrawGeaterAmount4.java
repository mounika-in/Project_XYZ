package POM_XYZBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WithdrawGeaterAmount4 {
	WebDriver driver;
	
	public WithdrawGeaterAmount4(WebDriver driver) {
		this.driver = driver;
	}
	//Click on "Customer Login" button.
	By Customer_Login_button = By.xpath("//button[text()='Customer Login']");
    public WebElement Customer_Login_btn() {
		return driver.findElement(Customer_Login_button);
	}

	//Click on --Your Name-- dropdown button 
	By YourName_dropdown = By.xpath("//select[@id='userSelect']");
	public Select YourName_drpdwn() {
		//under "Your Name:"Select any customer
		Select Your_name = new Select(driver.findElement(YourName_dropdown));
		return Your_name;
	}
    //Click on Login button
	By Login_button = By.xpath("//button[text()='Login']");
	public WebElement Login_btn() {
		return driver.findElement(Login_button);
	}

	//Click on ""Deposite"" tile  
	By deposite_title = By.xpath("(//button[@class='btn btn-lg tab'])[2]");
	public WebElement deposite_title() {
		return driver.findElement(deposite_title);
	}
    // Enter text in amount field
	By Amount_to_be_deposited = By.xpath("//input[@type='number']");
	public WebElement Amount_to_be_deposited() {
		return driver.findElement(Amount_to_be_deposited);
	}
    //Click on "Deposit" button
	By deposite_button = By.xpath("//button[text()='Deposit']");
	public WebElement deposite_button() {
		return driver.findElement(deposite_button);
	}

	// Click on "Withdrawl" tile 
	By Withdraw_title = By.xpath("//button[@class='btn btn-lg tab btn-primary']");
	public WebElement Withdraw_title() {
		return driver.findElement(Withdraw_title);
	}
    //Enter the amount to be withdrawn in amount text field
	By Amount_to_be_withdrawn = By.xpath("//input[@type='number']");

	public WebElement Amount_to_be_withdrawn() {
		return driver.findElement(Amount_to_be_withdrawn);
	}
    //Click on "Withdraw button
	By Withdraw_button = By.xpath("//button[text()='Withdraw']");
	public WebElement Withdraw_btn() {
		return driver.findElement(Withdraw_button);
	}

	//Validate that user gets "Transaction Failed" message.
	By Validate_message = By.xpath("//span[text()='Transaction Failed. You can not withdraw amount more than the balance.']");
	public WebElement Validate_message() {
		return driver.findElement(Validate_message);
	}

}
