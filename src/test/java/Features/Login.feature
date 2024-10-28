Feature: Login
  Scenario Outline: Log in a customer
    Given I'm in the login page
    And Click Customer Login button
    And Select Customer Name <customerName>
    When I click Login button
    Then User page displayed
    Examples:
      |Customer Name  |
      |Hermoine Granger  |

