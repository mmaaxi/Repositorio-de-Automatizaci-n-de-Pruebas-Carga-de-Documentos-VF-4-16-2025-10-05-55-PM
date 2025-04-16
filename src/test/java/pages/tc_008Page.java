package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By enableLoggingCheckbox = By.id("enableLogging");
    By metadataVerification = By.id("metadataVerification");
    By retrievedData = By.id("retrievedData");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.navigate().to("http://example.com/upload");
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public void enableDatabaseLogging() {
        driver.findElement(enableLoggingCheckbox).click();
    }

    public boolean isMetadataStored() {
        return driver.findElement(metadataVerification).isDisplayed();
    }

    public String getDataFromDatabase() {
        return driver.findElement(retrievedData).getText();
    }
}