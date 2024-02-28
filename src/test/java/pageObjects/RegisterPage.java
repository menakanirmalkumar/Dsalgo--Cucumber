package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	private static Logger log = LogManager.getLogger(RegisterPage.class);

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[normalize-space()='Register']")
	@CacheLookup
	WebElement link_Register;

	@FindBy(xpath = "//input[@id='id_username']")
	@CacheLookup
	WebElement text_Username;

	@FindBy(xpath = "//input[@id='id_password1']")
	@CacheLookup
	WebElement text_Password1;

	@FindBy(xpath = "//input[@id='id_password2']")
	@CacheLookup
	WebElement text_Password2;

	@FindBy(xpath = "//input[@value='Register']")
	@CacheLookup
	WebElement btn_Register;

	/*@FindBy(partialLinkText = ("Signout"))
	@CacheLookup
	WebElement link_Signout;*/

	@FindBy(xpath = "//a[normalize-space()='Sign out']")
	@CacheLookup
	WebElement link_Signout;
	
	@FindBy(xpath= "// div[@role='alert']")
	@CacheLookup
	WebElement text_Errormsg;
	
	
	public void SetUserName(String username) {
		text_Username.clear();
		text_Username.sendKeys(username);
	}

	public void SetPassword1(String password1) {
		text_Password1.clear();
		text_Password1.sendKeys(password1);
	}

	public void SetPassword2(String password2) {
		text_Password2.clear();
		text_Password2.sendKeys(password2);
	}

	public void ClickbtnRegister() {
		btn_Register.click();
	}
	 public WebElement returnSignoutElement() {
		    return link_Signout; 
		  }

	public void ClickLinkRegister() {
		link_Register.click();
	}

	public void ClickSignoutlink() {
		link_Signout.click();
	}
	
	public String getErrorMsg() {
	return text_Errormsg.getText().trim();
	}


}