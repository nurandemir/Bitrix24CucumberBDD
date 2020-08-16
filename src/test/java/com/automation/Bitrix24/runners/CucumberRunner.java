package com.automation.Bitrix24.runners;

/**
 * @RunWith => comes from Junit. It allows to have custom test configuration

 * @CucumberOptions => stands for parameterization for test execution

glue and feature parameters are mandatory.
 * glue => path to the step definitions
 * features => specifies path to the folder/directory with feature files.

 * dryRun => stands for checking if every test step has code implementation or not
 * dryRun = false => real execution
 * dryRun = true => DON'T executes test, just checking every step is implemented or not*/

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//SAMPLE RUNNER CLASS - PLEASE MAKE SURE YOU RUN YOUR TESTS ON YOUR FEATURE FILE ==> RIGHT CLICK AND RUN !!
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/automation/Bitrix24/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@workflow_tab",
        //command + shift + f => to deep search where tags used
        plugin = {
                "html:target/default-report ",
                "json:target/cucumber1.json",//butun raporlarin kullanacagi asil report uretiyor(html report)
                "rerun:target/rerun.txt" //generate list of scenarios that failed during test execution
        }
)


public class CucumberRunner {
}
