package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.QueuePage;
import pageObjects.SignInPage;
import pageObjects.StackPage;
import utils.TestSetUp;

import org.testng.Assert;

import java.io.IOException;

public class QueuePageDefinitions {

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;
	public HomePage homePage;
	public SignInPage SgnPage;
	public QueuePage queuePage;
	public StackPage StackPg;

	public QueuePageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
		this.queuePage = setUp.pageObjectManager.getQueuePage();
		this.StackPg = setUp.pageObjectManager.getStackPg();
	}

	@When("the user clicking Getstartedbutton in homepage Queue section")
	public void the_user_clicking_getstartedbutton_in_homepage_queue_section() throws IOException {

		queuePage.clickOnQueue();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfQueue, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Implementation of Queue in Python page")
	public void the_user_navigate_to_implementation_of_queue_in_python_page() throws IOException {

		queuePage.ClicksOnImplementationofQueueinPython();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfimplementationOfQueueInPython, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Implementation using collections.deque page")
	public void the_user_navigate_to_implementation_using_collections_deque_page() throws IOException {
		queuePage.clickOnImplementionCollectionDequeue();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfImplementationUsingCollectionsDeque, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Implementation using array page")
	public void the_user_navigate_to_implementation_using_array_page() throws IOException {

		queuePage.clickOnimplementationArray();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleimplementationUsingArray, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Queue Operations page")
	public void the_user_navigate_to_queue_operations_page() throws IOException {
		queuePage.clickOnqueueOperation();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleQueueOperations, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Queue Practice Questions")
	public void the_user_navigate_to_LL_Practice_Questions_page() throws IOException {

		queuePage.clickOnqueuePracticeQuestion();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLPracticeQuestions, GetCurrentWindowTitle);

	}

	// code optimize

	@When("the user navigate to operation in {string} QueuePage")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("Implementation of Queue in Python")) {
			the_user_navigate_to_implementation_of_queue_in_python_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Implementation using collections.deque")) {
			the_user_navigate_to_implementation_using_collections_deque_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Implementation using array")) {
			the_user_navigate_to_implementation_using_array_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Queue Operations")) {
			the_user_navigate_to_queue_operations_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

//	@Then("the user validating the python code with {string}")
//	public void the_user_validating_the_python_code(String Pycode) throws IOException {
//		StackPg.RunEditorCode(Pycode);
//
//		if (Pycode.equalsIgnoreCase("print(\"Hello, World!\")")) {
//			String outPutMsg = StackPg.getOutPutMsg();
//			System.out.println(outPutMsg);
//			Assert.assertEquals(outPutMsg, setUp.baseTest.expectedOutPutMsg);
//		} else if (Pycode.equalsIgnoreCase("hello")) {
//			String alertMsg = setUp.baseTest.WebDriverManager().switchTo().alert().getText();
//			setUp.baseTest.WebDriverManager().switchTo().alert().accept();
//			Assert.assertEquals(alertMsg, "NameError: name '" + Pycode + "' is not defined on line 1");
//		}
//	}

}