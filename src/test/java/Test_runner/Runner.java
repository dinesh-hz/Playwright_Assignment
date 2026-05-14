package Test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/feature_files/",


glue = {"stepDefinition", "helpers"},

dryRun = false,
monochrome = true,
snippets = CucumberOptions.SnippetType.UNDERSCORE,
plugin = {"pretty"},
tags = ("@loginvalid")

)
public class Runner  extends AbstractTestNGCucumberTests{
	
	
	

}
