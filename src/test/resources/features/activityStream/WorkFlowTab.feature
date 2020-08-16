#"8. As a user, I should be able to create and send workflows by selecting different workflows
#    from More tab under Activity Stream."

#1. User should be able to request a Leave Approval by:
#   assigning approvers and processors; selecting start and ending date from date picker; select
#   Absence type from dropdown; and entering reason for leave information.
#2. User should be able to request a Business Trip by:
#   assigning approvers, processors and entering user instructions; entering trip Title, Destination,
#   Purpose, Planned Expenses and Currency information; selecting start and ending date from date
#   picker; and attach documents.
#3. User should be able to send a General Request by entering request Title, Description, priority
#   level and Send Request To field.
#4. User should be able to send a Purchase Request by:
#   assigning approvers and processors; entering Request Title, Amount and Currency; and attach documents.
#5. User should be able to send a Expense Report by:
#   assigning approvers and accountants; entering Report Title, Amount and Currency; and attach files.
#6. User should be able to create new workflows.
#7. User should be able to access Workflows Directory page."

@workflow_tab
Feature: As a user, I should be able to create and send workflows by selecting different workflows
          from More tab under Activity Stream

  Scenario: request a Leave Approval by:
            assigning approvers and processors; selecting start and ending date from date picker;
            select Absence type from dropdown; and entering reason for leave information
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Workflow" submodule
    Then user clicks "Leave Approval" option
    Then user enters leave approval info
    Then user verifies leave approval info

  Scenario: request a Business Trip by:
        assigning approvers, processors and entering user instructions;
        entering trip Title, Destination,
        Purpose, Planned Expenses and Currency information;
        selecting start and ending date from date picker; and attach documents.
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Workflow" submodule
    Then user clicks "Business Trip" option
    Then user enters business trip info
    Then user verifies business trip info

  Scenario:Send a General Request by entering request Title, Description, priority level and Send Request To field
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Workflow" submodule
    Then user clicks "General Requests" option
    Then user enters general request info
    Then user verifies general request info

  Scenario:User should be able to send a Purchase Request by:
          assigning approvers and processors;
          entering Request Title, Amount and Currency; and attach documents
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Workflow" submodule
    Then user clicks "Purchase Request" option
    Then user enters purchase request info
    Then user verifies purchase request info

  Scenario:User should be able to send a Expense Report by:
          assigning approvers and accountants;
          entering Report Title, Amount and Currency; and attach files.
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Workflow" submodule
    Then user clicks "Expense Report" option
    Then user enters expense report info
    Then user verifies expense report info







#  Scenario:User should be able to create new workflows
#    Given user is logged in as "manager"
#    When user navigates to "More" tab
#    Then user clicks "Workflow" submodule
#    Then user clicks "Expense Report" option
#    Then user enters expense report info
#    Then user verifies expense report info   ???????

