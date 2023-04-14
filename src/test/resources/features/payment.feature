Feature: Choose Payment Method

  As a user
  I want to buy product on sepulsa
  So that I can choose a payment method

  Scenario: Kredivo payment method
    Given I am on the page to choose a payment method
    When I enter Buyer Detail information
    And I choose Kredivo payment method
    Then  I go to the Kredivo payment page

  Scenario: Gopay payment method
    Given I am on the page to choose a payment method
    When I enter Buyer Detail information
    And I choose Gopay payment method
    Then  I go to the Gopay payment page

  Scenario: Dana payment method
    Given I am on the page to choose a payment method
    When I enter Buyer Detail information
    And I choose Dana payment method
    Then  I go to the Dana payment page

  Scenario: ShopeePay payment method
    Given I am on the page to choose a payment method
    When I enter Buyer Detail information
    And I choose ShopeePay payment method
    Then  I go to the ShopeePay payment page