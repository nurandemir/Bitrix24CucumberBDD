package com.automation.Bitrix24.step_definitions.ActivityStream_StepDefinitions;

import com.automation.Bitrix24.pages.activityStream.FilterAndSearch;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FilterAndSearchStepDef {

    FilterAndSearch filterAndSearch=new FilterAndSearch();

    @Then("user clicks filter and search textbox")
    public void user_clicks_filter_and_search_textbox() {
        filterAndSearch.clickSearchBox();
    }

    @Then("user clicks {string} search option")
    public void user_clicks_search_option(String string) {
        filterAndSearch.clickFilterSearchOptions();
    }

    @Then("user verifies {string} result visible")
    public void user_verifies_result_visible(String string) {
        Assert.assertTrue(filterAndSearch.verifyFilterSearchOptions(string));
    }

    @Then("user selects custom filters")
    public void user_selects_custom_filters() {
        filterAndSearch.enterCustomFilter();
    }

    @Then("user enters keyword for search")
    public void user_enters_keyword_for_search() {
        filterAndSearch.enterKeywordInSearchFilter();
    }

    @Then("user verifies {string} exist in results")
    public void user_verifies_exist_in_results(String string) {
        filterAndSearch.verifySearchTermInResult(string);
    }

    @Then("user selects an author")
    public void user_selects_an_author() {
        filterAndSearch.selectAuthorInSearchFilter();
    }

}
