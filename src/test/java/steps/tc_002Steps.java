package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("I am on the upload document page")
    public void i_am_on_the_upload_document_page() {
        page.navigateToUploadPage();
    }

    @When("I select an unsupported file format")
    public void i_select_an_unsupported_file_format() {
        page.selectUnsupportedFile();
    }

    @Then("I should see an error message indicating the file is not supported")
    public void i_should_see_an_error_message() {
        assertTrue(page.isErrorMessageDisplayed());
    }

    @When("I attempt to upload the rejected file")
    public void i_attempt_to_upload_the_rejected_file() {
        page.attemptToUploadFile();
    }

    @Then("the file upload should not be allowed")
    public void the_file_upload_should_not_be_allowed() {
        assertFalse(page.isUploadSuccessful());
    }
}