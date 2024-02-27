package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseTest;

public class QueuePage {

	public WebDriver driver;

	public QueuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='queue']")
	@CacheLookup
	WebElement queue_btn;

	@FindBy(xpath = "//a[@href='implementation-lists']")
	@CacheLookup
	WebElement ImplementationofQueueinPython;

	@FindBy(xpath = "//a[normalize-space()='Implementation using collections.deque']")
	// @FindBy(xpath="//a[@href='implementation-collections']")
	@CacheLookup
	WebElement implementionCollectionDequeue;

	@FindBy(xpath = "//a[@href='Implementation-array']")
	@CacheLookup
	WebElement implementationArray;

	@FindBy(xpath = "//a[@href='QueueOp']")
	@CacheLookup
	WebElement queueOperation;

	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	@CacheLookup
	WebElement queuePracticeQuestion;

	public void clickOnQueue() {
		queue_btn.click();
	}

	public void ClicksOnImplementationofQueueinPython() {
		ImplementationofQueueinPython.click();
	}

	public void clickOnImplementionCollectionDequeue() {
		implementionCollectionDequeue.click();
	}

	public void clickOnimplementationArray() {
		implementationArray.click();
	}

	public void clickOnqueueOperation() {
		queueOperation.click();
	}

	public void clickOnqueuePracticeQuestion() {
		queuePracticeQuestion.click();
	}

//	  public void launchPracticeQuestionValidation(String windowTitle) {
//		  
//		  queuePracticeQuestion.click();
//		  String practiceQuestionstitle = Helper.getTitle();
//			System.out.println(practiceQuestionstitle);
//			Assert.assertEquals("Practice Questions", practiceQuestionstitle);
//			
////		  queuePracticeQuestion.click();
////		  String GetCurrentWindowTitle = Helper.getTitle();
////		  Assert.assertEquals(windowTitle, GetCurrentWindowTitle);
//		  
//	  }

}