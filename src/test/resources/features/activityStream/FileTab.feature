#"5. As a user, I should be able to send files by selecting File subheading
#    from "More" tab under Activity Stream."
#
#    1. User should be able to click on upload files icon to upload files and pictures
#      from local disks, download from external drive, select documents from bitrix24,
#      and create files to upload.

@file_tab
Feature: As a user, I should be able to send files by selecting File subheading

  Scenario: Click on upload files icon to upload files
    Given user is logged in as "manager"
    When user navigates to "More" tab
    Then user clicks "File" submodule
    Then user selects a file from "File" Bitrix24
    Then user verifies file is added
