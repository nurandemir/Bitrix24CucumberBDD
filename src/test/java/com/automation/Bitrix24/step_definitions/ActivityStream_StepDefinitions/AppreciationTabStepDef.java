package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.AppreciationTab;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AppreciationTabStepDef {

    AppreciationTab appreciationTab=new AppreciationTab();

    @Then("user selects a file from local disk")
    public void user_selects_a_file_from_local_disk() {
        appreciationTab.addFileFromLocal();
    }
    @Then("user add recipient")
    public void user_add_recipient() {
        appreciationTab.addRecipient();
    }

    @Then("user verifies recipient is selected")
    public void user_verifies_recipient_is_selected() {
        Assert.assertTrue(appreciationTab.verifyRecipient());
    }

    @Then("user clicks link icon in appreciation")
    public void user_clicks_link_icon_in_appreciation() {
        appreciationTab.clickLinkIcon();
    }

    @Then("user enters link info in appreciation")
    public void user_enters_link_info_in_appreciation() {
        appreciationTab.enterLink();
    }

    @Then("user verifies link is added to appreciation")
    public void user_verifies_link_is_added_to_appreciation() {
        Assert.assertTrue(appreciationTab.verifyLinkAdded());
    }

    @Then("user clicks insert video icon in appreciation")
    public void user_clicks_insert_video_icon_in_appreciation() {
       appreciationTab.clickVideoIcon();
    }

    @Then("user enters video source in appreciation")
    public void user_enters_video_source_in_appreciation() {
       appreciationTab.enterVideoLink();
    }

    @Then("user verifies video source link is added to appreciation")
    public void user_verifies_video_source_link_is_added_to_appreciation() {
       Assert.assertTrue(appreciationTab.verifyVideoLinkAdded());
    }

    @Then("user clicks quote icon in appreciation")
    public void user_clicks_quote_icon_in_appreciation() {
        appreciationTab.clickQuoteIcon();
    }

    @Then("user enters text in quote in appreciation")
    public void user_enters_text_in_quote_in_appreciation() {
        appreciationTab.insertQuote();
    }

    @Then("user verifies quote is added to appreciation")
    public void user_verifies_quote_is_added_to_appreciation() {
        Assert.assertTrue(appreciationTab.verifyQuoteAdded());
    }

    @Then("user clicks add mention icon in appreciation")
    public void user_clicks_add_mention_icon_in_appreciation() {
        appreciationTab.clickAddMentionIcon();
    }

    @Then("user clicks visual editor icon in appreciation")
    public void user_clicks_visual_editor_icon_in_appreciation() {
        appreciationTab.enableVisualEditorInAppreciation();
    }

    @Then("user verifies appreciation visual editor is visible")
    public void user_verifies_appreciation_visual_editor_is_visible() {
        Assert.assertTrue(appreciationTab.verifyVisualEditorInAppreciation());
    }

    @Then("user clicks topic icon in appreciation")
    public void user_clicks_topic_icon_in_appreciation() {

    }

    @Then("user verifies appreciation topic menu is visible")
    public void user_verifies_appreciation_topic_menu_is_visible() {

    }



    @Then("user clicks tag icon in appreciation")
    public void user_clicks_tag_icon_in_appreciation() {
        appreciationTab.clickTagIcon();
        appreciationTab.addTag();
    }

    @Then("user verifies tag is added to appreciation")
    public void user_verifies_tag_is_added_to_appreciation() {
        Assert.assertTrue(appreciationTab.verifyTagAdded());
    }

    @Then("user clicks emojis in visual editor in appreciation")
    public void user_clicks_emojis_in_visual_editor_in_appreciation() {
        appreciationTab.clickEmojiInVisualEditor();
    }

    @Then("user verifies emojis are listed in appreciation")
    public void user_verifies_emojis_are_listed_in_appreciation() {
        Assert.assertTrue(appreciationTab.verifyEmojiList());
    }








}
