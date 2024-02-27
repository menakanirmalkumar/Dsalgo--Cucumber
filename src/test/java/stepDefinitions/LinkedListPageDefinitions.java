package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.PageObjectManager;
import pageObjects.SignInPage;
import pageObjects.StackPage;
import pageObjects.TreePage;
import utils.TestSetUp;

import org.testng.Assert;

import java.io.IOException;

public class LinkedListPageDefinitions {

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;

	public LinkedListPage llpage;

	public LinkedListPageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;

		this.llpage = setUp.pageObjectManager.gettllistpage();
	}

	@When("the user clicking Getstarted button in homepage Linked List section")
	public void the_user_clicking_getstartedbutton_in_homepage_Linked_List_section() throws IOException {
		llpage.clickonLLGetstartedbtn();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLinkedList, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Introduction in Linked List Home page")
	public void the_user_navigate_to_Introduction_from_Linked_List_Home_page() throws IOException {

		llpage.clicklinkLLIntroduction();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLIntroduction, GetCurrentWindowTitle);

	}
//	@Then("the user clicks tryhere button and navigate to try editor page")
//	public void the_user_clicks_tryhere_button_and_navigate_to_try_editor_page() {
//		llpage.Launchassessment(Tryhere);
//	}

	@Then("the user navigate to Creating Linked LIst page from Linked Lists home page")
	public void the_user_navigate_to_Creating_Linked_LIst_from_Linked_List_Home_page() throws IOException {

		llpage.clicklinkLLCreatingLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLCreatingLinkedLIst, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Types of Linked List page")
	public void the_user_navigate_to_types_of_Linked_LIst_from_Linked_List_Home_page() throws IOException {

		llpage.clicklinkLLTypesLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLTypesofLinkedList, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Implement Linked List in Python page")
	public void the_user_navigate_to_implement_Linked_LIst_from_Linked_List_Home_page() throws IOException {

		llpage.clicklinkLLImplementLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLImplementLinkedListinPython, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Traversal page")
	public void the_user_navigate_to_Traversal_from_Linked_List_Home_page() throws IOException {

		llpage.clicklink_LLTraversalLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLTraversal, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Insertion page")
	public void the_user_navigate_to_insertion_from_Linked_List_Home_page() throws IOException {
		llpage.clicklink_LLInsertionLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLInsertion, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Deletion page")
	public void the_user_navigate_to_eletion_from_Linked_List_Home_page() throws IOException {

		llpage.clicklinkLLDeletionLinkedLIst();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLDeletion, GetCurrentWindowTitle);

	}

	@Then("the user navigate to LL Practice Questions page")
	public void the_user_navigate_to_LL_Practice_Questions_page() throws IOException {

		llpage.clicklink_LLHomePracticeQ();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLPracticeQuestions, GetCurrentWindowTitle);

	}
	
	// codeopt

		@When("the user navigate to operation in {string} LLPage")
		public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
			System.out.println("Navigate to Page:" + OperationSpecific);
			String expectedMsg = "";
			OperationSpecific = OperationSpecific.trim();
			if (OperationSpecific.equalsIgnoreCase("Introduction")) {
				the_user_navigate_to_Introduction_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Creating Linked List")) {
				the_user_navigate_to_Creating_Linked_LIst_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Types of Linked List")) {
				the_user_navigate_to_types_of_Linked_LIst_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Implement Linked List")) {
				the_user_navigate_to_implement_Linked_LIst_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Traversal")) {
				the_user_navigate_to_Traversal_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Insertion")) {
				the_user_navigate_to_insertion_from_Linked_List_Home_page();
				expectedMsg = "Success";
			} else if (OperationSpecific.equalsIgnoreCase("Deletion")) {
				the_user_navigate_to_eletion_from_Linked_List_Home_page();
				expectedMsg = "Success";
			}  else {
				Assert.assertEquals(expectedMsg, "Success");
			}
		}

}