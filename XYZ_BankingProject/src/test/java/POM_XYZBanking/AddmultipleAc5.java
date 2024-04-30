package POM_XYZBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddmultipleAc5 {
	WebDriver driver;
	
	public AddmultipleAc5(WebDriver driver) {
		this.driver = driver;
	}

	// 2. Click on "Bank Manager Login" button.
	By BankManager_Login_btn = By.xpath("//button[text()='Bank Manager Login']");

	public WebElement BankManager_Login_btn() {
		return driver.findElement(BankManager_Login_btn);
	}

	
	// Click on "Add Customer" tile.
	By Addcustomer_btn = By.xpath("//button[@class='btn btn-lg tab'][1]");

	public WebElement Addcustomer_btn() {
		return driver.findElement(Addcustomer_btn);
	}
    //Enter text on First Name
	By Firstname_btn = By.xpath("//input[@placeholder='First Name']");

	public WebElement Firstname_btn() {
		return driver.findElement(Firstname_btn);
	}
    //Enter text on Last Name
	By Lastname_btn = By.xpath("//input[@placeholder='Last Name']");

	public WebElement Lastname_btn() {
		return driver.findElement(Lastname_btn);
	}
    // Post Code text field 
	By postcode_btn = By.xpath("//input[@placeholder='Post Code']");

	public WebElement postcode_btn() {
		return driver.findElement(postcode_btn);
	}
    // Click on "Add Customer" buttton.
	By AddCustomer = By.xpath("//button[text()='Add Customer']");

	public WebElement AddCustomer() {
		return driver.findElement(AddCustomer);
	}
    //Go to "Open Acount" tile .
	By OpenAccount_btn = By.xpath("//button[@class='btn btn-lg tab'][1]");

	public WebElement OpenAccount_btn() {
		return driver.findElement(OpenAccount_btn);
	}
    //Click on Customer Name dropdown button under "Customer" > Select customer from dropdown.

	By CustomerName_drpdwn = By.xpath("//select[@id='userSelect']");

	public Select CustomerName_drpdwn() {
		Select name = new Select(driver.findElement(CustomerName_drpdwn));
		return name;
	}
    //Click on --Currency-- dropdown button  under ""Currency""> Select ""Rupee"" from dropdown 

	By Currency_drpdwn = By.xpath("//select[@id='currency']");

	public Select Currency_drpdwn() {
		Select currency = new Select(driver.findElement(Currency_drpdwn));
		return currency;
	}
    //Click on ""Process"" button."
	By Process_btn = By.xpath("//button[text()='Process']");

	public WebElement Process_btn() {
		return driver.findElement(Process_btn);
	}

	//Click on "Customers" button
	By Customers_btn = By.xpath("//button[@class='btn btn-lg tab'][2]");

	public WebElement Customers_btn() {
		return driver.findElement(Customers_btn);
	}

	// Validate that all the accounts added to the customer is
	// visible under ""AccountNumber"" Column."

	// Click on Search text field > Enter the text. To validate if all the customers
	// are visible
	By Search_btn = By.xpath("//input[@placeholder='Search Customer']");

	public WebElement Search_btn() {
		return driver.findElement(Search_btn);
	}

}

