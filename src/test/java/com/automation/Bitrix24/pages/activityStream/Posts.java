package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Posts extends AbstractPageBase {

    @FindBy(xpath = "(//a[@class='feed-com-add-link' and text()='Add comment'])[1]")
    private WebElement firstCommentLink;

    @FindBy(tagName = "body")
    private WebElement firstCommentBox;

    @FindBy(xpath = "(//div[@class='feed-add-post-buttons']/button)[1]")
    private WebElement firstCommentSendBtn;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']")
    private List<WebElement> commentList;

    @FindBy(xpath = "//span[contains(@class,'bx-ilike-left-wrap')]")
    private List<WebElement> likeList;

    @FindBy(xpath = "//span[@class='feed-inform-follow']/a")
    private List<WebElement> unfollowList;

    @FindBy(xpath = "(//div[@class='feed-com-informers-bottom']//span[text()='More'])[1]")
    private WebElement commentMoreLink;

    @FindBy(xpath = "//span[text()='View comment']")
    private WebElement commentViewLink;

    @FindBy(xpath = "(//div[@class='feed-com-user-box']/a)[1]")
    private WebElement commentAuthor;

    @FindBy(xpath = "//div[@class='feed-com-block-cover']//span[contains(@class, 'bx-ilike-left-wrap')]")
    private List<WebElement> commentLikeList;

    @FindBy(xpath = "(//div[@class='feed-com-block-cover']//a[contains(text(), 'Reply')])[1]")
    private WebElement commentReply;

    @FindBy(xpath = "(//div[@class='feed-add-post-buttons']/button)[1]")
    private WebElement commentSendBtn;

    @FindBy(tagName = "body")
    private WebElement iframeBody;

    @FindBy(xpath = "//div[contains(text(),'deneme 127 yapiyoruz')]")
    private WebElement commentAdded;

    @FindBy(xpath = "(//div[@class='feed-com-user-box']/a)[1]")
    private WebElement reviewersEmail;

    @FindBy(xpath = "//div[@class='bx-ui-tooltip-user-name']/a")
    private WebElement reviewersPopUpEmail;

    @FindBy(xpath = "//div[contains(@class,'feed-post-important-switch')]")
    private List<WebElement> starList;










    public void enterComment(){
        wait.until(ExpectedConditions.visibilityOf(firstCommentLink)).click();
        BrowserUtils.wait(3);
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOf(firstCommentBox)).sendKeys("test comment 1");
        driver.switchTo().parentFrame();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(firstCommentSendBtn)).click();
    }

    public boolean verifyComment(){
        BrowserUtils.wait(3);
        for (WebElement each : commentList) {
            if(each.getText().contains("test comment 1")){
                return true;
            }
        }
        return false;
    }

    private int index=0;

    public void addLike(){
        int count=0;
        for (WebElement each : likeList) {
            count++;
           if(!each.getAttribute("class").contains("bx-you-like-button")) {
               index=count;
               wait.until(ExpectedConditions.elementToBeClickable(each)).click();
               break;
           }
        }
    }

    public boolean verifyLike() {
        BrowserUtils.wait(2);
        if (index>0) {
            if (likeList.get(index-1).getAttribute("class").contains("bx-you-like-button")) {
                return true;
            }
        }
        return false;
    }

    public void unfollowPost(){
        int count=0;
        for (WebElement each : unfollowList) {
            count++;
            if(each.getText().equals("Unfollow")) {
                index=count;
                wait.until(ExpectedConditions.elementToBeClickable(each)).click();
                break;
            }
        }
    }

    public boolean verifyUnfollow() {
        BrowserUtils.wait(2);
        if (index>0) {
            if (unfollowList.get(index-1).getText().equals("Follow")) {
                return true;
            }
        }
        return false;
    }

    private String rememberStr = "";

    public void viewComment(){
        rememberStr = wait.until(ExpectedConditions.visibilityOf(commentAuthor)).getText();
        wait.until(ExpectedConditions.visibilityOf(commentMoreLink)).click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(commentViewLink)).click();
        BrowserUtils.wait(3);
    }

    public boolean verifyViewComment() {
        BrowserUtils.waitForPageToLoad(3);
        String commentAuthorStr = wait.until(ExpectedConditions.visibilityOf(commentAuthor)).getText();
        return commentAuthorStr.equals(rememberStr);
    }


    public void addCommentLike(){
        int count=0;
        for (WebElement each : commentLikeList) {
            count++;
            if(!each.getAttribute("class").contains("bx-you-like-button")) {
                index=count;
                wait.until(ExpectedConditions.elementToBeClickable(each)).click();
                break;
            }
        }
    }

    public boolean verifyCommentLike() {
        BrowserUtils.wait(2);
        if (index>0) {
            if (commentLikeList.get(index-1).getAttribute("class").contains("bx-you-like-button")) {
                return true;
            }
        }
        return false;
    }

    public void addComment(){
        wait.until(ExpectedConditions.elementToBeClickable(commentReply)).click();
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.elementToBeClickable(iframeBody)).sendKeys("deneme 127 yapiyoruz");
        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.elementToBeClickable(commentSendBtn)).click();
    }

    public boolean verifyCommentAdded(){
        BrowserUtils.wait(2);
        return wait.until(ExpectedConditions.elementToBeClickable(commentAdded)).isDisplayed();
    }

    public void clickOnReviewerEmail(){
        Actions actions=new Actions(driver);
        actions.moveToElement(reviewersEmail).perform();
        wait.until(ExpectedConditions.elementToBeClickable(reviewersPopUpEmail)).click();
    }

    public boolean verifyVisitingReviewersProfile(){
        BrowserUtils.waitForPageToLoad(3);
        return driver.getCurrentUrl().contains("https://login1.nextbasecrm.com/company/personal/user/");
    }

    public void addStar(){
        int count=0;
        for (WebElement each : starList) {
            count++;
            if(!each.getAttribute("class").contains("feed-post-important-switch-active")) {
                index=count;
                wait.until(ExpectedConditions.elementToBeClickable(each)).click();
                break;
            }
        }
    }

    public boolean verifyStar() {
        BrowserUtils.wait(1);
        if (index>0) {
            if (starList.get(index-1).getAttribute("class").contains("feed-post-important-switch-active")) {
                return true;
            }
        }
        return false;
    }


}
