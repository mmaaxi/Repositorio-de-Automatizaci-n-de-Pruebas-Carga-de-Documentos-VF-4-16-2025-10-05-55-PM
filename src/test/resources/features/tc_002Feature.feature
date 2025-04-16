Feature: Document Upload with Unsupported Format

  Scenario: Attempt to upload an unsupported file format
    Given I am on the upload document page
    When I select an unsupported file format
    Then I should see an error message indicating the file is not supported
    When I attempt to upload the rejected file
    Then the file upload should not be allowed