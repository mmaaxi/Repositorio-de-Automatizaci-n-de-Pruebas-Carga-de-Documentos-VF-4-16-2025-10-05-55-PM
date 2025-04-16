package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_009Page {
    WebDriver driver;

    By loginButton = By.id("loginButton");
    By uploadButton = By.id("uploadButton");
    By notificationMessage = By.id("notificationMessage");
    By notificationHistoryLink = By.id("notificationHistoryLink");
    By documentRecord = By.xpath("//div[contains(text(), 'Documento cargado')]");

    public Tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.findElement(loginButton).click();
        // Assuming that login is successful
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).sendKeys("/path/to/document.pdf");
        driver.findElement(uploadButton).submit();
    }

    public boolean isConfirmationNotificationDisplayed() {
        return driver.findElement(notificationMessage).isDisplayed();
    }

    public void accessNotificationHistory() {
        driver.findElement(notificationHistoryLink).click();
    }

    public boolean isDocumentInHistory() {
        return driver.findElement(documentRecord).isDisplayed();
    }
}