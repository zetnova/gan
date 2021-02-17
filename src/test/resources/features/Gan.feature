Feature:

  @Test1
  Scenario: Question 1
    Given open https://moneygaming.qa.gameaccount.com/
    When click to ‘Join Now’
    And select a title value from the dropdown
    And enter your first name and surname in the form
    And check the tickbox with text I accept the Terms and Conditions and certify that I am over  the age of 18
    And submit the form by clicking the JOIN NOW button
    Then validate that a validation message with text ‘This field is required’ appears under the date of birth box

    @Test2
  Scenario Outline: Question 2 //Negative Test Scenarios
    Given open https://moneygaming.qa.gameaccount.com/
    When click to ‘Join Now’
    And select a title value from the dropdown
    And enter your first name and surname in the form
    And select Date of Birth
    And fill up the rest of required fields and add format of "<passwords>" and "<retypePasswords>"
      And check the tickbox with text I accept the Terms and Conditions and certify that I am over  the age of 18
      And submit the form by clicking the JOIN NOW button
      Then validate that error message 'Invalid password. Please retry using a valid password.'appears

      Examples:
        | passwords| retypePasswords |
        | zzzzzz  |    zzzzzz       |
        | @@@@@@   |    @@@@@@       |
        | 222aaa   |    222aaa       |
        | 333555   |    333555       |

  @Test3
  Scenario Outline: Question 2 //Positive Test Scenarios
    Given open https://moneygaming.qa.gameaccount.com/
    When click to ‘Join Now’
    And select a title value from the dropdown
    And enter your first name and surname in the form
    And select Date of Birth
    And fill up the rest of required fields and add format of "<correctPasswords>" and "<correctRetypePasswords>"
    And check the tickbox with text I accept the Terms and Conditions and certify that I am over  the age of 18
    And submit the form by clicking the JOIN NOW button
    Then validate that error message 'Invalid password. Please retry using a valid password.'appears

    Examples:
      | correctPasswords| correctRetypePasswords |
      | Zzz@333  |    Zzz@333       |