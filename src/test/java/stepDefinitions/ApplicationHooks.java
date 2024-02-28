package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestSetUp;


public class ApplicationHooks {
	private static Logger log = LogManager.getLogger(ApplicationHooks.class);

	public TestSetUp setUp;
 	

    public ApplicationHooks(TestSetUp setUp) {
        this.setUp = setUp;
    }

    @After
    public void tearDown( ) throws IOException {
        setUp.baseTest.WebDriverManager().quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {

        WebDriver driver =  setUp.baseTest.WebDriverManager();
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
            log.info("Screen shot taken");
        }

    }

}
