package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import io.cucumber.java.en.Then;

import java.util.NoSuchElementException;


public class Dashboard_Step_Definitions {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("After Login user can see all modules and Username.")
    public void after_login_user_can_see_all_modules_and_username() {

        dashboardPage.appMenuElements();
        dashboardPage.headerRightElements();
    }

    @Then("User can click on Customize button and select any of the Widgets.")
    public void user_can_click_on_customize_button_and_select_any_of_the_widgets() {

       dashboardPage.dashboardWidget();
    }

    @Then("User can click on Set Status button and select any of the Status options.")
    public void user_can_click_on_set_status_button_and_select_any_of_the_status_options() {

        dashboardPage.dashboardStatusOptions();

    }

}




