package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ArrayPage {
	private static Logger log = LogManager.getLogger(ArrayPage.class);

	public WebDriver driver;

	public ArrayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href ='array']")
	@CacheLookup
	 WebElement arrayStart_Btn;
	
	@FindBy(xpath="//a[@href ='arrays-in-python']")
	@CacheLookup
    WebElement arraysInPython_btn;
	
	@FindBy(xpath="//a[text()='Arrays Using List']")
	@CacheLookup
     WebElement arrayUsingList_btn;
	
	@FindBy(xpath="//a[normalize-space()='Basic Operations in Lists']")
	@CacheLookup
    WebElement BasicOperationsinLists_btn;
	
	@FindBy(xpath="//a[normalize-space()='Applications of Array']")
	@CacheLookup
    WebElement applicationOfArray_btn;
	
	//practice questions
		@FindBy(linkText="Practice Questions")
		@CacheLookup
	    WebElement practiceQuestions_btn;
		
		@FindBy(xpath="(//div[@class='list-group']/a)[1]")
		@CacheLookup
		 WebElement Searchthearray_btn;
		
		@FindBy(xpath="//input[@value='Submit']")
		@CacheLookup
		 WebElement clickSubmitQuetion_btn;
		//errormessage
		@FindBy(xpath="//pre[contains(text(),' No tests were collected')]")
		@CacheLookup
		 WebElement errorMessage;
		//error message
		@FindBy(xpath="//pre[contains(text(),'Error occurred during submission')]")
		@CacheLookup
		 WebElement searchAndMaxErrorMessage;
		
		//2.question
		@FindBy(xpath="(//div[@class='list-group']/a)[2]")
		@CacheLookup
		 WebElement MaxConsecutiveOnes_btn;
		
		@FindBy(xpath="(//div[@class='list-group']/a)[3]")
		@CacheLookup
		 WebElement FindNumberswithEvenNumber_btn;
		
		@FindBy(xpath="(//div[@class='list-group']/a)[4]")
		@CacheLookup
		 WebElement SquaresOfaSortedArray_btn;
		
		
	
	public void clickGetStartedArrayBtn() {
		arrayStart_Btn.click();
	}
	public void clickOnArrayInPythonLink() {
		arraysInPython_btn.click();
	}
	public void clickOnArrayUsingList() {
		arrayUsingList_btn.click();
	}
	public void clickOnBasicOperationsinLists() {
		BasicOperationsinLists_btn.click();
	}
	public void clickOnApplicationOfArray() {
		applicationOfArray_btn.click();
	}
	public void clickOnpracticeQuestions() {
		practiceQuestions_btn.click();
	}
	public void clickOnSearchthearray_btn() {
		Searchthearray_btn.click();
	}
	public void clickOnMaxConsecutiveOnes_btn() {
		MaxConsecutiveOnes_btn.click();
	}
	public void clickOnFindNumberswithEvenNumber() {
		FindNumberswithEvenNumber_btn.click();
	}
	public void clickOnSquaresofaSortedArray() {
		SquaresOfaSortedArray_btn.click();
	}
	public String geterrorMessage() {
		return errorMessage.getText();
		
	}
	public void usergetErroMessage() {
		Assert.assertTrue(" No tests were collected".equals(geterrorMessage()));
	}
	public String searchAndMaxErrorMessage() {
		return searchAndMaxErrorMessage.getText();
		
	}
	public void userGetErrormessage() {
		Assert.assertTrue("Error occurred during submission".equals(searchAndMaxErrorMessage()));
		
	}
	//submit button
	public void clickOnSubmitButton() {
		clickSubmitQuetion_btn.click();
	}

	
	
	
	
	
	
	

}