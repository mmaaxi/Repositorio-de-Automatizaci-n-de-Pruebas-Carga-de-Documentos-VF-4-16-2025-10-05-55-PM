package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page uploadPage;

    public tc_006Steps() {
        uploadPage = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        uploadPage.openUploadPage();
    }

    @When("the user selects a file to upload")
    public void the_user_selects_a_file_to_upload() {
        uploadPage.selectFile("path/to/file");
    }

    @Then("the UI should display progress indicators")
    public void the_UI_should_display_progress_indicators() {
        uploadPage.verifyProgressIndicatorsDisplayed();
    }

    @Then("the UI should provide correct visual feedback")
    public void the_UI_should_provide_correct_visual_feedback() {
        uploadPage.verifyVisualFeedback();
    }
}