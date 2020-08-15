#"6. As a user, I should be able to send appreciation by clicking
#      on Appreciation subheading from ""More"" tab under Activity Stream."
#
#1. User should be able to click on upload files icon to upload files and pictures from local disks,
#    download from external drive, select documents from bixtrix24, and create files to upload.
#2. User should be able to add users and recipients from selecting contact from E-mail user,
#    Employees and Departments and Recent contact lists.
#3. User should be able to attach link by clicking on the link icon.
#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
#5. User should be able to create a quote by clicking on the Comma icon.

#6. User should be able to add mention by clicking on the Add mention icon and select contacts
#    from the lists provided in dropdown.
#7. User should be able to click on Visual Editor and see the editor text-bar displays
#    on top of the message box.
#8. User should be able to click on the Topic icon to see the Appreciation Topic text box
#    displays on top of the message box.
#9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.

#10. User should be able to add tags by selecting existing tags or creating new tags
#    by clicking on the # icon.
#11. User should be able to see all types of appreciation illustration/emojis by clicking on the
#    existing illustration/emojis."

@appreciation_tab
Feature: As a user, I should be able to send appreciation by clicking on Appreciation subheading

  Scenario: Click on upload files icon to upload files and pictures from local disks,
          download from external drive, select documents from bitrix24, and create files to upload.
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks "Appreciation" upload file
    Then user selects a file from local disk
    Then user verifies file is added

    Scenario: Add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent
              contact lists.
      Given user is logged in as "manager"
      When user navigates to "More" tab
      Then user clicks "Appreciation" submodule
      Then user add recipient
      Then user verifies recipient is selected

  Scenario: Attach link by clicking on the link icon
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks link icon in appreciation
    Then user enters link info in appreciation
    Then user verifies link is added to appreciation

  Scenario: Create a quote by clicking on the quote icon
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks quote icon in appreciation
    Then user enters text in quote in appreciation
    Then user verifies quote is added to appreciation

    Scenario: add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks add mention icon in appreciation
     Then user add recipient
     Then user verifies recipient is selected

    Scenario: click on Visual Editor and see the editor text-bar displays on top of the message box
        Given user is logged in as "manager"
        When user navigates to "More" tab
        Then user clicks "Appreciation" submodule
        Then user clicks visual editor icon in appreciation
        Then user verifies appreciation visual editor is visible

    Scenario: Click on the Topic icon to see the Appreciation Topic text box displays on top of the message box
        Given user is logged in as "manager"
        When user navigates to "More" tab
        Then user clicks "Appreciation" submodule
        Then user clicks topic icon in appreciation
        Then user verifies appreciation topic menu is visible


#    displays on top of the message box
#  ???????

  Scenario: Add tags by selecting existing tags or creating new tags by clicking on the # icon
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks tag icon in appreciation
    Then user verifies tag is added to appreciation

  Scenario: See all types of appreciation illustration/emojis by clicking on the existing illustration/emojis
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "Appreciation" submodule
    Then user clicks emojis in visual editor in appreciation
    Then user verifies emojis are listed in appreciation


#    Scenario: Insert videos by clicking on the video icon and entering the video URL
#        Given user is logged in as "manager"
#        When user navigates to "More" tab
#        Then user clicks "Appreciation" submodule
#        Then user clicks insert video icon in appreciation
#        Then user enters video source in appreciation
#        Then user verifies video source link is added to appreciation


