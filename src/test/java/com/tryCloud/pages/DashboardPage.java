package com.tryCloud.pages;


import com.tryCloud.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//div[@class='user-status-menu-item']/button")
    public WebElement setStatusBtn;
    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeBtn;
    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMsgBtn;

    @FindBy(xpath = "//li[@data-v-d8d86ca2]/input")
    public List<WebElement> widgets;


    public void dashboardWidget() {

        customizeBtn.click();
        for (WebElement each : widgets) {

            Assert.assertTrue(each.isEnabled());

            if (!(each.isSelected())) {
                BrowserUtils.clickWithJS(each);
            }
            Assert.assertTrue(each.isSelected());

        }
    }

    @FindBy(xpath = "//div[@class='user-status-online-select']")
    public List<WebElement> statusWebElements;

    public void dashboardStatusOptions() {

        dashboardWidget();
        BrowserUtils.clickWithJS(setStatusBtn);

        for (WebElement each : statusWebElements) {
            Assert.assertTrue(each.isEnabled());
        }
        setStatusMsgBtn.click();

    }

}
