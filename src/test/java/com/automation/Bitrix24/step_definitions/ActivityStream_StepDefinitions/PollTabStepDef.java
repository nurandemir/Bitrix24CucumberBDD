package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.PollTab;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PollTabStepDef {

    PollTab pollTabPage = new PollTab();

    @Then("user clicks poll add link icon")
    public void user_clicks_poll_add_link_icon() {
        pollTabPage.clickLinkIcon();
    }

    @Then("verify that poll link is attached")
    public void verify_that_poll_link_is_attached() {
        Assert.assertTrue(pollTabPage.verifyLinkAttach());
    }



    @Then("user clicks insert poll video icon")
    public void user_clicks_insert_poll_video_icon() {
        pollTabPage.clickVideoIcon();
    }

    @Then("user enters poll video source")
    public void user_enters_poll_video_source() {
        pollTabPage.enterVideoLink();
    }

    @Then("user verifies poll video source link is added to event")
    public void user_verifies_poll_video_source_link_is_added_to_event() {
        pollTabPage.verifyVideoLinkAdded();
    }



    @Then("user clicks poll quote icon")
    public void user_clicks_poll_quote_icon() {
        pollTabPage.clickQuoteIcon();
    }

    @Then("user enters text in poll quote")
    public void user_enters_text_in_poll_quote() {
        pollTabPage.insertQuote();
    }

    @Then("user verifies poll quote is added to event")
    public void user_verifies_poll_quote_is_added_to_event() {
        Assert.assertTrue(pollTabPage.verifyQuoteAdded());
    }

    @Then("user clicks poll add mention icon")
    public void user_clicks_poll_add_mention_icon() {
        pollTabPage.clickAddMentionIcon();
    }


    @Then("user selects poll contacts from the lists provided in dropdown")
    public void user_selects_poll_contacts_from_the_lists_provided_in_dropdown() {
        Assert.assertTrue(pollTabPage.selectContactsFromList());
    }

    @Then("user enables visual editor in poll")
    public void user_enables_visual_editor_in_poll() {
        pollTabPage.enableVisualEditor3();
    }

    @Then("user verifies poll visual editor is visible")
    public void user_verifies_poll_visual_editor_is_visible() {
        Assert.assertTrue(pollTabPage.verifyVisualEditor3());
    }

    @Then("user clicks topic icon")
    public void user_clicks_topic_icon() {
        pollTabPage.enableTopicTextbox();
    }

    @Then("user verifies topic textbox is visible")
    public void user_verifies_topic_textbox_is_visible() {
        Assert.assertTrue(pollTabPage.verifyTopicTextbox());
    }

    @Then("user adds question with multiple choice")
    public void user_adds_question_with_multiple_choice() {
        pollTabPage.addPollQuestion();
    }

    @Then("user verifies multiple choice selection")
    public void user_verifies_multiple_choice_selection() {
     Assert.assertTrue(pollTabPage.verifyPollQuestion());
    }





}
