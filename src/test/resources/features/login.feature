Feature: Login Sepulsa

  As a user
  I want to see the main page
  So that I can access my account

  Scenario: login sepulsa
    Given I am on the Sepulsa.com login page
    When I enter my valid username and password
    And I click on the login button
    Then  see a message Welcome to Sepulsa

  Scenario: Invalid Login
    Given I am on the Sepulsa.com login page
    When I enter my invalid username and password
    And I click on the login button
    Then I should see an error message Invalid username or password

  Scenario: Forgot Password
    Given I am on the Sepulsa.com login page
    When I click on the Forgot Password button
    And I enter my registered email address
    And I click on the Reset Password button
    Then I should receive an email with instructions on resetting my password

  Scenario:  Guest mode
    Given I am on the Sepulsa.com login page
    When I click guest button
    Then Go to main page sepulsa
