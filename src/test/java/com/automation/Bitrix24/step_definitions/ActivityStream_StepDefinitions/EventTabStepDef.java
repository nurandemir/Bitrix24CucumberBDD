package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.LoginPage;
import com.automation.Bitrix24.pages.activityStream.EventTab;
import com.automation.Bitrix24.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class EventTabStepDef {

    EventTab eventTabPage = new EventTab();

    @Then("user clicks {string} upload file")
    public void user_clicks_upload_file(String string) {
        eventTabPage.clickUploadIcon(string);
    }

    @Then("user selects a file from {string} Bitrix24")
    public void user_selects_a_file_from_Bitrix24(String string) {
        eventTabPage.selectFileFromBitrix(string);
    }

    @Then("user verifies file is added")
    public void user_verifies_file_is_added() {
        Assert.assertTrue(eventTabPage.verifyFileSelected());
    }

    @Then("user clicks link icon")
    public void user_clicks_link_icon() {

        eventTabPage.clickLinkIcon();
    }

    @Then("user enters link info")
    public void user_enters_link_info() {
        eventTabPage.enterLink();
    }

    @Then("user verifies link is added to event")
    public void user_verifies_link_is_added_to_event() {
        Assert.assertTrue(eventTabPage.verifyLinkAdded());
    }

    @Then("user clicks insert video icon")
    public void user_clicks_insert_video_icon() {
        eventTabPage.clickVideoIcon();
    }

    @Then("user enters video source")
    public void user_enters_video_source() {
        eventTabPage.enterVideoLink();
    }

    @Then("user verifies video source link is added to event")
    public void user_verifies_video_source_link_is_added_to_event() {
        eventTabPage.verifyVideoLinkAdded();
    }

    @Then("user enters text in quote")
    public void user_enters_text_in_quote() {
        eventTabPage.insertQuote();
    }

    @Then("user verifies quote is added to event")
    public void user_verifies_quote_is_added_to_event() {
        Assert.assertTrue(eventTabPage.verifyQuoteAdded());
    }

    @Then("user enables visual editor in event")
    public void user_enables_visual_editor_in_event() {
        eventTabPage.enableVisualEditor2();
    }

    @Then("user verifies event visual editor is visible")
    public void user_verifies_event_visual_editor_is_visible() {
        Assert.assertTrue(eventTabPage.verifyVisualEditor2());
    }

    @Then("user set reminder time")
    public void user_set_reminder_time() {
        eventTabPage.addReminder();
    }

    @Then("user verifies reminder is created")
    public void user_verifies_reminder_is_created() {
        Assert.assertTrue(eventTabPage.verifyReminder());
    }

    @Then("user selects one event location")
    public void user_selects_one_event_location() {
        eventTabPage.selectEventLocation();
    }

    @Then("user verifies event location is selected")
    public void user_verifies_event_location_is_selected() {
        Assert.assertTrue(eventTabPage.verifyEventlocation());

    }

    @Then("user add attendees")
    public void user_add_attendees() {
        eventTabPage.addAttendee();
    }

    @Then("user verifies attendee is selected")
    public void user_verifies_attendee_is_selected() {
        Assert.assertEquals(eventTabPage.verifyAttendeeAdded(), 2);
    }

    @Then("user add more event details")
    public void user_add_more_event_details() {
        eventTabPage.addMoreEventDetails();
    }

    @Then("user verifies event details")
    public void user_verifies_event_details() {
        Assert.assertTrue(eventTabPage.verifyMoreEventDetails());
    }












}
