@opentext
Feature: OpenText Tests

  @opentext.s1
  Scenario:
    Given the login view is currently displayed
    When the username field is not populated
    Then the submit button should be disabled

  @opentext.s2
  Scenario:
    Given the login view is currently displayed
    When the password field is not populated
    Then the submit button should be disabled
