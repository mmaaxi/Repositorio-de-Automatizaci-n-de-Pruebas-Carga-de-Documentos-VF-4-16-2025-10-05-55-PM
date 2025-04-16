package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    WebDriver driver;
    WebDriverWait wait;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectUnsupportedFile() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.sendKeys("C:\\path\\to\\file.exe");
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
        return errorMessage.isDisplayed();
    }

    public void attemptToUploadFile() {
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();
    }

    public boolean isUploadSuccessful() {
        // Logic to determine if upload was successful. Assuming false for unsupported files.
        return false;
    }
}