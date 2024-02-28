package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinitions.ApplicationHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

	public WebDriver driver;
	public final static int TIMEOUT = 50;
	public String url;
	public String username;
	public String pwd;
	public String titleStack;
	public String startPgTitle;
	public String titleOperationStack;
	public String Tryhere;
	public String Pycode;
	public String expectedOutPutMsg;
	public String implementationheader;
	public String invalidPythonCode;
	public String appheader;
	// DataStructures
	public String titleofDataStructures;
	public String titleTimeComplexity;
	public String titleDSPracticeQuestions;
	// Graph
	public String titleOfGraph;
	public String titleOfGraph1;
	public String titleOfGraphRepresentations;

	// Tree
	public String titleOfTree;
	public String titleOfOverviewOfTrees;
	public String titleOfTerminologies;
	public String titleOfTypesOfTrees;
	public String titleOftreeTraversals;
	public String titleOftraversalsIllustration;
	public String titleOfbinaryTrees;
	public String titleOfimplementationOfBinaryTrees;
	public String titleOfApplicationsOfBinarytrees;
	public String titleOfbinarySearchTrees;
	public String titleOfimplementationOfBST;
	// Linkedlist
	public String titleLinkedList;
	public String titleLLIntroduction;
	public String titleLLCreatingLinkedLIst;
	public String titleLLTypesofLinkedList;
	public String titleLLImplementLinkedListinPython;
	public String titleLLTraversal;
	public String titleLLInsertion;
	public String titleLLDeletion;
	public String titleLLPracticeQuestions;

	public String titleOfQueue;
	public String titleOfimplementationOfQueueInPython;
	public String titleOfImplementationUsingCollectionsDeque;
	public String titleimplementationUsingArray;
	public String titleQueueOperations;
	public String titleArray;
	public String titleArraysInpython;
	public String titleArraysUsingList;
	public String titleOfBasicOperationInList;
	public String titleOfApplicatinOfArrays;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		url = prop.getProperty("QAUrl");
		username = prop.getProperty("username");
		pwd = prop.getProperty("Pwd");
		startPgTitle = prop.getProperty("GetStartPgTitle");
		// StackPage
		titleStack = prop.getProperty("Stacktitle");
		titleOperationStack = prop.getProperty("Operationtitle");
		Tryhere = prop.getProperty("Tryheretitle");
		Pycode = prop.getProperty("pythoncode");
		appheader = prop.getProperty("applicationtitle");
		expectedOutPutMsg = prop.getProperty("pythonOutPutMsg");
		implementationheader = prop.getProperty("implementationtitle");
		invalidPythonCode = prop.getProperty("invalidInputGiven");
		// Datastructure
		titleofDataStructures = prop.getProperty("dstitle");
		titleTimeComplexity = prop.getProperty("dstctitle");
		titleDSPracticeQuestions = prop.getProperty("dspracticeQ");
		// Graph
		titleOfGraph = prop.getProperty("graphTitle");
		titleOfGraph1 = prop.getProperty("graphTitle1");
		titleOfGraphRepresentations = prop.getProperty("GraphRepresentationsTitle");
		// Tree
		titleOfTree = prop.getProperty("treeTitle");
		titleOfOverviewOfTrees = prop.getProperty("overviewOfTreesTitle");
		titleOfTerminologies = prop.getProperty("terminologiesTitle");
		titleOfTypesOfTrees = prop.getProperty("typesOfTreesTitle");
		titleOftreeTraversals = prop.getProperty("treeTraversalsTitle");
		titleOftraversalsIllustration = prop.getProperty("traversalsIllustrationTitle");
		titleOfbinaryTrees = prop.getProperty("binaryTreesTitle");
		titleOfimplementationOfBinaryTrees = prop.getProperty("implementationOfBinaryTreesTitle");
		titleOfApplicationsOfBinarytrees = prop.getProperty("ApplicationsOfBinarytreesTitle");
		titleOfbinarySearchTrees = prop.getProperty("binarySearchTreesTitle");
		titleOfimplementationOfBST = prop.getProperty("implementationOfBSTTitle");

		// linkedlist

		titleLinkedList = prop.getProperty("lltitle");
		titleLLIntroduction = prop.getProperty("llintroduction");
		titleLLCreatingLinkedLIst = prop.getProperty("llCreatingLL");
		titleLLTypesofLinkedList = prop.getProperty("llTypesofLL");
		titleLLImplementLinkedListinPython = prop.getProperty("llimplementLLinPhython");
		titleLLTraversal = prop.getProperty("llTraversal");
		titleLLInsertion = prop.getProperty("llInsertion");
		titleLLDeletion = prop.getProperty("llDeletion");
		titleLLPracticeQuestions = prop.getProperty("llpracticeQ");

		// Queue
		titleOfQueue = prop.getProperty("queueTitle");
		titleOfimplementationOfQueueInPython = prop.getProperty("implementationOfQueueInPythonTitle");
		titleOfImplementationUsingCollectionsDeque = prop.getProperty("implementationUsingCollectionsDeque");
		titleimplementationUsingArray = prop.getProperty("implementationUsingArrayTitle");
		titleQueueOperations = prop.getProperty("queueOperationsTitle");

		// Array
		titleArray = prop.getProperty("arraytitle");
		titleArraysInpython = prop.getProperty("arraysInPythonTitle");
		titleArraysUsingList = prop.getProperty("arraysUsingListTitle");
		titleOfBasicOperationInList = prop.getProperty("basicOperationsInListsTitle");
		titleOfApplicatinOfArrays = prop.getProperty("applicationsOfArrayTitle");

//		Below lines for browser 
		String browser = ConfigReader.getBrowserType();
//		String browser = "Chrome";
		if (driver == null) {
			//WebDriverManager.chromedriver().clearDriverCache().setup();
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("headless");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(opt);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				EdgeOptions opt = new EdgeOptions();
				opt.addArguments("--guest");
				opt.addArguments("headless");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(opt);
			} else {
				System.out.println("No Browser is provided");
			}
			new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
//			driver.get(url);

		}
		return driver;
	}

}
