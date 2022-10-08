package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/MyStore.feature",glue= {"StepsDefinition"},
monochrome=true,
//tags="@My_Store"
tags="@Scenario_1"
//tags="@Scenario_2"
//tags="@Scenario_3"
		)

public class MyStore_TestRunner {

}