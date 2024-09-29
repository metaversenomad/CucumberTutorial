@vehicle
Feature: Create vehicle
  As a user, I want to be able to create vehicles
  Scenario: Create a vehicle
    Given user is on the login page
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicle"
    And user click on create car button
    Then user enter vehicle information:
    |License Plate|Driver|Location|Model Year|
    |test_plates  |SDET  |Washington D.C.|2020|