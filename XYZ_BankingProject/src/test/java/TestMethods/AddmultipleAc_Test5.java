package TestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_XYZBanking.AddmultipleAc5;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddmultipleAc_Test5 {
	
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException {
		//Launching Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launching Website
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login\\r\\n");
		Thread.sleep(5000);
	}
	
	@Test
	public void testcase5() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//Open Chrome Browser > Enter Url of the website.
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login\\r\\n");
	Thread.sleep(5000);
	AddmultipleAc5 Sc5=new AddmultipleAc5(driver);
	//Click on "Bank Manager Login" button.
	Sc5.BankManager_Login_btn().click();
	Thread.sleep(5000);
	//Click on "Add Customer" tile 
	Sc5.Addcustomer_btn().click();
	//Enter text on  First Name on text field 
	Sc5.Firstname_btn().sendKeys("Neville");
	//Enter text on Last Name on text field
	Sc5.Lastname_btn().sendKeys("Longbottom");
	//Enter Post Code text field
	Sc5.postcode_btn().sendKeys("E89898");
	Thread.sleep(5000);
	//Click on "Add Customer" buttton.
	Sc5.AddCustomer().click();
	//"Validate that pop-up is dispalyed with successful message associated with customer id:
    Alert alert1 = driver.switchTo().alert();
	String alertMessage1= driver.switchTo().alert().getText();
	System.out.println(alertMessage1);
	Thread.sleep(5000);
	alert1.accept();
	//Go to "Open Acount" tile .
	Sc5.OpenAccount_btn().click();
	//Click on Customer Name dropdown button under "Customer" > Select customer from dropdown.
	Sc5.CustomerName_drpdwn().selectByVisibleText("Harry Potter");
	//Click on --Currency-- dropdown button  under ""Currency""> Select ""Rupee"" from dropdown > 
	Sc5.Currency_drpdwn().selectByValue("Pound");
	//Click on "Process" button
	Sc5.Process_btn().click();
	//"Validate that pop-up is dispalyed with successful message associated with account number:"
	Alert alert2 = driver.switchTo().alert();
	String alertMessage2= driver.switchTo().alert().getText();
	System.out.println(alertMessage2);
	Thread.sleep(5000);
	//Click on "Ok" Button.
	alert2.accept();
	
	//Again Click on Customer Name dropdown button under "Customer" > Select customer from dropdown.
	Sc5.CustomerName_drpdwn().selectByVisibleText("Harry Potter");
	//Click on --Currency-- dropdown button  under ""Currency""> Select ""Pound"" from dropdown
	Sc5.Currency_drpdwn().selectByValue("Rupee");
	//Click on "Process" button."
	Sc5.Process_btn().click();
	//Validate that pop-up is dispalyed with successful message associated with account number:"
	Alert alert3 = driver.switchTo().alert();
	String alertMessage3= driver.switchTo().alert().getText();
	System.out.println(alertMessage3);
	Thread.sleep(5000);
	//Click on "Ok" Button.
	alert3.accept();
	
	//Again Click on Customer Name dropdown button under "Customer" > Select customer from dropdown.
	Sc5.CustomerName_drpdwn().selectByVisibleText("Harry Potter");
	//Click on --Currency-- dropdown button  under ""Currency""> Select ""Dollar"" from dropdown
	Sc5.Currency_drpdwn().selectByValue("Dollar");
	// Click on "Process" button
	Sc5.Process_btn().click();
	//Validate that pop-up is dispalyed with successful message associated with account number:"
	Alert alert4 = driver.switchTo().alert();
	String alertMessage4= driver.switchTo().alert().getText();
	System.out.println(alertMessage4);
	Thread.sleep(5000);
	//Click on "Ok" Button.
	alert4.accept();
	
	//Go to "Customers" tile.
	Sc5.Customers_btn().click();
	Sc5.Search_btn().sendKeys("Harry");
	//Validate that all the accounts added to the customer is visible under ""AccountNumber"" Column."
	System.out.println("found the customer with all three account details ");
}
	
	@AfterTest
	public void aftertest() {
		driver.quit();//end all the browsers
	}
}


