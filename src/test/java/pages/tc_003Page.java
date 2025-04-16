package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;
    By fileInput = By.id("fileInput");
    By errorMessage = By.id("error");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://www.example.com/upload");
    }

    public void uploadLargeFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}