package runner;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ConfigReader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


@CucumberOptions(tags = "", features = "src/test/resources/features", glue = "stepDefinitions", plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber/cucumber.json",
		"html:target/cucumber-html-report", "pretty", "html:target/HtmlReports.html" })
public class CucumberRunner  extends AbstractTestNGCucumberTests {

   @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
   
  
   @BeforeClass
	@Parameters({ "browser" })

	public void defineBrowser(String browser) {

		ConfigReader.setBrowserType(browser);


	}

}
