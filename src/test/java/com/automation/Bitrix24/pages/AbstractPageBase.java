package com.automation.Bitrix24.pages;

import com.automation.Bitrix24.utilities.BrowserUtils;
import com.automation.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Method for BriteErp navigation. Provide tab name to navigate
     *
     * @param tabName like Pricing, Events...
     */
    public void navigateTo(String tabName) {
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(1);
        String tabNameXpath = "//span[text()='" + tabName + "']";
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        wait.until(ExpectedConditions.elementToBeClickable(tabElement)).click();
    }





}
