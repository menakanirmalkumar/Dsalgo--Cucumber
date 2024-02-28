package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TreePage {
	private static Logger log = LogManager.getLogger(TreePage.class);

	public WebDriver driver;

	public TreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='tree']")
	@CacheLookup
	 WebElement tree_btn;
	
	@FindBy(xpath="//a[@href='overview-of-trees']")
	@CacheLookup
	 WebElement overviewOfTrees_btn;
	
	@FindBy(xpath="//a[@href='terminologies']")
	@CacheLookup
	 WebElement terminologies_btn;
	
	@FindBy(xpath="//a[@href='types-of-trees']")
	@CacheLookup
	 WebElement typesoftrees_btn;
	
	@FindBy(xpath="//a[@href='tree-traversals']")
	@CacheLookup
	 WebElement treeTraversals_btn;
	
	@FindBy(xpath="//a[@href='traversals-illustration']")
	@CacheLookup
	 WebElement traversalsIllustration_btn;
	
	@FindBy(xpath="//a[@href='binary-trees']")
	@CacheLookup
	 WebElement binarytrees_btn;
	
	@FindBy(xpath="//a[@href='binary-tree-traversals']")
	@CacheLookup
	 WebElement binaryTreeTraversals_btn;
	
	@FindBy(xpath="//a[@href='types-of-binary-trees']")
	@CacheLookup
	 WebElement typesOfBinaryTrees_btn;
	
	@FindBy(xpath="//a[@href='implementation-in-python']")
	@CacheLookup
	 WebElement implementationInPython_btn;
	
	@FindBy(xpath="//a[@href='implementation-of-binary-trees']")
	@CacheLookup
	 WebElement implementationofbinarytrees_btn;
	
	@FindBy(xpath="//a[@href='applications-of-binary-trees']")
	@CacheLookup
	 WebElement applicationsOfBinaryTrees_btn;
	
	@FindBy(xpath="//a[@href='binary-search-trees']")
	@CacheLookup
	 WebElement binarySearchTrees_btn;
	
	@FindBy(xpath="//a[@href='implementation-of-bst']")
	@CacheLookup
	 WebElement implementationOfBst_btn;
	
	@FindBy(linkText="Practice Questions")
	@CacheLookup
	 WebElement practiceQuestions;
	
	
	public void clickOntree() {
		tree_btn.click();
	}
	
	public void clickOnOverviewOfTrees() {
		overviewOfTrees_btn.click();
	}
	
	public void clicKOnTerminologies() {
		terminologies_btn.click();
	}
	
	
	public void clickOntypesoftrees() {
		typesoftrees_btn.click();
		
		
	}
	
	public void clickOnTreeTraversals() {
		treeTraversals_btn.click();
	}
//	public void launchTreeTraversalsPage(String windowTitle) {
//		treeTraversals_btn.click();
//		String GetCurrentWindowTitle = Helper.getTitle();
//		Assert.assertEquals(windowTitle, GetCurrentWindowTitle);	
//	}
	public void clickOnTraversalsIllustration() {
		traversalsIllustration_btn.click();
	}
	
	public void clickOnBinarytrees() {
		binarytrees_btn.click();
	}
	
	public void clickOnBinaryTreeTraversals() {
		binaryTreeTraversals_btn.click();
	}
	
	public void clickOntypesOfBinaryTrees() {
		typesOfBinaryTrees_btn.click();
	}
	
	public void clickOnimplementationInpython() {
		implementationInPython_btn.click();
	}
//	public void launchimplementationInpythonPage(String windowTitle) {
//		implementationInPython_btn.click();
//		String GetCurrentWindowTitle = Helper.getTitle();
//		Assert.assertEquals(windowTitle, GetCurrentWindowTitle);	
//	}
	public void clickOnimplementationofbinarytrees() {
		implementationofbinarytrees_btn.click();
	}
	
	public void clickOnapplicationsOfBinaryTrees() {
		applicationsOfBinaryTrees_btn.click();
	}
	
	public void clickOnBinarySearchTrees() {
		binarySearchTrees_btn.click();
	}
	
	public void clickOnimplementationOfBst() {
		implementationOfBst_btn.click();
	}
	
	public void clickOnPracticeQuestionsTree() {
		practiceQuestions.click();
	}
//	public void launchPracticeQuestionsTreePage(String windowTitle) {
//		practiceQuestions.click();
//		String GetCurrentWindowTitle = Helper.getTitle();
//		Assert.assertEquals(windowTitle, GetCurrentWindowTitle);	
//	}



}