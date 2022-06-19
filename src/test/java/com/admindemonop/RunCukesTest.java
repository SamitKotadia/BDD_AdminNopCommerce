package com.admindemonop;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Customers.Feature",
        dryRun = false,
        strict = true,
       // glue = "step_definition",
        tags = "@scf",
        plugin = "json:target/cucumber-report/cucumber.json"
)

public class RunCukesTest {
}
