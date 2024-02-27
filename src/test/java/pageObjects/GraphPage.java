package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class GraphPage {

	public WebDriver driver;

	public GraphPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='graph']")
	@CacheLookup
 WebElement graph_btn;
	
	@FindBy(linkText="Graph")
	@CacheLookup
	 WebElement graphSection_btn;
	
	
	@FindBy(linkText="Graph Representations")
	@CacheLookup
	 WebElement graphRepresentation_btn;
	
	@FindBy(xpath="//a[@href='/graph/practice']")
	@CacheLookup
     WebElement graphPracticeQuestion_btn;
	
	public void clickOngraphButton()
	{
		graph_btn.click();
	}
	
	public void clickOnGraphLink() {
		graphSection_btn.click();
	}
	
	public void clickOnGraphRepresentation() {
		graphRepresentation_btn.click();
	}
	
	public void clickOngraphPracticeQuestion() {
		graphPracticeQuestion_btn.click();
	}
//	public void validatepracticeGraphQuestions() {
//		graphPracticeQuestion_btn.click();
//		
//		String GetCurrentWindowTitle = Helper.getTitle();
//		System.out.println(GetCurrentWindowTitle);
//		Assert.assertEquals("Practice Questions", GetCurrentWindowTitle);
//
//
//	}
//	

}