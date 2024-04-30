package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_03_Stepdef {
	WebDriver driver;
	private TC_03_Page ab;
	
	@Given("User Opens Chrome Browser")
	public void user_opens_chrome_browser() throws InterruptedException {
		//Launching Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launching Website
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login\\r\\n");
		Thread.sleep(5000);
	}

	@When("User Click on Customer Login")
	public void user_click_on_customer_login() {
	   ab.Click_CustomerLogin();
	}

	@When("Click on YourName Dropdown")
	public void click_on_your_name_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("under YourName Dropdown Select any customer")
	public void under_your_name_dropdown_select_any_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Login Button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on Deposit title")
	public void click_on_deposit_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("enter text in amount field")
	public void enter_text_in_amount_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Deposit Button")
	public void click_on_deposit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on Withdrawl title")
	public void click_on_withdrawl_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the amount to be withdrawn in amount text field")
	public void enter_the_amount_to_be_withdrawn_in_amount_text_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Withdraw Button")
	public void click_on_withdraw_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate that user gets {string} message.")
	public void validate_that_user_gets_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate that user is able to see correct balance after withdrawl")
	public void validate_that_user_is_able_to_see_correct_balance_after_withdrawl() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
