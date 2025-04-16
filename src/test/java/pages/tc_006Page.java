package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;

    By fileInput = By.id("file-input");
    By progressIndicator = By.id("progress-indicator");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public void verifyProgressIndicatorsDisplayed() {
        WebElement indicator = driver.findElement(progressIndicator);
        if (!indicator.isDisplayed()) {
            throw new AssertionError("Progress indicator not displayed");
        }
    }

    public void verifyVisualFeedback() {
        // Add checks for visual feedback here
        // For example: Check if a success message or icon is displayed
    }
}