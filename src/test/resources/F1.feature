
Feature: [CALM-123] Customer WorkFlow Assertion
  Scenario: Create Customer account in LMS and GA successfully
    Given Customer_process workflow is invoked in LMS with correct data
    Then Customer_process workflow will complete successfully