package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("el usuario inicia una carga de documento")
    public void el_usuario_inicia_una_carga_de_documento() {
        page.navigateToUploadPage();
        page.startDocumentUpload();
    }

    @When("el usuario interrumpe la conexión durante la carga")
    public void el_usuario_interrumpe_la_conexion_durante_la_carga() {
        page.interruptNetworkConnection();
    }

    @Then("el sistema debe cancelar la carga y mostrar un mensaje de error relevante")
    public void el_sistema_debe_cancelar_la_carga_y_mostrar_un_mensaje_de_error_relevante() {
        Assert.assertTrue(page.isErrorDisplayed());
    }

    @When("el usuario reintenta la carga del documento")
    public void el_usuario_reintenta_la_carga_del_documento() {
        page.retryDocumentUpload();
    }

    @Then("el sistema debe permitir reintentar sin duplicar el registro o corromper los datos")
    public void el_sistema_debe_permitir_reintentar_sin_duplicar_el_registro_o_corromper_los_datos() {
        Assert.assertTrue(page.isUploadSuccessful());
    }
}