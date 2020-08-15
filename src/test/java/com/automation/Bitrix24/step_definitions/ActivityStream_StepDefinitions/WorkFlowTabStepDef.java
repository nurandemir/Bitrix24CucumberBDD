package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.WorkFlowTab;
import io.cucumber.java.en.Then;

public class WorkFlowTabStepDef {

    WorkFlowTab workflowTab=new WorkFlowTab();

    @Then("user clicks {string} option")
    public void user_clicks_option(String string) {
        workflowTab.navigateTo(string);
    }

    @Then("user enters leave approval info")
    public void user_enters_leave_approval_info() {
        workflowTab.enterLeaveApprovalInfo();
    }

    @Then("user verifies leave approval info")
    public void user_verifies_leave_approval_info() {
//?????
    }

    @Then("user enters business trip info")
    public void user_enters_business_trip_info() {
        workflowTab.enterBusinessTriplInfo();
    }

    @Then("user verifies business trip info")
    public void user_verifies_business_trip_info() {
        ///?????
    }

    @Then("user enters general request info")
    public void user_enters_general_request_info() {
        workflowTab.enterGeneralRequest();
    }

    @Then("user verifies general request info")
    public void user_verifies_general_request_info() {
        // ???
    }

    @Then("user enters purchase request info")
    public void user_enters_purchase_request_info() {
        workflowTab.enterPurchaseRequestInfo();

    }

    @Then("user verifies purchase request info")
    public void user_verifies_purchase_request_info() {

        //????
    }

    @Then("user enters expense report info")
    public void user_enters_expense_report_info() {
        workflowTab.enterExpenseReportInfo();
    }

    @Then("user verifies expense report info")
    public void user_verifies_expense_report_info() {

    }



}
