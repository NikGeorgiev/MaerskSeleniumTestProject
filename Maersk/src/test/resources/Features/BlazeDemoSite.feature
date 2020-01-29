Feature: Book a flight
  As a user I want to be able to book a flight by selecting a city where I depart from
  So that I know where I need to go to catch my flight.

  @Scenario:
  Scenario: As a user I want to select a city where I depart from and a destination.
    Given I am at the home page
    When I click on the drop down button
    And it displays all the options
    Then I can choose the city of departure and my final destination



  Scenario: As a user I want to select a suitable flight with different time schedules
    Given I have selected my destination
    When I am ready to proceed
    Then the website displays different time schedules of the flight

