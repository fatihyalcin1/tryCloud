@B32G3-138
Feature: Default


  @B32G3-135
  Scenario: After Login user can see all modules and Username.
    Given the user is on the login page
    When User can login with valid credentials
    Then After Login user can see all modules and Username.


  @B32G3-136
  Scenario: User can click on Customize button and select any of the Widgets.
    Given the user is on the login page
    When User can login with valid credentials
    Then User can click on Customize button and select any of the Widgets.


  @B32G3-137
  Scenario: User can click on Set Status button and select any of the Status options.
    Given the user is on the login page
    When User can login with valid credentials
    Then User can click on Set Status button and select any of the Status options.