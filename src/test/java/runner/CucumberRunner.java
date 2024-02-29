package runner;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ConfigReader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

@CucumberOptions(tags = "", features = "src/test/resources/features", glue = "stepDefinitions", plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "json:target/cucumber-reports/cucumber.json",
		"html:target/CucumberTestReport.html", "junit:target/report.html" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

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
