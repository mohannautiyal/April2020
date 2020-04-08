package com.home.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features", 
                 glue = "com.home",
               //  plugin= {"pretty","json:target/Cucumber.json","html:target/cucumber-jvm-reports"}

plugin= {"json:target/cucumber.json"},
dryRun = false

		)
public class cucumberTest {

}
