package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.SignInPage;
import utils.TestSetUp;

import org.testng.Assert;


import java.io.IOException;

public class SignInPageDefinitions{

    TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public HomePage homePage;
    public SignInPage SgnPage;

    public SignInPageDefinitions(TestSetUp setUp) throws IOException {
        this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
        this.SgnPage= setUp.pageObjectManager.getSignInPage();
    }

    
    @Given("the user is on the Signin page")
	public void the_user_is_on_the_signin_page() throws IOException {
		SgnPage.ClickSignInLink();
		String GetLoginTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals("Login", GetLoginTitle);

	}

	@When("the user enters valid credentials")
	public void user_enters_valid_credentials() {
		SgnPage.SetUserName(setUp.baseTest.username);
		SgnPage.SetPassword(setUp.baseTest.pwd);
	}
	
	@When("the user enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials(String Uname, String Pwd) {
		System.out.println("Enter UserName:" + Uname);
		SgnPage.SetUserName(Uname);
		System.out.println("Enter Password:" + Pwd);
		SgnPage.SetPassword(Pwd);
	}

	@Then("the user signin Successfully")
	public void the_user_signin_successfully() {
		SgnPage.ClickBtnLogin();
		Assert.assertEquals(true, SgnPage.returnSignoutElement().isDisplayed());
	}

	
	@Then("the user not successfully signin")
	public void the_user_not_successfully_signin() {
		SgnPage.ClickBtnLogin();
		Assert.assertEquals(true, SgnPage.getinvalidCredentialMsg().contains("Invalid Username and Password"));
		System.out.println(SgnPage.getinvalidCredentialMsg());
	}
	
	@Then ("user is successfully signin")
	public void SignMethod() throws IOException {
		the_user_is_on_the_signin_page();
		user_enters_valid_credentials();
		the_user_signin_successfully();
	}
   
}