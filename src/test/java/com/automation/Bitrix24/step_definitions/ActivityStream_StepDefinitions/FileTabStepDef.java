package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.FileTab;
import io.cucumber.java.en.Then;

public class FileTabStepDef {

    FileTab filetab=new FileTab();

    @Then("user clicks {string} submodule")
    public void user_clicks_submodule(String string) {
        filetab.navigateTo(string);

    }



}
