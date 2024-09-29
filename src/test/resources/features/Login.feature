Feature: Login
  As user, I want to be able to login with username and password

  Background: go to login page
    Given user is on the login page

  @scenerio_1
  Scenario: Login as store manager
    When user logs in as store manager
    Then user should be able to see Dashboard page title

  @scenerio_2
  Scenario: Login as sales manager
    When user logs in as sales manager
    Then user should be able to see Dashboard page title

  @scenerio_3
  Scenario: Login as driver
    When user logs in as driver
    Then user should be able to see Dashboard page title

  @scenerio_outline
    Scenario Outline: Login under different credentials as <username>
      When user enters "<username>" and "<password>"
      Then user should be able to see Dashboard page title

      Examples:
      |username|password|
      |user10  |UserUser123|
      |user15  |UserUser123|
      |user22  |UserUser123|
      |user110  |UserUser123|
      |user10  |UserUser123|
      |storemanager85  |UserUser123|
      |storemanager120  |UserUser123|
      |salesmanager110 |UserUser123|