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

public class AppreciationTab extends AbstractPageBase {

    // Button used to upload files from the local disk
    @FindBy(css = "[name='bxu_files[]']")
    private WebElement dragFileToUploadButton;

    // Button to add the picture uploaded from local disk to the text
    @FindBy(css = ".insert-btn-text")
    private WebElement insertinTextButton;

    @FindBy(id = "bx-destination-tag")
    private WebElement addMoreBtn;

    @FindBy(xpath = "(//div[@id=\"popup-window-content-BXSocNetLogDestination\"]/div/div/a)[2]")
    private WebElement employeeAndDepartLink;

    @FindBy(xpath = "(//div[@class=\"bx-finder-company-department-employees\"]/a)[1]")
    private WebElement attendeeEmail1;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    private WebElement closeBtn;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendBtn;

    @FindBy(tagName = "body")
    private WebElement appreciationTopic;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]")
    private WebElement postedItem;

    @FindBy(id = "bx-b-link-blogPostForm")
    private WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    private WebElement linkURLBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    private WebElement linkTextBox;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement linkSaveBtn;

    @FindBy(linkText = "google")
    private WebElement linkGoogle;

    @FindBy(id = "bx-b-video-blogPostForm")
    private WebElement videoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    private WebElement videoURLBox;

    @FindBy(xpath = "//span[@title='Video']")
    private WebElement linkYoutube;

    @FindBy(id = "bx-b-quote-blogPostForm")
    private WebElement quoteIcon;

    @FindBy(tagName = "blockquote")
    private WebElement quoteElement;

    @FindBy(id = "bx-b-mention-blogPostForm")
    private WebElement addMentionIcon;


    @FindBy(id = "lhe_button_editor_blogPostForm")
    private WebElement visualEditorAppreciation;

    @FindBy(xpath = "(//div[@class='bxhtmled-toolbar'])[1]")
    private WebElement visualEditorMenuAppreciation;

//    ????

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    private WebElement tagIcon;

    @FindBy(name = "TAGS_blogPostForm")
    private WebElement tagTextbox;

    @FindBy(className = "feed-add-post-tags")
    private WebElement textTag;



    @FindBy(id = "lhe_button_editor_blogPostForm")
    private WebElement visualEditorIcon;

    @FindBy(css = "[title='Smileys']")
    private WebElement emojiIcon;


    @FindBy(className = "bxhtmled-smile-img")
    private List<WebElement> emojiList;






    public void addFileFromLocal(){
        System.out.println(System.getProperty("user.dir")+"/Quote.docx");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("bxu_files[]"))).sendKeys(System.getProperty("user.dir")+"/Quote" +
                ".docx");
        wait.until(ExpectedConditions.elementToBeClickable(insertinTextButton)).click();
    }

    public void addRecipient(){
        driver.switchTo().frame(0);
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(appreciationTopic)).clear();
        wait.until(ExpectedConditions.visibilityOf(appreciationTopic)).sendKeys("email test 123");
        driver.switchTo().parentFrame();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(addMoreBtn)).click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(employeeAndDepartLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(attendeeEmail1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }

    public boolean verifyRecipient() {
        BrowserUtils.waitForPageToLoad(3);
        if (postedItem.findElement(By.xpath("//div[text()='email test 123']")).isDisplayed()) {
            if (postedItem.findElement(By.xpath("//a[@class='feed-add-post-destination-new']")).isDisplayed()) {
                return true;
            }
        }
        return false;
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
        driver.switchTo().frame(0);
        BrowserUtils.wait(5);
        return linkGoogle.isDisplayed();
    }

    public void clickVideoIcon() {
        wait.until(ExpectedConditions.visibilityOf(videoIcon));
        wait.until(ExpectedConditions.elementToBeClickable(videoIcon)).click();
    }

    public void enterVideoLink(){
        BrowserUtils.wait(3);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeAsyncScript("document.getElementById('video_idPostFormLHE_blogPostForm-source').value='https://www" +
//                ".youtube.com/watch?v=nMAzchVWTis';");
//        BrowserUtils.wait(1);

        wait.until(ExpectedConditions.visibilityOf(videoURLBox)).sendKeys("https://youtube.com/watch?v=nMAzchVWTis");
        BrowserUtils.wait(25);
        wait.until(ExpectedConditions.elementToBeClickable(linkSaveBtn)).click();
    }

    public boolean verifyVideoLinkAdded() {
        BrowserUtils.wait(5);
        driver.switchTo().frame(0);
        //BrowserUtils.wait(5);
        Boolean videoDisplayed = linkYoutube.isDisplayed();
        return videoDisplayed;
    }

    public void clickQuoteIcon() {
        BrowserUtils.wait(3);
        driver.switchTo().frame(0);
        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(appreciationTopic)).clear();
        driver.switchTo().parentFrame();
        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(quoteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(quoteIcon)).click();
    }

    public void insertQuote(){
        BrowserUtils.wait(3);
        driver.switchTo().frame(0);
        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(quoteElement)).sendKeys("Quote test");
    }

    public boolean verifyQuoteAdded() {
        BrowserUtils.wait(5);
        String quoteText = wait.until(ExpectedConditions.visibilityOf(quoteElement)).getText();
        return quoteText.contains("Quote test");
    }

    public void clickAddMentionIcon() {
        wait.until(ExpectedConditions.visibilityOf(addMentionIcon));
        wait.until(ExpectedConditions.elementToBeClickable(addMentionIcon)).click();
    }

    public void enableVisualEditorInAppreciation() {
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(visualEditorAppreciation)).click();

    }

    public boolean verifyVisualEditorInAppreciation() {
        BrowserUtils.wait(5);
        return wait.until(ExpectedConditions.visibilityOf(visualEditorMenuAppreciation)).isDisplayed();

    }

    public void clickTagIcon() {
        wait.until(ExpectedConditions.visibilityOf(tagIcon));
        wait.until(ExpectedConditions.elementToBeClickable(tagIcon)).click();
    }

    public void addTag(){
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(tagTextbox)).sendKeys("tagTest", Keys.ENTER);
    }

    public boolean verifyTagAdded() {
        BrowserUtils.wait(1);
        String tagText = wait.until(ExpectedConditions.visibilityOf(textTag)).getText();
        return tagText.contains("tagTest");
    }

    public void clickEmojiInVisualEditor(){
        wait.until(ExpectedConditions.visibilityOf(visualEditorIcon));
        wait.until(ExpectedConditions.elementToBeClickable(visualEditorIcon)).click();
        wait.until(ExpectedConditions.visibilityOf(emojiIcon));
        wait.until(ExpectedConditions.elementToBeClickable(emojiIcon)).click();
    }

    public boolean verifyEmojiList() {
        BrowserUtils.wait(1);
        int listSize = wait.until(ExpectedConditions.visibilityOfAllElements(emojiList)).size();
        return listSize>0;
    }


}
