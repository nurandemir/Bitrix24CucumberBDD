package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.LoginPage;
import com.automation.Bitrix24.pages.activityStream.TaskTabPage;
import com.automation.Bitrix24.utilities.BrowserUtils;
import com.automation.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TaskTabStepDef {

    TaskTabPage taskTabPage = new TaskTabPage();

    @Then("user creates a task with high priority")
    public void user_creates_a_task_with_high_priority() {
        taskTabPage.createTaskWithHighPriority();
    }

    @Then("user verifies high priority task is created")
    public void user_verifies_high_priority_task_is_created() {
        Assert.assertTrue(taskTabPage.verifyTaskWithHighPriority());
    }

    @Then("user enables visual editor")
    public void user_enables_visual_editor() {
        taskTabPage.enableVisualEditor();
    }

    @Then("user verifies visual editor is visible")
    public void user_verifies_visual_editor_is_visible() {
        Assert.assertTrue(taskTabPage.verifyVisualEditor());
    }

    @Then("user clicks upload file option")
    public void user_clicks_upload_file_option() {
        taskTabPage.clickUploadFile();
    }

    @Then("user verifies upload options are visible")
    public void user_verifies_upload_options_are_visible() {
        Assert.assertTrue(taskTabPage.verifyUploadOptions());
    }

    @Then("user clicks quote icon")
    public void user_clicks_quote_icon() {
        taskTabPage.clickQuoteIcon();
    }

    @Then("user verifies quote option is visible")
    public void user_verifies_quote_option_is_visible() {
        Assert.assertTrue(taskTabPage.verifyQuoteBox());
    }

    @Then("user clicks add mention icon")
    public void user_clicks_add_mention_icon() {
        taskTabPage.clickAddMentionIcon();
    }

    @Then("User select contacts from the lists provided in dropdown")
    public void user_select_contacts_from_the_lists_provided_in_dropdown() {
        Assert.assertTrue(taskTabPage.selectContactsFromList());
    }

    @Then("user clicks add link icon")
    public void user_clicks_add_link_icon() {
        taskTabPage.clickLinkIcon();
    }

    @Then("verify that link is attached")
    public void verify_that_link_is_attached() {
        Assert.assertTrue(taskTabPage.verifyLinkAttach());
    }

    @Then("user clicks checklist icon")
    public void user_clicks_checklist_icon() {
        taskTabPage.clickChecklistBtn();
    }

    @Then("user adds a checklist item by clicking on add button")
    public void user_adds_a_checklist_item_by_clicking_on_add_button() {
        taskTabPage.addChecklistItemWithAdd();
    }

    @Then("user adds a checklist item by clicking on check mark")
    public void user_adds_a_checklist_item_by_clicking_on_check_mark() {
        taskTabPage.addChecklistCheckmark();
    }

    @Then("user adds separator lines between checklist items")
    public void user_adds_separator_lines_between_checklist_items() {
        taskTabPage.addChecklistSeparator();
    }

    @Then("user deletes a checklist item by clicking on x mark")
    public void user_deletes_a_checklist_item_by_clicking_on_x_mark() {
        taskTabPage.deleteChecklist();
    }

    @Then("verify checklist items for addition")
    public void verify_checklist_items_for_addition() {
        Assert.assertTrue(taskTabPage.verifyChecklistAdditions());
    }

    @Then("verify checklist items for deletion")
    public void verify_checklist_items_for_deletion() {
        Assert.assertTrue(taskTabPage.verifyChecklistDeletion());
    }


    @Then("user clicks {string} add more link in responsible person box")
    public void user_clicks_add_more_link_in_responsible_person_box(String string) {
        taskTabPage.clickAddMoreContactBtn(string);
    }

    @Then("assign and verify employee to the task using employees and departments lists")
    public void assign_and_verify_employee_to_the_task_using_employees_and_departments_lists() {
        Assert.assertTrue(taskTabPage.addContactWithEmployeeDept());
    }

    @Then("assign and verify employee to the task using recent contact lists")
    public void assign_and_verify_employee_to_the_task_using_recent_contact_lists() {
        Assert.assertTrue(taskTabPage.addContactWithRecent());
    }

    @Then("assign and verify employees in to participants category")
    public void assign_and_verify_employees_in_to_participants_category() {
        Assert.assertTrue(taskTabPage.addContactWithParticipant());
    }

    @Then("assign and verify employees in to observers category")
    public void assign_and_verify_employees_in_to_observers_category() {
        Assert.assertTrue(taskTabPage.addContactWithObservers());
    }

    @When("user clicks on the deadline box")
    public void user_clicks_on_the_deadline_box() {
        taskTabPage.clickDeadlineBox();

    }

    @When("user selects a date")
    public void user_selects_a_date() {
        taskTabPage.selectDeadlineDate();

    }

    @Then("user verifies date is selected")
    public void user_verifies_date_is_selected() {
        Assert.assertTrue(taskTabPage.verifyDeadlineDate());

    }

    @When("user clicks on the time planning link")
    public void user_clicks_on_the_time_planning_link() {
            taskTabPage.clickTimePlanning();
    }

    @When("user selects two date")
    public void user_selects_two_date() {
        taskTabPage.selectPlanningDates();
    }

    @Then("user verifies dates are selected")
    public void user_verifies_dates_are_selected() {
        Assert.assertTrue(taskTabPage.verifyTimePlanningDates());
    }


}
