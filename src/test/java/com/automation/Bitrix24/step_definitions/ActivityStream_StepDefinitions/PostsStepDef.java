package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.pages.activityStream.Posts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PostsStepDef {

   Posts posts=new Posts();

    @When("user comments on a post")
    public void user_comments_on_a_post() {
        posts.enterComment();
    }

    @Then("user confirms comment is added")
    public void user_confirms_comment_is_added() {
        Assert.assertTrue(posts.verifyComment());
    }

    @When("user likes a post")
    public void user_likes_a_post() {
        posts.addLike();
    }

    @Then("user confirms like is added")
    public void user_confirms_like_is_added() {
        Assert.assertTrue(posts.verifyLike());
    }
    @When("user unfollows a post")
    public void user_unfollows_a_post() {
        posts.unfollowPost();
    }

    @Then("user confirms post is unfollowed")
    public void user_confirms_post_is_unfollowed() {
        Assert.assertTrue(posts.verifyUnfollow());
    }
    @When("user views a comment")
    public void user_views_a_comment() {
        posts.viewComment();
    }

    @Then("user confirms comment is viewed")
    public void user_confirms_comment_is_viewed() {
        Assert.assertTrue(posts.verifyViewComment());
    }


    @When("user likes a comment")
    public void user_likes_a_comment() {
        posts.addCommentLike();
    }

    @Then("user confirms comment is liked")
    public void user_confirms_comment_is_liked() {
        Assert.assertTrue(posts.verifyCommentLike());
    }

    @When("user makes comments on other reviewers' comment")
    public void user_makes_comments_on_other_reviewers_comment() {
        posts.addComment();
    }

    @Then("user confirms that comment is made on other reviewers' comments")
    public void user_confirms_that_comment_is_made_on_other_reviewers_comments() {
        Assert.assertTrue(posts.verifyCommentAdded());
    }

    @When("user clicks on reviewers name")
    public void user_clicks_on_reviewers_name() {
        posts.clickOnReviewerEmail();

    }

    @Then("user verifies visiting reviewers profile")
    public void user_verifies_visiting_reviewers_profile() {
        Assert.assertTrue(posts.verifyVisitingReviewersProfile());

    }

    @When("user clicks on the star icon")
    public void user_clicks_on_the_star_icon() {
        posts.addStar();
    }

    @Then("user verifies post is added to favorites")
    public void user_verifies_post_is_added_to_favorites() {
        Assert.assertTrue(posts.verifyStar());
    }



}
