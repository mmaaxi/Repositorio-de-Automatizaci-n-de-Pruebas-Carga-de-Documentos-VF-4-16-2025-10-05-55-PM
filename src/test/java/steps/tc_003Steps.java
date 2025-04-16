package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page;

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        // Inicializar el WebDriver y dirigir al usuario a la página de carga
        driver = ... // Inicializar el WebDriver aquí
        page = new tc_003Page(driver);
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo que excede el tamaño máximo permitido")
    public void el_usuario_selecciona_un_archivo_que_excede_el_tamaño_máximo_permitido() {
        page.uploadLargeFile("path/to/large/file");
    }

    @Then("El sistema muestra un mensaje de error indicando que el archivo excede el tamaño permitido")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_que_el_archivo_excede_el_tamaño_permitido() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}