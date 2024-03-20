package com.tryCloud.pages;



import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@tabindex='-1']")
    public List<WebElement> appMenuElements;

    /**
     * This method is used to check if all the elements in the app menu are enabled or not
     * appMenuElements list of web elements that represents the app menu items
     */
    public void appMenuElements() {
        for (WebElement each : appMenuElements) {
            Assert.assertTrue(each.isDisplayed());
            //System.out.println("each = " + each.getAttribute("data-id"));
        }
    }


    @FindBy(xpath = "//div[@class='header-right']/div")
    public List<WebElement> headerRightElements;

    /**
     * This method is used to check if all the elements in the headerRight are enabled or not
     * headerRightElements list of web elements that represents the app menu items
     */
    public void headerRightElements() {
        for (WebElement each : headerRightElements) {
            Assert.assertTrue(each.isDisplayed());
            //System.out.println("each = " + each.getAttribute("id"));
        }
    }


    @FindBy(xpath = "(//li[@data-id='dashboard'])[1]")
    public WebElement dashboardBtn;
    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesBtn;

    @FindBy(xpath = "(//li[@data-id='photos'])[1]")
    public WebElement photosBtn;
    @FindBy(xpath = "(//li[@data-id='activity'])[1]")
    public WebElement activityBtn;
    @FindBy(xpath = "(//li[@data-id='spreed'])[1]")
    public WebElement talkBtn;
    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contactsBtn;
    @FindBy(xpath = "(//li[@data-id='circles'])[1]")
    public WebElement circlesBtn;
    @FindBy(xpath = "(//li[@data-id='calendar'])[1]")
    public WebElement calendarBtn;
    @FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckBtn;

    @FindBy(xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchBtn;
    @FindBy(xpath = "//div[@class='notifications']")
    public WebElement notificationsBtn;

    @FindBy(id = "contactsmenu")
    public WebElement contactsmenuBtn;
    @FindBy(id = "expand")
    public WebElement expandBtn;


}
