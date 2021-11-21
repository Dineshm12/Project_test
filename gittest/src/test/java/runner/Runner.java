package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/Adactin.feature",glue={"stepdefinition"},monochrome=true,strict=true,
plugin= {"html:Reports/Html","pretty",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Reports/Extent.html"})

public class Runner {
	
	

}
