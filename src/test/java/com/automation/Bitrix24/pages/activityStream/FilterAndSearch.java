package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FilterAndSearch extends AbstractPageBase {

    @FindBy(id = "LIVEFEED_search")
    private WebElement filterAndSearch;

    @FindBy(xpath = "(//span[contains(text(),'Work')])[3]")
    private WebElement filterSearchWork;

    @FindBy(xpath = "//span[contains(text(),'Favorites')]")
    private WebElement filterSearchFavorites;

    @FindBy(xpath = "//span[contains(text(),'My Activity')]")
    private WebElement filterSearchMyActivity;

    @FindBy(xpath = "//span[contains(text(),'Announcements')]")
    private WebElement filterSearchAnnouncement;

    @FindBy(xpath = "(//span[contains(text(),'Workflows')])[2]")
    private WebElement filterSearchWorkflows;

    @FindBy(xpath = "(//div[@id='LIVEFEED_search_container'])[1]//div")
    private List<WebElement> filterOptionExist;

    @FindBy(className = "main-ui-select-name")
    private WebElement dateInFilterSearch;

    @FindBy(className = "main-ui-square-item")
    private WebElement typeInFilterSearch;

    @FindBy(name = "CREATED_BY_ID_label")
    private WebElement authorInFilterSearch;

    @FindBy(name = "TO_label'")
    private WebElement toInFilterSearch;

    @FindBy(xpath = "//div[@class='feed-item-wrap']")
    private List<WebElement> keywordSearchCheck;

    @FindBy(xpath = "//div[contains(text(),'helpdesk26')]")
    private WebElement authorHelpDesk;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-button-inner']/button")
    private WebElement searchBtnInFilter;

    @FindBy(xpath = "//span[contains(text(),'Save filter')]")
    private WebElement saveFilter;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    private WebElement filterName;



    public void clickSearchBox(){
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(filterAndSearch)).click();

    }

    public void clickFilterSearchOptions(){
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(filterSearchAnnouncement)).click();

    }
    public boolean verifyFilterSearchOptions(String option){
        BrowserUtils.wait(3);
        List<WebElement>filterOption=wait.until(ExpectedConditions.visibilityOfAllElements(filterOptionExist));

        for (WebElement each : filterOption) {
           if(each.getText().contains(option)){
               return true;
           }
        }
        return false;
    }

    public void enterCustomFilter() {
        //selectDateFilter("This week");
        // ?? eksik
        BrowserUtils.wait(10);
    }



    public void selectDateFilter(String date) {
        BrowserUtils.wait(3);
        //wait.until(ExpectedConditions.visibilityOf(dateInFilterSearch)).sendKeys(date);
        // eksik
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeAsyncScript("");

    }

    public void enterKeywordInSearchFilter(){
        wait.until(ExpectedConditions.visibilityOf(filterAndSearch)).sendKeys("test",Keys.ENTER);
    }

    public boolean verifySearchTermInResult(String str) {
        if (str.equals("Keyword")) {
            for (WebElement each : keywordSearchCheck) {
                if (each.findElement(By.xpath("//div[contains(text(),'test')]")).getText().contains("test")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void selectAuthorInSearchFilter() {

        wait.until(ExpectedConditions.visibilityOf(authorInFilterSearch)).click();

        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(authorHelpDesk)).click();

        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(saveFilter)).click();

        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(filterName)).sendKeys("Custom3",Keys.ENTER);

    }

}
