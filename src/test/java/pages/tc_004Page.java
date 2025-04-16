package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    private WebDriver driver;

    private By loginPageIdentifier = By.id("login-page");
    private By accessDeniedMessage = By.id("access-denied-message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ensureUserIsLoggedOut() {
        // Implementar la lógica para asegurarse de que el usuario no está autenticado.
    }

    public void attemptToAccessUploadFunctionality() {
        // Implementar la lógica para intentar acceder a la funcionalidad de carga.
    }

    public boolean isOnLoginPage() {
        WebElement loginPageElement = driver.findElement(loginPageIdentifier);
        return loginPageElement.isDisplayed();
    }

    public boolean isAccessDeniedMessageDisplayed() {
        WebElement accessDeniedElem = driver.findElement(accessDeniedMessage);
        return accessDeniedElem.isDisplayed();
    }
}