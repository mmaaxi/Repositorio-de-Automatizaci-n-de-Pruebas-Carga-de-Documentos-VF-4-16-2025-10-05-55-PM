Feature: Validate UI during file upload

  Scenario: User observes UI during file selection and upload
    Given the user is on the file upload page
    When the user selects a file to upload
    Then the UI should display progress indicators
    And the UI should provide correct visual feedback