#"3. As a user, I should be able to create events by clicking on Event tab under Activity Stream."

#"1. User should be able to click on upload files icon to upload files and
  # pictures from local disks, download from external drive, select documents from bitrix24,
  # and create files to upload.
#2. User should be able to attach link by clicking on the link icon.
#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
#5. User should be able to create a quote by clicking on the Comma icon.
#6. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
#7. User should be able to add Event start and ending date and time, and specify the time zone.
#8. User should be able to set reminder by entering the timing.
#9. User should be able to select event location from dropdown.
#10. User should be able to add attendees by selecting contacts individually or adding groups and departments.
#11. User should be able to click on More to specify the event details."

@event_tab
Feature: As a user, I should be able to create events by clicking on Event tab under Activity Stream.

    Scenario: Click on upload files icon to upload files
      Given user is logged in as "manager"
      When user navigates to "Event" tab
      Then user clicks "Event" upload file
      Then user selects a file from "Event" Bitrix24
      Then user verifies file is added

  Scenario: Attach link by clicking on the link icon
    Given user is logged in as "manager"
    When user navigates to "Event" tab
    Then user clicks link icon
    Then user enters link info
    Then user verifies link is added to event

  Scenario: Create a quote by clicking on the Comma icon
    Given user is logged in as "manager"
    When user navigates to "Event" tab
    Then user clicks quote icon
    Then user enters text in quote
    Then user verifies quote is added to event

  Scenario: Click on visual editor
      Given user is logged in as "manager"
      When user navigates to "Event" tab
      Then user enables visual editor in event
      Then user verifies event visual editor is visible


  Scenario: Set reminder by entering the timing
      Given user is logged in as "manager"
      When user navigates to "Event" tab
      Then user set reminder time
      Then user verifies reminder is created


  Scenario: Select event locations from dropdown
    Given user is logged in as "manager"
    When user navigates to "Event" tab
    Then user selects one event location
    Then user verifies event location is selected

  Scenario: Add attendees by selecting contacts individually or adding groups and departments
    Given user is logged in as "manager"
    When user navigates to "Event" tab
    Then user add attendees
    Then user verifies attendee is selected




#  Scenario: Click on More to specify the event details
#    Given user is logged in as "manager"
#    When user navigates to "Event" tab
#    Then user add more event details
#    Then user verifies event details

#  Scenario: Insert videos by clicking on the video icon and entering the video URL
#    Given user is logged in as "manager"
#    When user navigates to "Event" tab
#    Then user clicks insert video icon
#    Then user enters video source
#    Then user verifies video source link is added to event



#  Scenario: Add Event start and ending date and time, and specify the time zone     ????
#    Given user is logged in as "manager"
#    When user navigates to "Event" tab
#    Then user enters event start and end date and time zone
#    Then user verifies event is created




