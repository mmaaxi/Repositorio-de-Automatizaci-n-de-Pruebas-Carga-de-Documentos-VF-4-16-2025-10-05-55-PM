package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        page = new tc_008Page(driver);
        page.navigateToUploadPage();
    }

    @When("I upload a document and enable database logging")
    public void i_upload_a_document_and_enable_database_logging() {
        page.uploadDocument("path/to/document");
        page.enableDatabaseLogging();
    }

    @Then("the system stores the metadata correctly")
    public void the_system_stores_the_metadata_correctly() {
        boolean isMetadataStored = page.isMetadataStored();
        Assert.assertTrue("Metadata was not stored correctly", isMetadataStored);
    }

    @And("I can retrieve the information from the database")
    public void i_can_retrieve_the_information_from_the_database() {
        String dataFromDb = page.getDataFromDatabase();
        Assert.assertNotNull("Data could not be retrieved from the database", dataFromDb);
    }
}