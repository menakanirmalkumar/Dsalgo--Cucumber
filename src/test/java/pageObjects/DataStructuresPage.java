package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import utils.BaseTest;



public class DataStructuresPage {

	public WebDriver driver;

	public DataStructuresPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/h5")
	@CacheLookup
	WebElement text_DStitle;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/a")
	@CacheLookup
	WebElement btn_DSGetStarted;
	
	@FindBy(xpath="/html/body/div[2]/h4")
	@CacheLookup
	WebElement text_DSHometitle;
	
	@FindBy(xpath ="/html/body/div[2]/ul/a")
	@CacheLookup
	WebElement link_DSTimeComplexity;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/strong/p")
	@CacheLookup
	WebElement text_TCHometitle;
	
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement btn_DSTryhere;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")
	@CacheLookup
	WebElement editor_TCText;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/button")
	@CacheLookup
	WebElement btn_DSRun;
	
	@FindBy(xpath = "//*[@id=\"output\"]")
	@CacheLookup
	WebElement text_Output;
	
	@FindBy(xpath="//a[@href='/data-structures-introduction/practice']")
	@CacheLookup
	WebElement link_DSHomePracticeQ;
	
	public void FindDStitle() {
		String Dstext=text_DStitle.getText ();
		System.out.println("DS Module is found successfylly as:" +Dstext);
	}
	public void ClickDSGetStartedBtn() {
		btn_DSGetStarted.click();
	}
	public void ClickDSTimeComplexity() {
		link_DSTimeComplexity.click();
	}
	
	public void ClickDSTryhere() {
		btn_DSTryhere.click();
	}
		
	public void ClickDSHomePracticeQLink() {
		link_DSHomePracticeQ.click();
	}
	public void SetValueInEditor(String text) {
			editor_TCText.sendKeys(text);
	}
		
	private  void ClickDSRun() {
		btn_DSRun.click();
	}
	
	public String getOutPutMsg() {
		return text_Output.getText().trim();
	}

	
		
	public void RunEditorCode(String Text) {
		SetValueInEditor(Text);
		btn_DSRun.click();
	}

	
	


}