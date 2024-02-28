package pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {

    public HomePage homePage;
    public SignInPage SgnPage;
    public RegisterPage RegPage;
    public StackPage StackPg;
    public DataStructuresPage Dspage;
    public GraphPage graphPage;
    public TreePage treePage;
    public LinkedListPage llPage;
    public QueuePage queuePage;
    public ArrayPage arrayPage;
    public WebDriver driver;


    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }


    public HomePage getHomePage()
    {
        homePage = new HomePage(driver);
        return homePage;
    }
    
    public SignInPage getSignInPage()
    {
    	SgnPage = new SignInPage(driver);
        return SgnPage;
    }

    
    public RegisterPage getRegPage()
    {
    	RegPage = new RegisterPage(driver);
        return RegPage;
    }

    public DataStructuresPage getDspage()
    {
    	Dspage = new DataStructuresPage(driver);
        return Dspage;
    }

    public GraphPage getgraphPage()
    {
    	graphPage = new GraphPage(driver);
        return graphPage;
    }

    public StackPage getStackPg()
    {
    	StackPg = new StackPage(driver);
        return StackPg;
    }
    public  TreePage gettreePage()
    {
    	treePage = new TreePage(driver);
        return treePage;
    }

    public  LinkedListPage gettllistpage()
    {
    	llPage = new LinkedListPage(driver);
        return llPage;
    }
    
    public  QueuePage getQueuePage()
    {
    	queuePage = new QueuePage(driver);
        return queuePage;
    }
    
    public  ArrayPage getArrayPage()
    {
    	arrayPage = new ArrayPage(driver);
        return arrayPage;
    }
    
  
}



