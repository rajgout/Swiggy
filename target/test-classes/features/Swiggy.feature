Feature: login into Swiggy website

  @Sanity
  Scenario Outline: Positive scenario to test login functionality
    Given User has opened swiggy website on Chrome Browser
    When Click on login button "<MobileNumber>"
    Then User should be able to login successfully

    Examples: 
      | MobileNumber |
      | 9000000000 |
