package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;
    private String pdfDocumentPath;

    private By uploadButton = By.id("uploadButton");
    private By documentLink = By.id("documentLink");
    private By contentContainer = By.id("contentContainer");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void setPDFDocument(String path) {
        this.pdfDocumentPath = path;
    }

    public void uploadPDFDocument() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys(pdfDocumentPath);
        // Suponemos que después de cargar, el sistema almacena el documento de forma automática
    }

    public boolean isDocumentStored() {
        // Verificar si el documento está enlistado en el sistema después de cargarlo
        return driver.findElement(documentLink).isDisplayed();
    }

    public void openStoredDocument() {
        driver.findElement(documentLink).click();
        // Suponemos que al hacer clic se abre el documento en otro contenedor
    }

    public boolean isContentLegible() {
        // Verificar que el contenido del documento se despliega correctamente
        WebElement content = driver.findElement(contentContainer);
        return !content.getText().isEmpty();
    }
}