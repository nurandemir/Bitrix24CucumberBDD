package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import com.automation.Bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;

public class TaskTabPage extends AbstractPageBase {

    @FindBy(css = "div[class='task-info-panel-title']>input")
    private WebElement taskTitle;

    @FindBy(id = "tasks-task-priority-cb")
    private WebElement highPriorityCheckBox;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendButton;

    @FindBy(linkText = "Task test 4")
    private WebElement taskLink;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[2]")
    private WebElement tasksSection;

    @FindBy(xpath = "//span[text()='High Priority'][2]")
    private WebElement priorityFlag;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    private WebElement visualEditor;

    @FindBy(id = "bx-html-editor-tlbr-cnt-lifefeed_task_form")
    private WebElement visualEditorMenu;

    @FindBy(id = "bx-b-uploadfile-task-form-lifefeed_task_form")
    private WebElement uploadFileBtn;

    @FindBy(xpath = "(//span[text()='Upload files and images'])[11]")
    private WebElement uploadOption1;

    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'])[5]")
    private WebElement uploadOption2;

    @FindBy(xpath = "(//span[text()='Download from external drive'])[5]")
    private WebElement uploadOption3;

    @FindBy(xpath = "(//span[text()='Create using '])[5]")
    private WebElement uploadOption4;

    @FindBy(xpath = "(//span[@title='Quote text'])[2]")
    private WebElement quoteIcon;

    @FindBy(tagName = "blockquote")
    private WebElement quoteBox;

    @FindBy(xpath = "(//span[@title='Add mention'])[2]")
    private WebElement addMention;

    @FindBy(linkText = "Employees and departments")
    private WebElement contactLink;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    private WebElement firstLinkInContact;

    @FindBy(xpath = "(//span)[1]")
    private WebElement mentionBox;

    @FindBy(xpath = "(//span[@title='Link'])[2]")
    private WebElement linkIcon;

    @FindBy(id = "linklifefeed_task_form-text")
    private WebElement linkTextBox;

    @FindBy(id = "linklifefeed_task_form-href")
    private WebElement linkURLBox;

    @FindBy(id = "undefined")
    private WebElement saveLinkBtn;

    @FindBy(linkText = "google")
    private WebElement googleLinkTest;

    @FindBy(className = "tasks-task-mpf-link")
    private WebElement checkListBtn;

    @FindBy(css = "span[class='task-checklist-form-vpadding']>input")
    private WebElement checkListBox;

    @FindBy(xpath = "//span[text()='add']")
    private WebElement checklistAdd;

    @FindBy(xpath = "//span[text()='separator']")
    private WebElement checklistSeparator;

    @FindBy(xpath = "//span[@class='task-checklist-form-vpadding']/span[1]")
    private WebElement checklistCheckMark;

    @FindBy(xpath = "//span[@class='task-checklist-form-vpadding']/span[2]")
    private WebElement checklistDeleteMark;

    @FindBy(xpath = "(//span[contains(@class,'tasks-btn-delete')])[1]")
    private WebElement checklistDelete;

    @FindBy(xpath = "//span[contains(text(), 'task 1')]")
    private WebElement checklistTask1;

    @FindBy(xpath = "//span[contains(text(), 'task 2')]")
    private WebElement checklistTask2;

    @FindBy(xpath = "//span[contains(text(), 'task 1')]")
    private List<WebElement> checklistTasks;

    @FindBy(xpath = "(//a[contains(text(), 'Add more')])[2]")
    private WebElement addMoreContactTask;

    @FindBy(xpath = "(//a[contains(text(), 'Add more')])[1]")
    private WebElement addMoreContactPoll;

    //@FindBy(xpath="//a[contains(@id, 'destDepartmentTab')]")

    @FindBy(xpath = "//a[text()='Employees and departments']")
    private WebElement employeeDeptLink;

    @FindBy(xpath = "(//div[contains(text(), 'marketing28@cybertekschool.com')])[2]")
    private WebElement contactEmail1;

    @FindBy(xpath = "//span[contains(text(), 'marketing28@cybertekschool.com')]")
    private WebElement contactEmailAdded1;

    @FindBy(xpath = "//a[text()='Recent']")
    private WebElement recentContactLink;

    @FindBy(xpath = "(//div[contains(text(), 'marketing28@cybertekschool.com')])[1]")
    private WebElement recentContactEmail;

    @FindBy(xpath = "(//span[@class='popup-window-close-icon'])[2]")
    private WebElement popupCloseIcon;

    @FindBy(xpath = "(//span[contains(text(), 'Participants')])[1]")
    private WebElement participants;

    @FindBy(xpath = "(//span[contains(text(), 'Observers')])[1]")
    private WebElement observers;

    @FindBy(xpath = "(//span/a[contains(text(), 'Add')])[4]")
    private WebElement addLink1;

    @FindBy(xpath = "(//span/a[contains(text(), 'Add')])[6]")
    private WebElement addLink2;

    @FindBy(xpath = "(//span/input[@class='task-options-inp'])[1]")
    private WebElement deadlineBox;

    @FindBy(xpath = "(//div[@class='bx-calendar-range']/a)[17]")
    private WebElement deadlineDate;

    @FindBy(xpath = "//a/span[contains(text(),'Select')]")
    private WebElement deadlineSelectBtn;

    @FindBy(xpath = "//span[contains(text(),'Time planning')]")
    private WebElement timePlanningLink;

    @FindBy(xpath = "(//span/input[@class='task-options-inp'])[2]")
    private WebElement planningDateStartOn;

    @FindBy(xpath = "(//span/input[@class='task-options-inp'])[4]")
    private WebElement planningDateFinish;




    public void createTaskWithHighPriority() {
        BrowserUtils.wait(5);
        taskTitle.sendKeys("Task test 4");
        wait.until(ExpectedConditions.elementToBeClickable(highPriorityCheckBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
    }

    public boolean verifyTaskWithHighPriority() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(tasksSection)).click();
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(taskLink)).click();
        BrowserUtils.wait(5);
        driver.switchTo().frame(3);
        return priorityFlag.isDisplayed();
    }

    public void enableVisualEditor() {
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(visualEditor)).click();

    }

    public boolean verifyVisualEditor() {
        BrowserUtils.wait(5);
        return wait.until(ExpectedConditions.visibilityOf(visualEditorMenu)).isDisplayed();

    }

    public void clickUploadFile() {
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(uploadFileBtn)).click();
    }

    public boolean verifyUploadOptions() {
        BrowserUtils.wait(5);
        return (uploadOption1.isDisplayed() && uploadOption2.isDisplayed() && uploadOption3.isDisplayed() && uploadOption4.isDisplayed());
    }

    public void clickQuoteIcon() {
        wait.until(ExpectedConditions.visibilityOf(quoteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(quoteIcon)).click();
    }

    public boolean verifyQuoteBox() {
        BrowserUtils.wait(5);
        driver.switchTo().frame(1);
        BrowserUtils.wait(5);
        return quoteBox.isDisplayed();
    }

    public void clickAddMentionIcon() {
        wait.until(ExpectedConditions.visibilityOf(addMention));
        wait.until(ExpectedConditions.elementToBeClickable(addMention)).click();
    }

    public boolean selectContactsFromList() {
        wait.until(ExpectedConditions.visibilityOf(contactLink));
        wait.until(ExpectedConditions.elementToBeClickable(contactLink)).click();
        wait.until(ExpectedConditions.visibilityOf(firstLinkInContact));
        String firstContact = firstLinkInContact.getText();
        System.out.println(firstContact);

        wait.until(ExpectedConditions.elementToBeClickable(firstLinkInContact)).click();
        driver.switchTo().frame(1);
        String mentionText = mentionBox.getText();

        return firstContact.equals(mentionText);
    }

    public void clickLinkIcon() {
        wait.until(ExpectedConditions.visibilityOf(linkIcon));
        wait.until(ExpectedConditions.elementToBeClickable(linkIcon)).click();
    }

    public boolean verifyLinkAttach() {
        wait.until(ExpectedConditions.visibilityOf(linkTextBox)).sendKeys("google");
        wait.until(ExpectedConditions.visibilityOf(linkURLBox)).sendKeys("https://google.com", Keys.ENTER);
        driver.switchTo().frame(1);
        return googleLinkTest.isDisplayed();
    }

    public void clickChecklistBtn() {
        wait.until(ExpectedConditions.visibilityOf(checkListBtn));
        wait.until(ExpectedConditions.elementToBeClickable(checkListBtn)).click();
    }

    public void addChecklistItemWithAdd() {
        wait.until(ExpectedConditions.visibilityOf(checkListBox)).sendKeys("task 1");
        wait.until(ExpectedConditions.elementToBeClickable(checklistAdd)).click();
    }

    public void addChecklistSeparator() {
        wait.until(ExpectedConditions.elementToBeClickable(checklistSeparator)).click();
    }

    public void addChecklistCheckmark() {
        wait.until(ExpectedConditions.visibilityOf(checkListBox)).sendKeys("task 2");
        wait.until(ExpectedConditions.elementToBeClickable(checklistCheckMark)).click();
    }

    public void deleteChecklist() {
        Actions action = new Actions(driver);
        action.moveToElement(checklistTask1).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(checklistDelete)).click();
    }

    public boolean verifyChecklistAdditions() {
        return (wait.until(ExpectedConditions.visibilityOf(checklistTask1)).isDisplayed() &&
                wait.until(ExpectedConditions.visibilityOf(checklistTask2)).isDisplayed());
    }

    public boolean verifyChecklistDeletion() {
        BrowserUtils.wait(3);
        return checklistTasks.isEmpty();
    }

    public void clickAddMoreContactBtn(String string) {
        if (string.equals("Task")) {
            wait.until(ExpectedConditions.elementToBeClickable(addMoreContactTask)).click();
        } else if (string.equals("Poll")) {
            wait.until(ExpectedConditions.elementToBeClickable(addMoreContactPoll)).click();
        }
    }

    public boolean addContactWithEmployeeDept() {
        wait.until(ExpectedConditions.elementToBeClickable(employeeDeptLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(contactEmail1)).click();
        return wait.until(ExpectedConditions.visibilityOf(contactEmailAdded1)).isDisplayed();
    }

    public boolean addContactWithRecent() {
        wait.until(ExpectedConditions.elementToBeClickable(recentContactLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentContactEmail)).click();
        return wait.until(ExpectedConditions.visibilityOf(contactEmailAdded1)).isDisplayed();
    }

    public boolean addContactWithParticipant() {
        wait.until(ExpectedConditions.elementToBeClickable(participants)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addLink1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentContactLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentContactEmail)).click();
        return wait.until(ExpectedConditions.visibilityOf(contactEmailAdded1)).isDisplayed();
    }


    public boolean addContactWithObservers() {
        wait.until(ExpectedConditions.elementToBeClickable(observers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addLink2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentContactLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentContactEmail)).click();
        return wait.until(ExpectedConditions.visibilityOf(contactEmailAdded1)).isDisplayed();
    }

    public void clickDeadlineBox() {
        wait.until(ExpectedConditions.elementToBeClickable(deadlineBox)).click();
    }

    public void selectDeadlineDate() {
        wait.until(ExpectedConditions.elementToBeClickable(deadlineDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deadlineSelectBtn)).click();
    }

    public boolean verifyDeadlineDate() {
        String date = wait.until(ExpectedConditions.visibilityOf(deadlineBox)).getAttribute("value");
        if (date.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void clickTimePlanning() {
        wait.until(ExpectedConditions.elementToBeClickable(timePlanningLink)).click();
    }

    public void selectPlanningDates() {
        wait.until(ExpectedConditions.elementToBeClickable(planningDateStartOn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deadlineDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deadlineSelectBtn)).click();


        wait.until(ExpectedConditions.elementToBeClickable(planningDateFinish)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deadlineDate)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deadlineSelectBtn)).click();


    }


    public boolean verifyTimePlanningDates() {
        String date1 = wait.until(ExpectedConditions.visibilityOf(planningDateStartOn)).getAttribute("value");
        String date2 = wait.until(ExpectedConditions.visibilityOf(planningDateFinish)).getAttribute("value");
        if (date1.isEmpty() || date2.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }


}
