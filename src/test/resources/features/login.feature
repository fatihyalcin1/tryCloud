@wip
Feature: Users should be able to login

  Background:
    Given the user is on the login page


  Scenario: Login
    When User can login with valid credentials
      #(either clicking on the "Login button" or hitting  the "Enter" key from the keyboard as the last step)

  Scenario Outline: User cannot login
    When User cannot login with any invalid credentials "<username>" "<password>"
    When `Wrong username or password.` should be displayed for invalid credentials
    Examples:
      | username | password |
      | asdf1    | asdf1    |
      | asdf2    | asdf2    |
      | asdf3    | asdf3    |


  Scenario: see the password in a form of dots by default
    When User can see the password in a form of dots by default

  Scenario: see the password explicitly
    When User can see the password explicitly if needed

  Scenario: see Forgot password?
    When User can see the `Forgot password?` link on the login page

  Scenario: see Reset Password
    And User can see the `Reset Password` button after clicking on forget password link


  Scenario: see valid placeholders
    When User can see valid placeholders on Username and Password fields

  #  When "Please fill out this field" message should be displayed if the password or username is empty
