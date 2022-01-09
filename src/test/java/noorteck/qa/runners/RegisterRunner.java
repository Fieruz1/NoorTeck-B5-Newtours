package noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	
	@RunWith(Cucumber.class)
	//execute cucumber feature

	@CucumberOptions(           //feature path
	                     features = "src/test/resources/ntk/Register.feature",
	                     //we provide step def path
	                      glue= { "com.noorteck.qa.steps"}	   

			         )





public class RegisterRunner {

}
