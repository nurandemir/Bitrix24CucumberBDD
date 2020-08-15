#10. As a user, I should be able to interact with employees on the posts that I have access to.

#1. User should be able to make a comment, like, or unfollow on other employees' posts.
#2. User should be able to view, like, or make comments on all other reviewers' comments.
#3. User should be able to click on reviewers' name and visit their profiles.
#4. User should be able to add others' posts to favorite by clicking on the Star icon."


@post_tab
Feature: As a user, I should be able to interact with employees on the posts that I have access to

  Scenario: Make a comment on other employees' posts
    Given user is logged in as "manager"
    When user comments on a post
    Then user confirms comment is added

  Scenario: Make a like on other employees' posts
    Given user is logged in as "manager"
    When user likes a post
    Then user confirms like is added

  Scenario: Make unfollow on other employees' posts
    Given user is logged in as "manager"
    When user unfollows a post
    Then user confirms post is unfollowed

  Scenario: View on other employees' comments
    Given user is logged in as "manager"
    When user views a comment
    Then user confirms comment is viewed

#  Scenario: Like other employees' comments
#    Given user is logged in as "manager"
#    When user likes a comment
#    Then user confirms comment is liked

#  Scenario: Make comments on all other reviewers' comments
#    Given user is logged in as "manager"
#    When user makes comments on other reviewers' comment
#    Then user confirms that comment is made on other reviewers' comments

  Scenario: Click on reviewers name and visit their profiles
    Given user is logged in as "manager"
    When user clicks on reviewers name
    Then user verifies visiting reviewers profile

  Scenario: Add others posts to favorite by clicking on the Star icon
    Given user is logged in as "manager"
    When user clicks on the star icon
    Then user verifies post is added to favorites

