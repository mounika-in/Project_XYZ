package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_03_Page {
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
	WebElement CustomerLogin;
	
	
	
	
	
	private WebDriver driver;
	public TC_03_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_CustomerLogin() {
		CustomerLogin.click();
	}
	

}
