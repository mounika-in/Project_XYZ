package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/Cucumber/TC_03_Toverify_userisableto_WithdrarAmunt_TC03.feature"} ,
                            glue= {"TC_03_Stepdef"} ,
                            plugin= { "pretty", "html:target/cucumber-report/cucumber.html"},
tags="@Scenario1"
                            )
public class FileRunner {
	

}
