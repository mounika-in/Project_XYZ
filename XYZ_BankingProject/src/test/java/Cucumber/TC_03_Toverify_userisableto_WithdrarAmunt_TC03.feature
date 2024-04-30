Feature: To Automate TestCase3
  @Scenario1
  Scenario: To Verify whether user is able to deposite and withdraw the amount
    Given User Opens Chrome Browser
    When User Click on Customer Login
    And Click on YourName Dropdown
    And under YourName Dropdown Select any customer
    And click on Login Button
    When Click on Deposit title
    Then enter text in amount field
    And Click on Deposit Button
    When Click on Withdrawl title
    Then Enter the amount to be withdrawn in amount text field
    And Click on Withdraw Button
    Then Validate that user gets "Transaction successful" message.
    Then Validate that user is able to see correct balance after withdrawl
