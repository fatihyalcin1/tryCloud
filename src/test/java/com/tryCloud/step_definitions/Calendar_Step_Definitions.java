package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Calendar_Step_Definitions {

    CalendarPage calendarPage = new CalendarPage();

    @When("User can display daily calendar view")
    public void user_can_display_daily_calendar_view() {

        calendarPage.setViewPipsBtn();
        BrowserUtils.clickWithJS(calendarPage.dayBtn);
        BrowserUtils.verifyURLContains("GridDay");


    }

    @When("User can display weekly calendar view")
    public void user_can_display_weekly_calendar_view() {

        calendarPage.setViewPipsBtn();
        BrowserUtils.clickWithJS(calendarPage.weekBtn);
        BrowserUtils.verifyURLContains("GridWeek");


    }

    @When("User can display monthly calendar view")
    public void user_can_display_monthly_calendar_view() {

        calendarPage.setViewPipsBtn();
        BrowserUtils.clickWithJS(calendarPage.monthBtn);
        BrowserUtils.verifyURLContains("GridMonth");


    }


    @When("User can create a new event under the Calendar module and User can see it on the related day through the Monthly Calendar view")
    public void user_can_create_a_new_event_and_see_it_on_the_related_day_through_the_monthly_calendar_view() {
        calendarPage.calendarBtn.click();
        BrowserUtils.clickWithJS(calendarPage.newEventBtn);
        BrowserUtils.verifyURLContains("popover");
        String newEvent = "Wooden Spoon";
        calendarPage.newEventTitle.sendKeys(newEvent);
        calendarPage.saveBtn.click();


        WebElement event = Driver.getDriver().findElement(
                By.xpath("(//div[.='Wooden Spoon'])[1]"));


            Assert.assertTrue(event.isEnabled());



    }

}
