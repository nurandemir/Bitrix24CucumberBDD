#"9. As a user, I should be able to use ""Filter and search"" functionality on Active Stream."

#"1. User should be able to search by clicking on default filters. (work, favorites,
#        my activity, announcements, and workflows)
#2. User should be able to search by selecting Date, Type, Author, To and more default dropdowns.
#3. User should be able to type-in keyword to search previous posts.
#4. User should be able to use Save Filter functionality on search bar. "

@filterAndSearch_tab
Feature: As a user, I should be able to use Filter and search functionality on Active Stream

  Scenario: Search by clicking on default filters. (work, favorites, my activity, announcements, and workflows)
    Given user is logged in as "manager"
    Then user clicks filter and search textbox
    Then user clicks "Announcements" search option
    Then user verifies "Announcements" result visible

#  Scenario: Search by selecting Date, Type, Author, To and more default dropdowns???//?/
#    Given user is logged in as "manager"
#    Then user clicks filter and search textbox
#    Then user selects custom filters
#    Then user verifies "Custom filter" result visible

  Scenario: Type-in keyword to search previous posts
    Given user is logged in as "manager"
    Then user clicks filter and search textbox
    Then user enters keyword for search
    Then user verifies "Keyword" exist in results


  Scenario: Save Filter functionality on search bar
    Given user is logged in as "manager"
    Then user clicks filter and search textbox
    Then user selects an author
    Then user verifies "Custom3" result visible



