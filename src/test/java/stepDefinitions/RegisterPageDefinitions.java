package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.RegisterPage;
import pageObjects.SignInPage;
import utils.BaseTest;
import utils.TestSetUp;

import org.testng.Assert;


import java.io.IOException;
import java.util.Random;

public class RegisterPageDefinitions {

    TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public HomePage homePage;
    public SignInPage SgnPage;
    public RegisterPage RegPage;

    public RegisterPageDefinitions(TestSetUp setUp) throws IOException {
        this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
//        this.SgnPage= setUp.pageObjectManager.getSignInPage();
        this.RegPage= setUp.pageObjectManager.getRegPage();
    }

    
	@Given("the user is on the registration page")
	public void the_user_is_on_the_Register_page() throws IOException {

		RegPage.ClickLinkRegister();
		String GetRegistrationTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals("Registration", GetRegistrationTitle);

	}

	@When("the user newly registered {string} and {string}")
	public void the_user_entering_details(String Uname, String Pwd) {
		RegPage.SetUserName(Uname);
		RegPage.SetPassword1(Pwd);
		RegPage.SetPassword2(Pwd);
		RegPage.ClickbtnRegister();
		Assert.assertEquals(true, RegPage.returnSignoutElement().isDisplayed());

	}
	
	@When("the user newly registered")
	public void the_user_entering_details() {
		String randomNbr1 = Integer.toString(((new Random().nextInt(10))+1));
		String randomNbr2 = Integer.toString(((new Random().nextInt(55))+1));
		String Uname = "Projectpractice10"+ randomNbr1 + randomNbr2+ "gmail.com";
		RegPage.SetUserName(Uname);
		RegPage.SetPassword1("Test@123");
		RegPage.SetPassword2("Test@123");
		RegPage.ClickbtnRegister();
		Assert.assertEquals(true, RegPage.returnSignoutElement().isDisplayed());

	}


	@When("the exsisting user access the Registerpage it should display error message{string} and {string}")
	public void the_Exsistig_user_access_the_registerpage(String Uname, String Pwd) {
		RegPage.SetUserName(Uname);
		RegPage.SetPassword1(Pwd);
		RegPage.SetPassword2(Pwd);
		RegPage.ClickbtnRegister();
		Assert.assertEquals(true,
		RegPage.getErrorMsg().contains("password_mismatch:The two password fields didn’t match."));

	}
    
   
   
}