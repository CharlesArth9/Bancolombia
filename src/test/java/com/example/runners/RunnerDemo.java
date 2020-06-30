package com.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/bancolombia.feature"},
        glue = {"com.example/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
//        plugin = {"pretty", "html:target/cucumber-reports"},
//        tags =  {"@"}
)
public class RunnerDemo {
}
