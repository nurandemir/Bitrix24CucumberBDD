package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.DesktopClient;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DesktopClientStepDef {

    DesktopClient desktopClient=new DesktopClient();

    @When("user clicks {string} icon")
    public void user_clicks_icon(String string) {
        desktopClient.clickAppIcon(string);
    }

    @Then("user confirms {string} app is downloaded")
    public void user_confirms_app_is_downloaded(String string) {
        Assert.assertTrue(desktopClient.verifyAppDownload(string));
    }

}
