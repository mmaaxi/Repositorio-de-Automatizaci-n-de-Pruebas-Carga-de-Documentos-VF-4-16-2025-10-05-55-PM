Feature: Database Integration

  Scenario: Verify link to database
    Given I am on the document upload page
    When I upload a document and enable database logging
    Then the system stores the metadata correctly
    And I can retrieve the information from the database