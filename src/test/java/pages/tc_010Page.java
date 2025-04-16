package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By retryButton = By.id("retryButton");
    By successMessage = By.id("successMessage");

    public tc_010Page(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void startDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public void interruptNetworkConnection() {
        // Logic to simulate network interruption
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void retryDocumentUpload() {
        driver.findElement(retryButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}