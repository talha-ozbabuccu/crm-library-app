package com.crm.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/resources/features",
        glue = "com/crm/library/step_definitions",
        tags = "@students"
)
public class CukesRunner {



}
