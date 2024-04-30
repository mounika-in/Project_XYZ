package TestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_XYZBanking.WithdrawGeaterAmount4;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithdrawGreaterAmount_Test4 {
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
	public void testcase4() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Open Chrome Browser > Enter Url of the website.
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login\\r\\n");
	Thread.sleep(5000);
	WithdrawGeaterAmount4 Sc4=new WithdrawGeaterAmount4(driver);
	//Click on "Customer Login" button.
	Sc4.Customer_Login_btn().click();
	//Click on --Your Name-- dropdown button
	Sc4.YourName_drpdwn().selectByVisibleText("Ron Weasly");
	Thread.sleep(4000);
	//Click on Login button
	Sc4.Login_btn().click();
	Thread.sleep(4000);
	//Click on ""Deposite"" tile
	Sc4.deposite_title().click();
	// Enter text in amount field
	Sc4.Amount_to_be_deposited().sendKeys("200");
	//Click on "Deposit" button
	Sc4.deposite_button().click();
	System.out.println("Amount deposited=200");
	//Click on "Deposit" button
	Sc4.deposite_title().click();
	// Enter text in amount field
	Sc4.Amount_to_be_deposited().sendKeys("250");
	//Click on "Deposit" button
	Sc4.deposite_button().click();
	System.out.println("Amount deposited=250");
	//Click on "Withdrawl" tile 
	Sc4.Withdraw_title().click();
	//Enter text in amount field
	Sc4.Amount_to_be_withdrawn().sendKeys("600");
	//Click on "Withdrawl" tile 
	Sc4.Withdraw_btn().click();
	System.out.println("Amount to be withdrawn=400");
	String actual=Sc4.Validate_message().getText();
	//Validate that user gets "Transaction Failed. You can not withdraw amount more than the balance." message.
	String expected="Transaction Failed. You can not withdraw amount more than the balance.";
	Assert.assertEquals(actual,expected);
	System.out.println("message is displayed as:"+expected);
	
}
	@AfterTest
	public void aftertest() {
		driver.quit();//end all the browsers
	}

}
