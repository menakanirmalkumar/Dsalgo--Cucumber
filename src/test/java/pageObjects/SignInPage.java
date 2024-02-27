package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseTest;



public class SignInPage {

	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[normalize-space()='Get Started']")
	@CacheLookup
	WebElement btn_GetStarted;

	@FindBy(xpath = "//input[@id='id_username']")
	@CacheLookup
	WebElement text_Username;

	@FindBy(xpath = "//input[@id='id_password']")
	@CacheLookup
	WebElement text_Password;

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	@CacheLookup
	WebElement link_Signin;

	@FindBy(xpath = "//input[@value='Login']")
	@CacheLookup
	WebElement btn_Login;

	@FindBy(xpath = "//a[normalize-space()='Sign out']")
	@CacheLookup
	WebElement link_Signout;

	@FindBy(xpath = "//div[@role='alert']")
	@CacheLookup
	WebElement txt_errorMsg;

	public void ClickGetStartedBtn() {
		btn_GetStarted.click();
	}

	public void SetUserName(String uName) {
		text_Username.clear();
		text_Username.sendKeys(uName);
	}

	public void SetPassword(String pwd) {
		text_Password.clear();
		text_Password.sendKeys(pwd);
	}

	public void ClickBtnLogin() {
		btn_Login.click();
	}

	public void ClickSignInLink() {
		link_Signin.click();
	}

	public WebElement returnSignoutElement() {
		return link_Signout;
	}

	public String getinvalidCredentialMsg() {
		return txt_errorMsg.getText().trim();
	}


}