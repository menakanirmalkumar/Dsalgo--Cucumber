package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.SignInPage;
import pageObjects.StackPage;
import pageObjects.TreePage;
import utils.TestSetUp;

import org.testng.Assert;

import java.io.IOException;

public class TreePageDefinitions {

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;

	public TreePage treePage;

	public TreePageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;

		this.treePage = setUp.pageObjectManager.gettreePage();
	}

	@When("the user clicking Getstartedbutton in homepage Tree section")
	public void the_user_clicking_getstartedbutton_in_homepage_tree_section() throws IOException {

		treePage.clickOntree();

		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfTree, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Overview of Trees page")
	public void the_user_navigate_to_overview_of_trees_page() throws IOException {

		treePage.clickOnOverviewOfTrees();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfOverviewOfTrees, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Terminologies page")
	public void the_user_navigate_to_terminologies_page() throws IOException {

		treePage.clicKOnTerminologies();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfTerminologies, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Types of Trees page")
	public void the_user_navigate_to_types_of_trees_page() throws IOException {

		treePage.clickOntypesoftrees();

		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfTypesOfTrees, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Tree Traversals page")
	public void the_user_navigate_to_tree_traversals_page() throws IOException {

		treePage.clickOnTreeTraversals();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOftreeTraversals, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Traversals-Illustration page")
	public void the_user_navigate_to_traversals_illustration_page() throws IOException {

		treePage.clickOnTraversalsIllustration();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOftraversalsIllustration, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Binary Trees page")
	public void the_user_navigate_to_binary_trees_page() throws IOException {

		treePage.clickOnBinarytrees();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfbinaryTrees, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Implementation of Binary Trees page")
	public void the_user_navigate_to_implementation_of_binary_trees_page() throws IOException {
		treePage.clickOnimplementationofbinarytrees();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfimplementationOfBinaryTrees, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Applications of Binary trees page")
	public void the_user_navigate_to_applications_of_binary_trees_page() throws IOException {
		treePage.clickOnapplicationsOfBinaryTrees();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfApplicationsOfBinarytrees, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Binary Search Trees page")
	public void the_user_navigate_to_binary_search_trees_page() throws IOException {
		treePage.clickOnBinarySearchTrees();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfbinarySearchTrees, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Implementation Of BST page")
	public void the_user_navigate_to_implementation_of_bst_page() throws IOException {
		treePage.clickOnimplementationOfBst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfimplementationOfBST, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Trees Practice Questions")
	public void the_user_navigate_to_Practice_Questions_page() throws IOException {
		treePage.clickOnPracticeQuestionsTree();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleDSPracticeQuestions, GetCurrentWindowTitle);
		System.out.println("Title of Practice Questions page: " + setUp.baseTest.titleDSPracticeQuestions);

	}

	// codeopt

	@When("the user navigate to operation in {string} TreePage")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("Overview of Trees")) {
			the_user_navigate_to_overview_of_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Terminologies")) {
			the_user_navigate_to_terminologies_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Types of Trees")) {
			the_user_navigate_to_types_of_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Tree Traversals")) {
			the_user_navigate_to_tree_traversals_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Binary Trees")) {
			the_user_navigate_to_binary_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Implementation of Binary Trees")) {
			the_user_navigate_to_implementation_of_binary_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Applications of Binary trees")) {
			the_user_navigate_to_applications_of_binary_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Binary Search Trees")) {
			the_user_navigate_to_binary_search_trees_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Implementation Of BST")) {
			the_user_navigate_to_implementation_of_bst_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Traversals-Illustration")) {
			the_user_navigate_to_traversals_illustration_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

}