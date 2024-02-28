package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	private static Logger log = LogManager.getLogger(HomePage.class);

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Get Started']")
	@CacheLookup
	WebElement btn_GetStarted;

	
	public void ClickGetStartedBtn() {
		btn_GetStarted.click();
	}

}