package setpdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    
		
		//	monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
				features = "src/test/java/features", 
				glue = "setpdefs",
				//tags = {"@WIP"}  // to run a work in progress scenario
				//tags = {"@Sanity"} // to run all the sanity scenarios
				//tags= {"@Regression or @Sanity"} // either Regression or sanity
				//tags= {"@Regression and @Sanity"} // both the tags should be there
				//tags = {"@Calculator"} // feature level tag
				//tags = {"not @WIP"} // run all the scenarios except WIP
				tags = {"@Browser and not @WIP"} // run all the browser scenarios except WIP
		
		)
public class TestRunner {

}
