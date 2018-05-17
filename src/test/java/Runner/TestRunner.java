package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		 format = {"pretty", "html:target/html"},
		features= {"E:\\MavenDec\\RestAssured\\src\\test\\resources\\Features\\prop.feature"},
	glue= {"login"}
	 
	
)


public class TestRunner {

}
