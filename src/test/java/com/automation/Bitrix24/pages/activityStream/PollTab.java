package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PollTab extends AbstractPageBase {

    @FindBy(xpath = "//span[@title='Link']")
    private WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    private WebElement linkTextBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    private WebElement linkURLBox;

    @FindBy(linkText = "google")
    private WebElement googleLinkTest;

    @FindBy(id = "bx-b-video-blogPostForm")
    private WebElement videoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    private WebElement videoURLBox;

    @FindBy(xpath = "//span[@title='Video']")
    private WebElement linkYoutube;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement linkSaveBtn;

    @FindBy(xpath = "//span[@title='Quote text']")
    private WebElement quoteIcon;

    @FindBy(tagName = "blockquote")
    private WebElement quoteElement;

    @FindBy(xpath = "(//span[@title='Add mention'])[1]")
    private WebElement addMentionIcon;

    @FindBy(linkText = "Employees and departments")
    private WebElement contactLink;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    private WebElement firstLinkInContact;

    @FindBy(xpath = "(//span)[1]")
    private WebElement mentionBox;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    private WebElement visualEditor3;

    @FindBy(xpath = "(//div[@class='bxhtmled-toolbar'])[1]")
    private WebElement visualEditorMenu3;

    @FindBy(id = "lhe_button_title_blogPostForm")
    private WebElement topicIcon;

    @FindBy(id = "POST_TITLE")
    private WebElement topicTextbox;

    @FindBy(id = "question_0")
    private WebElement questionTextbox;

    @FindBy(id = "answer_0__0_")
    private WebElement answer1Textbox;

    @FindBy(id = "answer_0__1_")
    private WebElement answer2Textbox;

    @FindBy(css = "div[class='vote-checkbox-wrap']>input")
    private WebElement multipleChoiceOption;

    @FindBy(tagName = "body")
    private WebElement questionTopic;

    @FindBy(id = "blog-submit-button-save")
    private WebElement pollSendBtn;

    @FindBy(xpath = "(//div[@class='bx-vote-bar']/span)[1]")
    private WebElement pollQA1;














    public void clickLinkIcon() {
        wait.until(ExpectedConditions.visibilityOf(linkIcon));
        wait.until(ExpectedConditions.elementToBeClickable(linkIcon)).click();
    }

    public boolean verifyLinkAttach() {
        wait.until(ExpectedConditions.visibilityOf(linkTextBox)).sendKeys("google");
        wait.until(ExpectedConditions.visibilityOf(linkURLBox)).sendKeys("https://google.com", Keys.ENTER);
        driver.switchTo().frame(0);
        return googleLinkTest.isDisplayed();
    }

    public void clickVideoIcon() {
        wait.until(ExpectedConditions.visibilityOf(videoIcon));
        wait.until(ExpectedConditions.elementToBeClickable(videoIcon)).click();
    }

    public void enterVideoLink(){
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(videoURLBox)).sendKeys("https://vimeo.com/76979871");
        BrowserUtils.wait(15);
        wait.until(ExpectedConditions.elementToBeClickable(linkSaveBtn)).click();
    }

    public boolean verifyVideoLinkAdded() {
        BrowserUtils.wait(5);
        driver.switchTo().frame(0);
        BrowserUtils.wait(5);
        return linkYoutube.isDisplayed();
    }


    public void clickQuoteIcon() {
        wait.until(ExpectedConditions.visibilityOf(quoteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(quoteIcon)).click();
    }

    public void insertQuote(){
        BrowserUtils.wait(3);
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOf(quoteElement)).sendKeys("Hi");
    }

    public boolean verifyQuoteAdded() {
        BrowserUtils.wait(5);
        String quoteText = wait.until(ExpectedConditions.visibilityOf(quoteElement)).getText();
        return quoteText.contains("Hi");
    }

    public void clickAddMentionIcon() {
        wait.until(ExpectedConditions.visibilityOf(addMentionIcon));
        wait.until(ExpectedConditions.elementToBeClickable(addMentionIcon)).click();
    }

    public boolean selectContactsFromList() {
        wait.until(ExpectedConditions.visibilityOf(contactLink));
        wait.until(ExpectedConditions.elementToBeClickable(contactLink)).click();
        wait.until(ExpectedConditions.visibilityOf(firstLinkInContact));
        String firstContact = firstLinkInContact.getText();
        System.out.println(firstContact);

        wait.until(ExpectedConditions.elementToBeClickable(firstLinkInContact)).click();
        driver.switchTo().frame(0);
        String mentionText = mentionBox.getText();

        return firstContact.equals(mentionText);
    }

    public void enableVisualEditor3() { BrowserUtils.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(visualEditor3)).click();

    }

    public boolean verifyVisualEditor3() {
        BrowserUtils.wait(5);
        return wait.until(ExpectedConditions.visibilityOf(visualEditorMenu3)).isDisplayed();

    }

    public void enableTopicTextbox() {
        BrowserUtils.wait(5);
        if (!topicIcon.getAttribute("class").contains("feed-add-post-form-btn-active")) {
            wait.until(ExpectedConditions.elementToBeClickable(topicIcon)).click();
        }
    }

    public boolean verifyTopicTextbox() {
        BrowserUtils.wait(5);
        return wait.until(ExpectedConditions.visibilityOf(topicTextbox)).isDisplayed();

    }
    public void addPollQuestion(){
        driver.switchTo().frame(0);
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(questionTopic)).sendKeys("Color 5");
        driver.switchTo().parentFrame();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(questionTextbox)).sendKeys("What is your favorite color?");
        wait.until(ExpectedConditions.visibilityOf(answer1Textbox)).sendKeys("Blue");
        wait.until(ExpectedConditions.visibilityOf(answer2Textbox)).sendKeys("Green");
        wait.until(ExpectedConditions.elementToBeClickable(multipleChoiceOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pollSendBtn)).click();
    }

    public boolean verifyPollQuestion(){
        BrowserUtils.wait(1);
        BrowserUtils.waitForPageToLoad(3);
        String qa1class=wait.until(ExpectedConditions.visibilityOf(pollQA1)).getAttribute("class");
        System.out.println("class name "+qa1class);
        return qa1class.contains("checbox");
    }







}
