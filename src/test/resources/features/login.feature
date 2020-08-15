@login
Feature: Login

  As a user, I want to be able to login with username and password

  Background: open login page
  Scenario Outline: login with parameters
    Given user is on the login page
    When user enters "<username>" username and "<password>" password
    Then user should verify that title contains "<title>" title

    Examples: credentials
      | username                       | password | title  |
      | helpdesk25@cybertekschool.com  | UserUser | Portal |
      | helpdesk26@cybertekschool.com  | UserUser | Portal |
      | marketing25@cybertekschool.com | UserUser | Portal |
      | marketing26@cybertekschool.com | UserUser | Portal |
      | hr25@cybertekschool.com        | UserUser | Portal |
      | hr26@cybertekschool.com        | UserUser | Portal |