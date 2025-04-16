package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;
    
    By inputUpload = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By fileDetails = By.id("file-details");
    By successNotification = By.id("success-notification");
    By documentList = By.id("document-list");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void seleccionarArchivoPDF(String filePath) {
        driver.findElement(inputUpload).sendKeys(filePath);
    }

    public boolean seMuestranDetallesDelArchivo() {
        return driver.findElement(fileDetails).isDisplayed();
    }

    public void clicEnCargarDocumento() {
        driver.findElement(uploadButton).click();
    }

    public boolean seMuestraNotificacionDeExito() {
        return driver.findElement(successNotification).isDisplayed();
    }
    
    public boolean elDocumentoApareceEnLaLista() {
        return driver.findElements(documentList).size() > 0;
    }

    public boolean verificarDetallesEnLista(String fileName, String uploadDate) {
        // Implementar logic para encontrar el archivo y verificar los detalles
        return driver.findElement(documentList).getText().contains(fileName) &&
               driver.findElement(documentList).getText().contains(uploadDate);
    }
}