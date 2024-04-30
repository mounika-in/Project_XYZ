package Pagefactory_XYZBanking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagefactory_XYZBanking.TC_01_To_verifyuser_isable_tocreate_newcustomer_addaccount_and_deleteaccount;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_TC_01andTC_02 {
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
	
	@Test(priority=0, enabled= false)
	public void BankmanagerLogin() {
	TC_01_To_verifyuser_isable_tocreate_newcustomer_addaccount_and_deleteaccount Lp = new TC_01_To_verifyuser_isable_tocreate_newcustomer_addaccount_and_deleteaccount(driver);
	Lp.ClickBankmanagerLogin();
	}
	
	
	@Test(priority=1, enabled= true)
	public void CustomerLogin() {
		TC_02_Toverify_useris_ableto_DepositandReset_Balance ab= new TC_02_Toverify_useris_ableto_DepositandReset_Balance(driver);
		ab.ClickCustomerLogin();
	}
	
	
	
	
	
	@AfterTest
	   public void aftertest() {
			driver.quit();
	   }

}

   

