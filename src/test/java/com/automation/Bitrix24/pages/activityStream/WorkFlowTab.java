package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class WorkFlowTab extends AbstractPageBase {

    @FindBy(xpath = "//span[text()='Leave Approval']")
    private WebElement leaveApprovalOpt;

    @FindBy(xpath = "(//input[@class='bx-lists-input-calendar'])[1]")
    private WebElement startDate;

    @FindBy(xpath = "(//input[@class='bx-lists-input-calendar'])[2]")
    private WebElement endDate;

    @FindBy(xpath = "(//span[@class='bx-bp-select']/select)[1]")
    private WebElement absenceType;

    @FindBy(name = "PREVIEW_TEXT")
    private WebElement reasonForLeave;

    @FindBy(xpath = "(//div[@class='bx-calendar-range']/a)[30]")
    private WebElement calendarStartDate;

    @FindBy(xpath = "(//div[@class='bx-calendar-range']/a)[34]")
    private WebElement calendarEndDate;

    @FindBy(xpath = "(//span[contains(@class,'popup-window-close-icon')])[2]")
    private WebElement popUpCloseBtn;

    @FindBy(id = "feed-add-buttons-blockblogPostForm")
    private WebElement saveBtn;

    @FindBy(name = "NAME")
    private WebElement title;

    @FindBy(xpath = "(//table[@class='bx-lists-table-content']//input[@type='text'])[2]")
    private WebElement destination;

    @FindBy(xpath = "(//table[@class='bx-lists-table-content']//input[@type='text'])[5]")
    private WebElement plannedExpenses;

    @FindBy(xpath = "(//span[@class='bx-bp-select'])[1]/select")
    private WebElement currency;

    @FindBy(xpath = "(//span[@class='bx-lists-input-file'])[2]")
    private WebElement addFile;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendBtn;

//    @FindBy(xpath = "(//input[@type='text' and @name='NAME'])[2]")
//    private WebElement titleGeneralReq;

    @FindBy(xpath = "//span[@class='bx-bp-select']/select")
    private WebElement generalReqPriorityLevel;

    @FindBy(xpath = "//table[@class='bx-lists-table-content']//tr//a")
    private WebElement requestSendLink;

    @FindBy(xpath = "(//span[text()='Search'])")
    private WebElement requestSearchBtn;

    @FindBy(xpath = "(//div[@class='finder-box-search']/input)")
    private WebElement requestSearchBox;

    @FindBy(xpath = "(//div[text()='James'])[2]")
    private WebElement requestSearchResult;

//    @FindBy(xpath = "((//table[@class='bx-lists-table-content'])[2]//input)[2]")
//    private WebElement amountPurchaseReq;

    @FindBy(name = "PROPERTY_90[n0][VALUE]")
    private WebElement amountPurchaseReq;

    @FindBy(xpath = "(//span[@class='bx-lists-input-file'])/input")
    private WebElement addFilePurchaseReq;

    @FindBy(name = "PROPERTY_79[n0][VALUE]")
    private WebElement descriptionExpenseReport;

    @FindBy(name = "PROPERTY_80[n0][VALUE]")
    private WebElement amountExpensereport;





    public void clickLeaveApprovalOpt(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(leaveApprovalOpt)).click();
    }

    public void enterLeaveApprovalInfo(){
        wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarStartDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(endDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarEndDate)).click();

        Select select=new Select(absenceType);
        select.selectByIndex(6);

        wait.until(ExpectedConditions.elementToBeClickable(reasonForLeave)).sendKeys("Family emergency");
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public void enterBusinessTriplInfo(){
        wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(title)).sendKeys("Business trip");
        wait.until(ExpectedConditions.elementToBeClickable(destination)).sendKeys("Germany");
        wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarStartDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(endDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarEndDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reasonForLeave)).sendKeys("training");
        wait.until(ExpectedConditions.elementToBeClickable(plannedExpenses)).sendKeys("10,000");

        Select select=new Select(currency);
        select.selectByIndex(1);

        //addFile.sendKeys(System.getProperty("user.dir")+"/data.csv");?????

        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));

    }

    public void enterGeneralRequest(){
        BrowserUtils.waitForPageToLoad(5);
        wait.until(ExpectedConditions.visibilityOf(title)).sendKeys("Database Issue");
        wait.until(ExpectedConditions.visibilityOf(reasonForLeave)).sendKeys("I am sending this request for..");
        Select select=new Select(generalReqPriorityLevel);
        select.selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(requestSendLink)).click();

        wait.until(ExpectedConditions.visibilityOf(requestSearchBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(requestSearchBox)).sendKeys("James");
        wait.until(ExpectedConditions.elementToBeClickable(requestSearchResult)).click();

        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }

    public void enterPurchaseRequestInfo(){
        wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(title)).sendKeys("Tickets");

        wait.until(ExpectedConditions.visibilityOf(amountPurchaseReq)).sendKeys("5,000");

        Select select=new Select(currency);
        select.selectByIndex(1);

        addFilePurchaseReq.sendKeys(System.getProperty("user.dir")+"/data.csv");
        BrowserUtils.wait(3);

        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public void enterExpenseReportInfo(){
        wait.until(ExpectedConditions.elementToBeClickable(popUpCloseBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(title)).sendKeys("Expenses");
        wait.until(ExpectedConditions.visibilityOf(descriptionExpenseReport)).sendKeys("Trip expenses");


        wait.until(ExpectedConditions.visibilityOf(amountExpensereport)).sendKeys("8,000");

        Select select=new Select(currency);
        select.selectByIndex(1);

        addFilePurchaseReq.sendKeys(System.getProperty("user.dir")+"/data.csv");
        BrowserUtils.wait(3);

        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }


}
