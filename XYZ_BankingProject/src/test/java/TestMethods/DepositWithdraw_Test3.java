package TestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_XYZBanking.DepositWithdraw3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DepositWithdraw_Test3  {
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
	public void testcase3() throws InterruptedException {
		
		DepositWithdraw3 Sc3=new DepositWithdraw3(driver);
		//Click on "Customer Login" button.
		Sc3.Customer_Login_btn().click();
		//Click on --Your Name-- dropdown button under "Your Name:" > Select any customer
		Sc3.CustomerName_drpdwn().selectByVisibleText("Ron Weasly");
		Thread.sleep(4000);
		// Click on Login button
		Sc3.Login_btn();
		Thread.sleep(4000);
		//Click on "Deposite" tile 
		Sc3.deposite_title().click();
		//Enter text in amount field
		Sc3.Amount_to_be_deposited().sendKeys("100");
		//Click on "Deposit" button
		Sc3.deposite_btn().click();
		System.out.println("Amount deposited=100");
		////Navigate back to Click on "Deposite" tile
		Sc3.deposite_title().click();
		// Enter text in amount field
		Sc3.Amount_to_be_deposited().sendKeys("150");
		//Click on "Deposit" button
		Sc3.deposite_btn().click();
		System.out.println("Amount deposited=150");
		//Click on "Withdrawl" tile
		Sc3.Withdraw_title();
		Thread.sleep(3000);
		//Enter the amount to be withdrawn in amount text field
		Sc3.Amount_to_be_withdrawn().sendKeys("20");
		//Click on "Withdraw".
		Sc3.Withdraw_btn().click();
		System.out.println("Amount withdrawn=20");
		//Validate that user gets "Transaction successful" message.
		String actual=Sc3.Validate_msg().getText();
		String expected1="Transaction successful";
		Assert.assertEquals(actual,expected1);
		equals("message is displayed: "+expected1);
		String ActualStr=Sc3.Validate_balance().getText();
		int actualval=Integer.parseInt(ActualStr);
	    //SearchContext actual=scenario2.Validate_balance();
		int expected2=230;
		//Validate that user is able to see correct balance after withdrawl.
		Assert.assertEquals(actualval, expected2);
		System.out.println("balance is 230");
	}
	@AfterTest
	public void aftertest() {
		driver.quit();//end all the browsers
	}

}
