#"4. As a user, I should be able to create a poll by clicking on Poll tab under Active Stream."

#"1. User should be able to click on upload files icon to upload files and pictures from local disks,
#    download from external drive, select documents from bitrix24, and create files to upload.
#2. User should be able to add users from selecting contact from E-mail user,
#    Employees and Departments and Recent contact lists.
#3. User should be able to attach link by clicking on the link icon.
#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
#5. User should be able to create a quote by clicking on the Comma icon.
#6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists
#    provided in dropdown.
#7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
#8. User should be able to click on the Topic icon to see the poll Topic text box displays on top of the message box.
#9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
#10. User should be able to Add questions and multiple answers; user can provide multiple choice to
#    attendees by selecting the Allow multiple choice checkbox."

@poll_tab
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream

  Scenario: Click on upload files icon to upload files
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks "Poll" upload file
    Then user selects a file from "Poll" Bitrix24
    Then user verifies file is added

  Scenario: Add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks "Poll" add more link in responsible person box
    And assign and verify employee to the task using employees and departments lists


  Scenario: Attach link by clicking on the link icon
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks poll add link icon
    And verify that poll link is attached

  Scenario: Create a quote by clicking on the Comma icon
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks poll quote icon
    Then user enters text in poll quote
    Then user verifies poll quote is added to event

  Scenario: Add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks poll add mention icon
    And user selects poll contacts from the lists provided in dropdown

  Scenario: Click on visual editor
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user enables visual editor in poll
    Then user verifies poll visual editor is visible

  Scenario: click on the Topic icon to see the poll Topic text box displays on top of the message box
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks topic icon
    Then user verifies topic textbox is visible

  Scenario: Click on Record Video tab to record a video and attach it with the message  ???
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user clicks topic icon
    Then user verifies topic textbox is visible

  Scenario: Add questions and multiple answers
    Given user is logged in as "manager"
    When user navigates to "Poll" tab
    Then user adds question with multiple choice
    Then user verifies multiple choice selection




#
#  Scenario: Insert videos by clicking on the video icon and entering the video URL ???
#    Given user is logged in as "manager"
#    When user navigates to "Poll" tab
#    Then user clicks insert poll video icon
#    Then user enters poll video source
#    Then user verifies poll video source link is added to event
