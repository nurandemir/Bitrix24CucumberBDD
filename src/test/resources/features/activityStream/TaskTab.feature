#US:2. As a user, I should be able to assign tasks by clicking on Task tab under Active Stream."
#
#1. User should be able to click on ""High Priority"" checkbox to set the current task to a top priority task.
#2. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
#3. User should be able to click on upload files icon to upload files and pictures from local disks,
  # download from external drive, select documents from bitrix24, and create files to upload.
#4. User should be able to create a quote by clicking on the Comma icon.
#5. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
#6. User should be able to attach link by clicking on the link icon.
#7. User should be able to click on ""Checklist"" to create checklists items(Things to do).
  # User can add a checklist item by clicking on add button or check mark.
  # User can add separator lines between checklist items.
  # User can delete a checklist item by clicking on x mark.
#8. User can assign the tasks to employees by clicking on Add More and selecting contact from E-mail user,
                              # Employees and Departments and Recent contact lists.
  # Employees can be added in different assignment categories: Created By, Participants and Observer.
#9. User can add Deadline, Time Planning by using date pickers.
#10. User can click on More to specify the task details."

  @task_tab
  Feature: As a user, I should be able to assign tasks by clicking on Task tab under Active Stream

    Scenario: Create a task with high priority setting
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      Then user creates a task with high priority
      Then user verifies high priority task is created

    Scenario: Click on visual editor
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      Then user enables visual editor
      Then user verifies visual editor is visible

    Scenario: Click on upload files icon to upload files
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      Then user clicks upload file option
      Then user verifies upload options are visible


    Scenario: Create a quote by clicking on the Comma icon
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      Then user clicks quote icon
      Then user verifies quote option is visible

#
#    Scenario: Add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      Then user clicks add mention icon
#      And user select contacts from the lists provided in dropdown
#
#  Scenario: Attach link by clicking on the link icon.
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      Then user clicks add link icon
#      And verify that link is attached

    Scenario: Click on Checklist to create checklists items
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      Then user clicks checklist icon
      Then user adds a checklist item by clicking on add button
      Then user adds a checklist item by clicking on check mark
      Then user adds separator lines between checklist items
      And verify checklist items for addition
      Then user deletes a checklist item by clicking on x mark
      And verify checklist items for deletion
#
#    Scenario: Assign the tasks to employees by using employees and departments lists
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      Then user clicks "Task" add more link in responsible person box
#      And assign and verify employee to the task using employees and departments lists
#
#    Scenario: Assign the tasks to employees by using recent contact lists
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      Then user clicks "Task" add more link in responsible person box
#      And assign and verify employee to the task using recent contact lists
#
#
#    Scenario: Assign the tasks to employees by participants category
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      And assign and verify employees in to participants category
#
#    Scenario: Assign the tasks to employees by observers category
#      Given user is logged in as "manager"
#      When user navigates to "Task" tab
#      And assign and verify employees in to observers category
#
    Scenario: Add Deadline by using date pickers.
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      And user clicks on the deadline box
      And user selects a date
      Then user verifies date is selected

    Scenario: Add Time planning dates by using date pickers.
      Given user is logged in as "manager"
      When user navigates to "Task" tab
      And user clicks on the time planning link
      And user selects two date
      Then user verifies dates are selected





