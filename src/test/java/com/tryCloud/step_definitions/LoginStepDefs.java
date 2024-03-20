package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @When("User can login with valid credentials")
    public void user_can_login_with_valid_credentials() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
        BrowserUtils.verifyURLContains("dashboard");

    }

    @When("User cannot login with any invalid credentials {string} {string}")
    public void user_cannot_login_with_any_invalid_credentials(String username, String password) {
        loginPage.login(username, password);


    }

    @When("`Wrong username or password.` should be displayed for invalid credentials")
    public void wrong_username_or_password_should_be_displayed_for_invalid_credentials() {
        BrowserUtils.waitForVisibility(loginPage.wrongPasswordMsg, 10);
        Assert.assertTrue(loginPage.wrongPasswordMsg.isDisplayed());

    }

    @When("User can see the password in a form of dots by default")
    public void user_can_see_the_password_in_a_form_of_dots_by_default() {

        loginPage.password.sendKeys("`14sf,./e");
        String attributeValue = loginPage.password.getAttribute("type");
        System.out.println("attributeValue = " + attributeValue);
        Assert.assertTrue(attributeValue.equalsIgnoreCase("password"));
    }

    @When("User can see the password explicitly if needed")
    public void user_Can_See_The_Password_Explicitly_If_Needed() {
        loginPage.password.sendKeys("`14sf,./e");
        BrowserUtils.sleep(1);
        loginPage.togglePassword.click();
        String attributeValue = loginPage.password.getAttribute("type");
        System.out.println("attributeValue = " + attributeValue);
        Assert.assertTrue(attributeValue.equalsIgnoreCase("text"));
    }

    @When("User can see the `Forgot password?` link on the login page")
    public void user_can_see_the_forgot_password_link_on_the_login_page() {
        Assert.assertTrue(loginPage.lostPassword.isDisplayed());

    }

    @When("User can see the `Reset Password` button after clicking on forget password link")
    public void user_can_see_the_reset_password_button_after_clicking_on_forget_password_link() {
        loginPage.lostPassword.click();
        BrowserUtils.waitForVisibility(loginPage.resetPassword, 10);
        Assert.assertTrue(loginPage.resetPassword.isDisplayed());
    }

    @When("User can see valid placeholders on Username and Password fields")
    public void user_can_see_valid_placeholders_on_username_and_password_fields() {
        String usernamePlaceholder = loginPage.userName.getAttribute("placeholder");
        String passwordPlaceholder = loginPage.password.getAttribute("placeholder");
        // Assert.assertEquals("Username", usernamePlaceholder);
        // Assert.assertEquals("Password", passwordPlaceholder);

        Assert.assertEquals("Kullanıcı adı ya da e-posta", usernamePlaceholder);
        Assert.assertEquals("Parola", passwordPlaceholder);
    }


}
