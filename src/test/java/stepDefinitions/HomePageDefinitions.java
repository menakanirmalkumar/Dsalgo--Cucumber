package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import utils.TestSetUp;

import org.testng.Assert;



import java.io.IOException;

public class HomePageDefinitions  {

    TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public HomePage homePage;


    public HomePageDefinitions(TestSetUp setUp) throws IOException {
        this.setUp = setUp;
        this.homePage= setUp.pageObjectManager.getHomePage();
    }

    @Given("Launch the Portal Page")
    public void LaunchNavigate_to_Homepage()throws IOException {
        setUp.baseTest.WebDriverManager().get(setUp.baseTest.url);
		String GetStartedTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.startPgTitle, GetStartedTitle);

    }
    
	@When("Navigate to Home page")
	public void  Navigate_to_Homepage() throws IOException {

		homePage.ClickGetStartedBtn();
		String GetStartedTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals("NumpyNinja", GetStartedTitle);
		System.out.println("testprint");
	}

   
}