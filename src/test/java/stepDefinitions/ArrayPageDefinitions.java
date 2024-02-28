package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.SignInPage;
import pageObjects.StackPage;
import utils.TestSetUp;

public class ArrayPageDefinitions {
	private static Logger log = LogManager.getLogger(ArrayPageDefinitions.class);

	TestSetUp setUp;
	public PageObjectManager pageObjectManager;
	public HomePage homePage;
	public SignInPage SgnPage;
	public ArrayPage arrayPage;
	public StackPage StackPg;

	public ArrayPageDefinitions(TestSetUp setUp) throws IOException {
		this.setUp = setUp;
//        this.homePage= setUp.pageObjectManager.getHomePage();
		this.StackPg = setUp.pageObjectManager.getStackPg();
		this.arrayPage = setUp.pageObjectManager.getArrayPage();
	}

	@When("the user clicking Getstartedbutton in homepage Array section")
	public void the_user_clicking_getstartedbutton_in_homepage_array_section() throws IOException {
		arrayPage.clickGetStartedArrayBtn();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleArray, GetCurrentWindowTitle);
		log.info("array Page title :--" + GetCurrentWindowTitle);
	}

	@Then("the user navigate to Arrays in Python page")
	public void the_user_navigate_to_arrays_in_python_page() throws IOException {
		arrayPage.clickOnArrayInPythonLink();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleArraysInpython, GetCurrentWindowTitle);
		log.info(" Arrays in Python page title :--" + GetCurrentWindowTitle);
	}

	@Then("the user navigate to Arrays Using List page")
	public void the_user_navigate_to_arrays_using_list_page() throws IOException {
		arrayPage.clickOnArrayUsingList();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleArraysUsingList, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Basic Operations in Lists  page")
	public void the_user_navigate_to_basic_operations_in_lists_page() throws IOException {
		arrayPage.clickOnBasicOperationsinLists();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfBasicOperationInList, GetCurrentWindowTitle);
	}

	@Then("the user navigate to Applications of Array page")
	public void the_user_navigate_to_applications_of_array_page() throws IOException {
		arrayPage.clickOnApplicationOfArray();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleOfApplicatinOfArrays, GetCurrentWindowTitle);

	}

	@Then("the user navigate to Array Practice Questions")
	public void the_user_navigate_to_practice_questions() throws IOException {

		arrayPage.clickOnpracticeQuestions();
		String GetCurrentWindowTitle = setUp.baseTest.WebDriverManager().getTitle();
		Assert.assertEquals(setUp.baseTest.titleLLPracticeQuestions, GetCurrentWindowTitle);
	}

	@Then("the user validating the python code and submit the answer")
	public void the_user_clicks_run_button_and_submit() throws IOException {
		StackPg.RunEditorCode(setUp.baseTest.Pycode);
		setUp.baseTest.WebDriverManager().switchTo().alert().accept();
		arrayPage.clickOnSubmitButton();
		arrayPage.usergetErroMessage();

	}

	@Then("the user validating the python code and submit the answer and get the ErrorMessage")
	public void the_user_validating_the_python_code_and_submit_the_answer_and_get_the_ErrorMessage()
			throws IOException {
		StackPg.RunEditorCode(setUp.baseTest.Pycode);
		setUp.baseTest.WebDriverManager().switchTo().alert().accept();
		arrayPage.clickOnSubmitButton();
		arrayPage.userGetErrormessage();
	}

	@Then("the User navigates to Search the array question")
	public void the_user_navigates_to_search_the_array_question() {
		arrayPage.clickOnSearchthearray_btn();

	}

	@Then("the User navigates to Max Consecutive Ones question")
	public void the_user_navigates_to_max_consecutive_ones_question() {
		arrayPage.clickOnMaxConsecutiveOnes_btn();

	}

	@Then("the User navigates to Find Numbers with Even Number of Digits question")
	public void the_user_navigates_to_find_numbers_with_even_number_of_digits_question() {
		arrayPage.clickOnFindNumberswithEvenNumber();

	}

	@Then("the User navigates to Squares of a Sorted Array question")
	public void the_user_navigates_to_squares_of_a_sorted_array_question() {
		arrayPage.clickOnSquaresofaSortedArray();

	}

	// codeoptimize

	@When("the user navigate to operation in {string} ArrayPage")
	public void user_enters_valid_credentials(String OperationSpecific) throws IOException {
		System.out.println("Navigate to Page:" + OperationSpecific);
		String expectedMsg = "";
		OperationSpecific = OperationSpecific.trim();
		if (OperationSpecific.equalsIgnoreCase("Arrays in Python")) {
			the_user_navigate_to_arrays_in_python_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Arrays Using List")) {
			the_user_navigate_to_arrays_using_list_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Basic Operations in Lists")) {
			the_user_navigate_to_basic_operations_in_lists_page();
			expectedMsg = "Success";
		} else if (OperationSpecific.equalsIgnoreCase("Applications of Array")) {
			the_user_navigate_to_applications_of_array_page();
			expectedMsg = "Success";
		} else {
			Assert.assertEquals(expectedMsg, "Success");
		}
	}

}