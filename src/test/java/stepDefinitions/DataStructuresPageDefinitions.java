package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructuresPage;
import pageObjects.PageObjectManager;
import utils.TestSetUp;


public class DataStructuresPageDefinitions {
	private static Logger log = LogManager.getLogger(DataStructuresPageDefinitions.class);

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;

	public DataStructuresPage Dspage;

	public DataStructuresPageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;
		this.Dspage = setUp.pageObjectManager.getDspage();
//        this.SgnPage= setUp.pageObjectManager.getSignInPage();
//        this.SgnPage= setUp.pageObjectManager.getSignInPage();
	}

	@When("the user clicking Getstarted button in homepage Data Structures section")
	public void the_user_clicking_getstartedbutton_in_homepage_Data_Structures_section() throws IOException {
		Dspage.ClickDSGetStartedBtn();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleofDataStructures, GetCurrentWindowTitle);
		System.out.println("Title of the page is: " + setUp.baseTest.titleofDataStructures);
	}

	@Then("the user navigate to Time Complexity from DS Home page")
	public void the_user_navigate_to_Time_Complexity_from_DS_Home_page() throws IOException {

		Dspage.ClickDSTimeComplexity();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleTimeComplexity, GetCurrentWindowTitle);
		System.out.println("Title of the page is: " + setUp.baseTest.titleTimeComplexity);

	}

	@Then("the user clicks on tryhere button and navigate to try editor page")
	public void the_user_clicks_tryhere_button_and_navigate_to_try_editor_page() throws IOException {
		Dspage.ClickDSTryhere();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.Tryhere, GetCurrentWindowTitle);
		System.out.println("Clicked on button Try here with page title: " + setUp.baseTest.Tryhere + " Successfully");

	}

	@Then("the user navigate to Practice Questions page")
	public void the_user_navigate_to_Practice_Questions_page() throws IOException {
		Dspage.ClickDSHomePracticeQLink();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleDSPracticeQuestions, GetCurrentWindowTitle);
		System.out.println("Title of Practice Questions page: " + setUp.baseTest.titleDSPracticeQuestions);

	}

	// codeopt

	@When("the user navigate to operation in {string} DSPage")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("Time Complexity")) {
			the_user_navigate_to_Time_Complexity_from_DS_Home_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

}
