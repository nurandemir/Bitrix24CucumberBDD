package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class EventTab extends AbstractPageBase {

    @FindBy(id = "bx-b-uploadfile-blogPostForm_calendar")
    private WebElement uploadFileBtnEvent;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement uploadFileBtnPoll;

//    @FindBy(xpath = "(//span[text()='Upload files and images'])[11]")
//    private WebElement uploadOption1;

    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'])[3]")
    private WebElement uploadOption2Event;

    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'])[1]")
    private WebElement uploadOption2Poll;

    @FindBy(xpath = "//span[text()='Sales and marketing']")
    private WebElement salesMarketingFolder;

    @FindBy(xpath = "(//a[text()='Quotes'])[1]")
    private WebElement quotesFolder;

    @FindBy(xpath = "(//a[text()='Quote.docx'])[1]")
    private WebElement quoteDocFile;

    @FindBy(xpath = "//span[text()='Select document']")
    private WebElement selectDocumentBtn;

    @FindBy(xpath = "//span[text()='Close']")
    private WebElement popupCloseBtn;

    @FindBy(xpath = "//span[contains(text(),'Quote')]")
    private WebElement fileSelected1;

    @FindBy(xpath = "//span[contains(text(),'.docx')]")
    private WebElement fileSelected2;

//    @FindBy(xpath = "(//span[text()='Download from external drive'])[5]")
//    private WebElement uploadOption3;
//
//    @FindBy(xpath = "(//span[text()='Create using '])[5]")
//    private WebElement uploadOption4;

    @FindBy(id = "bx-b-link-blogPostForm_calendar")
    private WebElement linkIcon;

    @FindBy(id = "linkoCalEditorcal_3Jcl-href")
    private WebElement linkURLBox;

    @FindBy(id = "linkoCalEditorcal_3Jcl-text")
    private WebElement linkTextBox;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement linkSaveBtn;

    @FindBy(linkText = "google")
    private WebElement linkGoogle;

    @FindBy(id = "bx-b-video-blogPostForm_calendar")
    private WebElement videoIcon;

    @FindBy(id = "video_oCalEditorcal_3Jcl-source")
    private WebElement videoURLBox;

    @FindBy(xpath = "//span[@title='Video']")
    private WebElement linkYoutube;

    @FindBy(tagName = "blockquote")
    private WebElement quoteElement;

    @FindBy(id = "lhe_button_editor_blogPostForm_calendar")
    private WebElement visualEditor2;

    @FindBy(xpath = "(//div[@class='bx-html-editor'])[2]")
    private WebElement visualEditorMenu2;

    @FindBy(xpath = "//span[@class='feed-event-rem-value']/input")
    private WebElement reminderTime;

    @FindBy(xpath = "//span[@class='feed-event-rem-value']/select")
    private WebElement reminderInterval;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendBtn;

    @FindBy(xpath = "(//div[@class='sidebar-widget-content']/a)[1]")
    private WebElement reminderEvent;

    @FindBy(xpath = "//span[@class='calendar-slider-sidebar-remind-warning-name']")
    private WebElement reminderText;

    @FindBy(xpath = "(//div[@class='feed-event-location']/input)[1]")
    private WebElement eventLocation;

    @FindBy(xpath = "(//div[@class='feed-calendar-view-text'])[1]//td[text()='East Meeting Room']")
    private WebElement eventLocationInText;

    @FindBy(id = "feed-event-dest-add-link")
    private WebElement addAttendeeLink;

    @FindBy(xpath = "(//div[@id=\"popup-window-content-BXSocNetLogDestination\"]/div/div/a)[2]")
    private WebElement employeeAndDepartLink;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employees']//div[text()='helpdesk1@cybertekschool.com']")
    private WebElement attendeeEmail1;

    @FindBy(xpath = "//div[text()='Scheduler:']")
    private WebElement scheduler;

    @FindBy(xpath = "//span[@class='calendar-planner-user-name']")
    private List<WebElement> attendeeList;

    @FindBy(id = "feed-cal-additional-show")
    private WebElement moreBtn;

    @FindBy(name = "EVENT_ACCESSIBILITY")
    private WebElement availability;

    @FindBy(name = "EVENT_RRULE[FREQ]")
    private WebElement repeat;

    @FindBy(xpath = "(//div[@class='calendar-slider-detail-option-value'])[1]")
    private WebElement availabilityCheck;

    @FindBy(xpath = "(//div[@class='calendar-slider-sidebar-string-value'])[1]")
    private WebElement repeatCheck;













    public void clickUploadIcon(String string) {
        if (string.equals("Event")) {
            wait.until(ExpectedConditions.visibilityOf(uploadFileBtnEvent));
            wait.until(ExpectedConditions.elementToBeClickable(uploadFileBtnEvent)).click();
        } else if (string.equals("Poll") || string.equals("Appreciation") || string.equals("Announcement")) {
            wait.until(ExpectedConditions.visibilityOf(uploadFileBtnPoll));
            wait.until(ExpectedConditions.elementToBeClickable(uploadFileBtnPoll)).click();
        }
    }

    public void selectFileFromBitrix(String string) {
        if (string.equals("Event")) {
            wait.until(ExpectedConditions.visibilityOf(uploadOption2Event));
            wait.until(ExpectedConditions.elementToBeClickable(uploadOption2Event)).click();
        } else if (string.equals("Poll") || string.equals("File")) {
            wait.until(ExpectedConditions.visibilityOf(uploadOption2Poll));
            wait.until(ExpectedConditions.elementToBeClickable(uploadOption2Poll)).click();
        }
        wait.until(ExpectedConditions.visibilityOf(salesMarketingFolder));
        wait.until(ExpectedConditions.elementToBeClickable(salesMarketingFolder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(quotesFolder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(quoteDocFile)).click();

//        wait.until(ExpectedConditions.elementToBeClickable(popupCloseBtn)).click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scroll(0,0);");

        wait.until(ExpectedConditions.elementToBeClickable(selectDocumentBtn)).click();
    }

    public boolean verifyFileSelected() {

        BrowserUtils.wait(10);
        return (wait.until(ExpectedConditions.visibilityOf(fileSelected1)).isDisplayed() && wait.until(ExpectedConditions.visibilityOf(fileSelected2)).isDisplayed());
    }

    public void clickLinkIcon() {
        wait.until(ExpectedConditions.visibilityOf(linkIcon));
        wait.until(ExpectedConditions.elementToBeClickable(linkIcon)).click();
    }

    public void enterLink(){
        wait.until(ExpectedConditions.visibilityOf(linkTextBox)).sendKeys("google");
        wait.until(ExpectedConditions.visibilityOf(linkURLBox)).sendKeys("https://google.com");
        wait.until(ExpectedConditions.elementToBeClickable(linkSaveBtn)).click();
    }
    public boolean verifyLinkAdded() {
        BrowserUtils.wait(5);
        driver.switchTo().frame(1);
        BrowserUtils.wait(5);
        return linkGoogle.isDisplayed();
    }


    public void clickVideoIcon() {
        wait.until(ExpectedConditions.visibilityOf(videoIcon));
        wait.until(ExpectedConditions.elementToBeClickable(videoIcon)).click();
    }

    public void enterVideoLink(){
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.visibilityOf(videoURLBox)).sendKeys("https://vimeo.com/76979871");
        BrowserUtils.wait(10);
        wait.until(ExpectedConditions.elementToBeClickable(linkSaveBtn)).click();
    }

    public boolean verifyVideoLinkAdded() {
        BrowserUtils.wait(5);
        driver.switchTo().frame(1);
        BrowserUtils.wait(5);
        return linkYoutube.isDisplayed();
    }

    public void insertQuote(){
        BrowserUtils.wait(3);
        driver.switchTo().frame(1);
        wait.until(ExpectedConditions.visibilityOf(quoteElement)).sendKeys("Hi");
    }

    public boolean verifyQuoteAdded() {
        BrowserUtils.wait(5);
        String quoteText = wait.until(ExpectedConditions.visibilityOf(quoteElement)).getText();
        return quoteText.contains("Hi");
    }

    public void enableVisualEditor2() {
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(visualEditor2)).click();

    }

    public boolean verifyVisualEditor2() {
        BrowserUtils.wait(5);
        return wait.until(ExpectedConditions.visibilityOf(visualEditorMenu2)).isDisplayed();

    }

    public void addReminder(){
        wait.until(ExpectedConditions.visibilityOf(reminderTime)).clear();
        wait.until(ExpectedConditions.visibilityOf(reminderTime)).sendKeys("1");
        Select select=new Select(reminderInterval);
        select.selectByVisibleText("days");
         wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();

    }
    public boolean verifyReminder(){
        BrowserUtils.waitForPageToLoad(5);
        wait.until(ExpectedConditions.elementToBeClickable(reminderEvent)).click();
        BrowserUtils.waitForPageToLoad(5);
        String reminderTextInEvent=wait.until(ExpectedConditions.visibilityOf(reminderText)).getText();
        return reminderTextInEvent.contains("1 day");
    }

    public void selectEventLocation(){
        wait.until(ExpectedConditions.visibilityOf(eventLocation)).sendKeys("East Meeting Room");
        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }

    public boolean verifyEventlocation(){
        BrowserUtils.waitForPageToLoad(5);
        //wait.until(ExpectedConditions.elementToBeClickable(reminderEvent)).click();
        //BrowserUtils.waitForPageToLoad(5);
        String reminderTextInEvent=wait.until(ExpectedConditions.visibilityOf(eventLocationInText)).getText();
        return reminderTextInEvent.contains("East Meeting Room");
    }

    public void addAttendee(){
        wait.until(ExpectedConditions.elementToBeClickable(addAttendeeLink)).click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(employeeAndDepartLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(attendeeEmail1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(scheduler)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }

    public int verifyAttendeeAdded(){
        BrowserUtils.waitForPageToLoad(5);
        //wait.until(ExpectedConditions.elementToBeClickable(reminderEvent)).click();
        //BrowserUtils.waitForPageToLoad(5);
        int attendeeListSize = wait.until(ExpectedConditions.visibilityOfAllElements(attendeeList)).size();
        return attendeeListSize;
    }

    public void addMoreEventDetails(){
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn)).click();
        Select select=new Select(availability);
        select.selectByVisibleText("Undecided");
        Select select2=new Select(repeat);
        select2.selectByVisibleText("Daily");
        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }


    public boolean verifyMoreEventDetails(){
        BrowserUtils.waitForPageToLoad(5);
        wait.until(ExpectedConditions.elementToBeClickable(reminderEvent)).click();
        BrowserUtils.waitForPageToLoad(5);

        String repeatCheckStr=wait.until(ExpectedConditions.visibilityOf(repeatCheck)).getText();
        String availabilityCheckStr=wait.until(ExpectedConditions.visibilityOf(availabilityCheck)).getText();
        return (repeatCheckStr.contains("daily") && availabilityCheckStr.contains("Undecided"));
    }

}
