package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;









public class LinkedListPage {

	public WebDriver driver;

	public LinkedListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
@FindBy(xpath= "//a[@href='linked-list']")
@CacheLookup
WebElement btn_LLGetStarted;

@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
@CacheLookup

WebElement link_LLIntroduction;

@FindBy(xpath ="/html/body/div[2]/div/div[2]/a")
@CacheLookup

WebElement btn_LLIntroductionTryhere;

@FindBy(xpath ="//*[@id=\\\"answer_form\\\"]/div/div/div[1]/textarea")
@CacheLookup

WebElement btn_LLIntroductionEditor;

@FindBy(xpath="//*[@id=\\\"answer_form\\\"]/button")
@CacheLookup

WebElement btn_LLIntroductionRun;

@FindBy(xpath="/html/body/div[2]/ul[2]/a")
@CacheLookup
WebElement link_LLCreatingLinkedLIst;


@FindBy(xpath="/html/body/div[2]/ul[3]/a")
@CacheLookup
WebElement link_LLTypesLinkedLIst;

@FindBy(xpath="/html/body/div[2]/ul[4]/a")
@CacheLookup
WebElement link_LLImplementLinkedLIst;

@FindBy(xpath="/html/body/div[2]/ul[5]/a")
@CacheLookup
WebElement link_LLTraversalLinkedLIst;

@FindBy(xpath="/html/body/div[2]/ul[6]/a")
@CacheLookup
WebElement link_LLInsertionLinkedLIst;

@FindBy(xpath="/html/body/div[2]/ul[7]/a")
@CacheLookup
WebElement link_LLDeletionLinkedLIst;

@FindBy(xpath ="//a[@href='/tryEditor']")
@CacheLookup

WebElement btn_CLLTryhere;

@FindBy(xpath="//*[@id=\"answer_form\"]/button")
@CacheLookup

WebElement btn_CLLRun;
	
@FindBy(xpath="//a[@href='/linked-list/practice']")
@CacheLookup

WebElement link_LLHomePracticeQ;


public void clickonLLGetstartedbtn() {
	btn_LLGetStarted.click();	
}
public void clicklinkLLIntroduction() {
	link_LLIntroduction.click();
}

public void clicklinkLLCreatingLinkedLIst() {
	link_LLCreatingLinkedLIst.click();
}


public void clicklinkLLTypesLinkedLIst() {
	link_LLTypesLinkedLIst.click();	
}

public void clicklinkLLImplementLinkedLIst() {
link_LLImplementLinkedLIst.click();
}

public void clicklink_LLTraversalLinkedLIst() { 
	link_LLTraversalLinkedLIst.click();
}

public void clicklink_LLInsertionLinkedLIst() {
	link_LLInsertionLinkedLIst.click();
}

public void clicklinkLLDeletionLinkedLIst()
{
	link_LLDeletionLinkedLIst.click();
}

public void clickbtn_CLLTryhere() {
	btn_CLLTryhere.click();
}


public void clicklink_LLHomePracticeQ() {
	link_LLHomePracticeQ.click();	
}

}