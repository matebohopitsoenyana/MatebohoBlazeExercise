
Feature:
  Scenario: I want to login as a Customer
    Given : I'm in a Login Page
    And :All Elements are displayed
    When Click Customer Login button
    Then Customer name selection page is displayed
  Scenario Outline: 2: I want to select customer's name
    Given I'm in the selection Page
    And I select customer's name <CustomerName>
    And I verify Login button
    When I click Login button
    Then The customer is directed to the next page
    Examples:
      | CustomerName |