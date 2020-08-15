package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AnnouncementTab extends AbstractPageBase {

    // Button used to upload files from the local disk
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement uploadFileIcon;

    // Button to add the picture uploaded from local disk to the text
    @FindBy(css = ".insert-btn-text")
    private WebElement insertinTextButton;


    public void addFileFromLocal(){
        //System.out.println(System.getProperty("user.dir")+"/Quote.docx");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("bxu_files[]"))).sendKeys(System.getProperty("user.dir")+"/Quote" +
                ".docx");
        wait.until(ExpectedConditions.elementToBeClickable(insertinTextButton)).click();
    }

}
