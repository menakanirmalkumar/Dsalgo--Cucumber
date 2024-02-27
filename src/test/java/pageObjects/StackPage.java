package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StackPage {

	public WebDriver driver;

	public StackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='stack']")
	@CacheLookup
	WebElement btn_GetStarted;

	@FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	@CacheLookup
	WebElement link_operations_in_stack;

	@FindBy(xpath = "//a[normalize-space()='Try here>>>']")
	@CacheLookup
	WebElement btn_Tryhere;

//	@FindBy(xpath = "//textarea[@autocorrect='off']")
//	@CacheLookup
//	WebElement Edit_box;
	
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	@CacheLookup
	WebElement Edit_box;
	
	

	@FindBy(xpath = "//button[normalize-space()='Run']")
	@CacheLookup
	WebElement btn_Run;

	@FindBy(xpath = "//pre[@id='output']")
	@CacheLookup
	WebElement text_Output;

	@FindBy(xpath = "//a[normalize-space()='Implementation']")
	@CacheLookup
	WebElement link_Implementation;

	@FindBy(xpath = "//a[normalize-space()='Applications']")
	@CacheLookup
	WebElement link_Application;

	public void ClickGetStartedBtn() {
		btn_GetStarted.click();
	}

	public void SetValueInEditor(String text) {
		Edit_box.sendKeys(text);
	}
	
	public void ClickEditorBox() {
		Edit_box.click();
	}

	public void ClickRunBtn() {
		btn_Run.click();
	}

	public String getOutPutMsg() {
		return text_Output.getText().trim();
	}

	public void Launchstackpage(String windowTitle) {
		btn_GetStarted.click();
		String GetCurrentWindowTitle = driver.getTitle();
		Assert.assertEquals(windowTitle, GetCurrentWindowTitle);
	}

	public void Clicklinkoperationsinstack() {
		link_operations_in_stack.click();

	}

	public void ClickTryHereBtn() {
		btn_Tryhere.click();

	}

	public void Launchassessment(String windowTitle) {
		btn_Tryhere.click();
		String GetCurrentWindowTitle = driver.getTitle();
		;
		Assert.assertEquals(windowTitle, GetCurrentWindowTitle);
	}

	public void RunEditorCode(String Text) {
		SetValueInEditor(Text);
		btn_Run.click();
	}

	public void Launchimplementation() {
		link_Implementation.click();

	}

	public void ClickApplicationlink() {
		link_Application.click();

	}

}