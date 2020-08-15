package com.automation.Bitrix24.step_definitions;

import com.automation.Bitrix24.pages.LoginPage;
import com.automation.Bitrix24.utilities.BrowserUtils;
import com.automation.Bitrix24.utilities.ConfigurationReader;
import com.automation.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.goToLoginpage();
    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should verify that title contains {string} title")
    public void user_should_verify_that_title_contains_title(String title) {
        BrowserUtils.waitForPageToLoad(10);
        boolean check=Driver.getDriver().getTitle().contains(title);
        Assert.assertTrue(check);
        Driver.closeDriver();
    }

    @Given("user is logged in as {string}")
    public void user_is_logged_in_as(String string) {
        loginPage.goToLoginpage();
        loginPage.loginAs(string);
    }

    @When("user navigates to {string} tab")
    public void user_navigates_to_tab(String tabName) {
        loginPage.navigateTo(tabName);
    }

}
