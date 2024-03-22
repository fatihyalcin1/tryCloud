package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage {

    @FindBy(xpath = "(//div[@class='trigger'])[2]")
    public WebElement viewPipsBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekBtn;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthBtn;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventBtn;

    @FindBy(xpath = "//input[@placeholder='Etkinlik başlığı']")
    public WebElement newEventTitle;


    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveBtn;

    @FindBy (xpath = "//div[@class='popover__wrapper']")
    public WebElement newEventFrame;

    public void setViewPipsBtn (){

        calendarBtn.click();
        BrowserUtils.verifyURLContains("calendar");
        BrowserUtils.clickWithJS(viewPipsBtn);

    }



}
