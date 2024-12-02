Feature: PasswordStringValidator
  As a user
  I want to use a password to protect my account

  Scenario Outline: Check provided <passwordValue>
    Given I have a password
    When I use <passwordValue>
    Then the result should be <expectedResult>

    Examples:
      | passwordValue | expectedResult |
      | "Password123_-" | true |
      | "abcd" | false |
      | "GCashistheBest2020" | false |
      | "123456789" | false |
      | "Pasabay667@" | true |
