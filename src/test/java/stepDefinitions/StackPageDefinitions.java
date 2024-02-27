package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.SignInPage;
import pageObjects.StackPage;
import utils.TestSetUp;

import org.testng.Assert;
import org.testng.log4testng.Logger;

import java.io.IOException;

public class StackPageDefinitions {

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;
	public HomePage homePage;
	public SignInPage SgnPage;
	public StackPage StackPg;
	static Logger log = Logger.getLogger(StackPageDefinitions.class);

	public StackPageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
//        this.SgnPage= setUp.pageObjectManager.getSignInPage();
		this.StackPg = setUp.pageObjectManager.getStackPg();
	}

	@When("the user clicking Getstartedbutton in homepage stack section")
	public void the_user_clicking_getstartedbutton_in_homepage_stack_section() throws IOException {
		StackPg.ClickGetStartedBtn();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleStack, GetCurrentWindowTitle);
	}

	@Then("the user navigate to operation in stack page")
	public void the_user_navigate_to_operationin_stack_page() throws IOException {
		StackPg.Clicklinkoperationsinstack();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOperationStack, GetCurrentWindowTitle);
	}

	@Then("the user clicks tryhere button and navigate to try editor page")
	public void the_user_clicks_tryhere_button_and_navigate_to_try_editor_page() throws IOException {
		StackPg.ClickTryHereBtn();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.Tryhere, GetCurrentWindowTitle);
	}

//	@Then("^the user validating the python code with valid input$")
//	public void the_user_validating_the_python_code_ValidInput() {
//		StackPg.RunEditorCode(setUp.baseTest.Pycode);
//		String outPutMsg = StackPg.getOutPutMsg();
//		System.out.println(outPutMsg);
//		Assert.assertEquals(outPutMsg, setUp.baseTest.expectedOutPutMsg);
//	}

	@Then("^the user navigate to implementation page$")
	public void the_user_navigate_to_implementation_page() throws IOException {

		StackPg.Launchimplementation();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.implementationheader, GetCurrentWindowTitle);

	}

//	@Then("^the user validating the python code with invalid input$")
//	public void the_user_validating_the_python_code_InvalidInput() throws IOException {
//		StackPg.RunEditorCode(setUp.baseTest.invalidPythonCode);
//		String alertMsg = setUp.baseTest.WebDriverManager().switchTo().alert().getText();
//		setUp.baseTest.WebDriverManager().switchTo().alert().accept();
//		Assert.assertEquals(alertMsg,
//				"NameError: name '" + setUp.baseTest.invalidPythonCode + "' is not defined on line 1");
//
//	}

	@Then("^the user navigate to Applications page$")
	public void the_user_navigate_to_Applications_page() throws IOException {

		StackPg.ClickApplicationlink();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.appheader, GetCurrentWindowTitle);

	}

//	/// code optimize

	@When("the user navigate to operation in {string} page")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("stack")) {
			the_user_navigate_to_operationin_stack_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("implementation")) {
			the_user_navigate_to_implementation_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Applications")) {
			the_user_navigate_to_Applications_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

	@Then("the user validating the python code with {string}")
	public void the_user_validating_the_python_code(String Pycode) throws IOException {
		StackPg.RunEditorCode(Pycode);

		if (Pycode.equalsIgnoreCase("print(\"Hello, World!\")")) {
			String outPutMsg = StackPg.getOutPutMsg();
			System.out.println(outPutMsg);
			Assert.assertEquals(outPutMsg, setUp.baseTest.expectedOutPutMsg);
		} else if (Pycode.equalsIgnoreCase("hello")) {
			String alertMsg = setUp.baseTest.WebDriverManager().switchTo().alert().getText();
			setUp.baseTest.WebDriverManager().switchTo().alert().accept();
			Assert.assertEquals(alertMsg, "NameError: name '" + Pycode + "' is not defined on line 1");
		}
	}

}