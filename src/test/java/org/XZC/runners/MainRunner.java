package org.XZC.runners;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;     // DO NOT USE THIS ..... THIS FUCKING THING WAS CAUSING THE ISSUE ....
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) // Comment this out for testng

@CucumberOptions (
        features = {"/Users/timmanas/ProgrammingProjects/Java/BaseBoilerPlateWebUIAutomation/CucumberFramework/src/test/java/CucumberFramework/featureFiles/"},
        glue = {"org.XZC.steps"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        }
)

public class MainRunner extends AbstractTestNGCucumberTests {
}

