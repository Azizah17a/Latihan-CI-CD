Feature: Choose Product

  As a user
  I want to see sepulsa products
  So that I can choose and buy the product

  Scenario: Choose Pulsa
    Given I am on the Sepulsa.com home page
    When I click icon Pulsa button
    And I enter my number phone
    And I choose an available product
    Then  I was redirected to the payment method

  Scenario: Choose Voucher Game
    Given I am on the Sepulsa.com home page
    When I click icon voucher game button
    And I choose the desired game
    And I enter my number phone
    And I choose an available product
    Then I was redirected to the payment method

  Scenario: Choose Listrik PLN
    Given I am on the Sepulsa.com home page
    When I click icon listrik pln button
    And I enter valid PLN Meter Number or Customer ID
    And I enter my number phone
    And I choose an available product
    Then I was redirected to the payment method

  Scenario: Invalid number PLN on Listrik PLN
    Given I am on the Sepulsa.com home page
    When I click icon listrik pln button
    And I enter invalid PLN Meter Number or Customer ID
    And I enter my number phone
    Then Notification appears that the number is incorrect or blocked or expired