#"11. As a PC user, I should be able to download Desktop version of the application."

#1. User should be able to click on Mac Os icon under Desktop
#    Client to download Mac version of Bitrix.
#2. User should be able to click on Windows icon under Desktop Client to download Windows version of Bitrix.
#3. User should be able to click on Linux icon under Desktop
#    Client to download Linux version of Bitrix."

@desktopClient_tab
Feature: As a user, I should be able to download Desktop version of the application

  Scenario Outline: Click on Mac OS icon under Desktop client to download Mac version of Bitrix.
    Given user is logged in as "manager"
    When user clicks "<apptype>" icon
    Then user confirms "<apptype>" app is downloaded
    Examples:
      | apptype |
      | Mac OS  |
      | Windows |
      | Linux   |


