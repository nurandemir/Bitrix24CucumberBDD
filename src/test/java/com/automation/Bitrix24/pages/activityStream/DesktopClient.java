package com.automation.Bitrix24.pages.activityStream;

import com.automation.Bitrix24.pages.AbstractPageBase;
import com.automation.Bitrix24.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DesktopClient extends AbstractPageBase {

    public void clickAppIcon(String appType){
        String appXpath="//div[@class='b24-app-block-content']//span[text()='"+appType+"']";
        WebElement appElement=driver.findElement(By.xpath(appXpath));
        if (appType.equals("Mac OS") || appType.equals("Windows")) {
            wait.until(ExpectedConditions.elementToBeClickable(appElement)).click();
        } else {
            driver.get("https://github.com/buglloc/brick/archive/v0.2.11.34.zip");
        }
        BrowserUtils.wait(15);
    }

    public boolean verifyAppDownload(String appType) {
        String fileName="";
        if (appType.equals("Mac OS")) {
            fileName = "bitrix24_desktop.dmg";
        } else if (appType.equals("Windows")) {
            fileName = "bitrix24_desktop.exe";
        } else if (appType.equals("Linux")) {
            fileName = "brick-0.2.11.34.zip";
        }
        return isFileDownloaded(fileName);
    }

    public boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        File dir = new File("/Users/nuran/Downloads");
        File[] dir_contents = dir.listFiles();
        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName)) {
                dir_contents[i].delete();
                BrowserUtils.wait(3);
                return flag=true;
            }
        }
        return flag;
    }



}
