@calendar
Feature: Calendar functionality
  User Story : As a user, I should be able to see Daily-Weekly-Monthly calendar view
  and create a new event under the Calendar module


  Scenario: User can display daily calendar view
    Given the user is on the login page
    When User can login with valid credentials
    When User can display daily calendar view


  Scenario: User can display weekly calendar view
    Given the user is on the login page
    When User can login with valid credentials
    When User can display weekly calendar view


  Scenario: User can display monthly calendar view
    Given the user is on the login page
    When User can login with valid credentials
    When User can display monthly calendar view


  Scenario: User can create a new event under the Calendar module
  and see it on the related day through the Monthly Calendar view
    Given the user is on the login page
    When User can login with valid credentials
    When User can create a new event under the Calendar module and User can see it on the related day through the Monthly Calendar view