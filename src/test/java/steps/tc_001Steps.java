package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("que estoy en la página de carga de documentos")
    public void queEstoyEnLaPaginaDeCargaDeDocumentos() {
        driver.get("http://example.com/carga-documentos");
    }

    @When("selecciono un archivo PDF válido desde el explorador de archivos")
    public void seleccionoUnArchivoPDFValidoDesdeElExploradorDeArchivos() {
        page.seleccionarArchivoPDF("ruta/al/archivo.pdf");
    }

    @Then("el sistema reconoce el archivo y muestra sus detalles")
    public void elSistemaReconoceElArchivoYMuestraSusDetalles() {
        Assert.assertTrue(page.seMuestranDetallesDelArchivo());
    }

    @When("hago clic en el botón 'Cargar documento'")
    public void hagoClicEnElBotonCargarDocumento() {
        page.clicEnCargarDocumento();
    }

    @Then("el documento se carga correctamente y se muestra una notificación de éxito")
    public void elDocumentoSeCargaCorrectamenteYSeMuestraUnaNotificacionDeExito() {
        Assert.assertTrue(page.seMuestraNotificacionDeExito());
    }

    @Then("verifico que el documento aparezca en la lista de documentos")
    public void verificoQueElDocumentoAparezcaEnLaListaDeDocumentos() {
        Assert.assertTrue(page.elDocumentoApareceEnLaLista());
    }
    
    @Then("el documento se muestra en la lista con su nombre y fecha de carga")
    public void elDocumentoSeMuestraEnLaListaConSuNombreYFechaDeCarga() {
        Assert.assertTrue(page.verificarDetallesEnLista("nombreArchivo.pdf", "fechaActual"));
    }
}