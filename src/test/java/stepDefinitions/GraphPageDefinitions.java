package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.PageObjectManager;
import utils.TestSetUp;


public class GraphPageDefinitions {
	private static Logger log = LogManager.getLogger(GraphPageDefinitions.class);

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;
//    public HomePage homePage;
//    public SignInPage SgnPage;
//    public StackPage StackPg;
	public GraphPage graphPage;

	public GraphPageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
//        this.SgnPage= setUp.pageObjectManager.getSignInPage();
		this.graphPage = setUp.pageObjectManager.getgraphPage();
	}

	@When("the user clicking Getstartedbutton in homepage Graph section")
	public void the_user_clicking_getstartedbutton_in_homepage_graph_section() throws IOException {

		graphPage.clickOngraphButton();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfGraph, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Graph page")
	public void the_user_navigate_to_graph_page() throws IOException {

		graphPage.clickOnGraphLink();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfGraph1, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Graph Representations page")
	public void the_user_navigate_to_graph_representations_page() throws IOException {

		graphPage.clickOnGraphRepresentation();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfGraphRepresentations, GetCurrentWindowTitle);
	}

	@Then("User dont have Practice Questions on practice page")
	public void user_dont_have_graph_practice_questions_on_practice_page() {
		System.out.println("User dont have practice questions");
	}

	@Then("the user navigate to Graph Practice Questions")
	public void the_user_navigate_to_Practice_Questions_page() throws IOException {
		graphPage.clickOngraphPracticeQuestion();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleDSPracticeQuestions, GetCurrentWindowTitle);
		System.out.println("Title of Practice Questions page: " + setUp.baseTest.titleDSPracticeQuestions);

	}

	// codeoptim

	@When("the user navigate to operation in {string} GraphPage")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("Graph")) {
			the_user_navigate_to_graph_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Graph Representations")) {
			the_user_navigate_to_graph_representations_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

}