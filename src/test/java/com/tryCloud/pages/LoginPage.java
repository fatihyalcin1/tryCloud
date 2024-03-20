package com.tryCloud.pages;



import com.tryCloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{



    @FindBy(id="user")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMsg;

    @FindBy(id="message")
    public WebElement message;

    @FindBy(className = "toggle-password")
    public WebElement togglePassword;

    @FindBy(id="lost-password")
    public WebElement lostPassword;

    @FindBy(id="reset-password-submit")
    public WebElement  resetPassword;



    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr+ Keys.ENTER);
        //submit.click();

        // verification that we logged
    }


}
