package com.automation.Bitrix24.pages;

import com.automation.Bitrix24.utilities.ConfigurationReader;
import com.automation.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPageBase{

   @FindBy(name="USER_LOGIN")
    private WebElement usernameBox;

    @FindBy(name="USER_PASSWORD")
    private WebElement passwordBox;

    @FindBy(className="login-btn")
    private WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * This is for different user login credentials
     *
     * @param userValue     accepts a user email
     * @param passwordValue accepts a password
     */
    public void login(String userValue, String passwordValue) {
        usernameBox.sendKeys(userValue);
        passwordBox.sendKeys(passwordValue);
        loginBtn.click();
    }

    public void loginAs(String usertype) {
        if (usertype.equals("manager")) {
            usernameBox.sendKeys("marketing26@cybertekschool.com");
            passwordBox.sendKeys("UserUser");
            loginBtn.click();
        }
    }

    public void goToLoginpage(){
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

}
