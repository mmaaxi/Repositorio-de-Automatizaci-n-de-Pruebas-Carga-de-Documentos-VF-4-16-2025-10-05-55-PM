package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page documentPage = new tc_005Page();

    @Given("el usuario tiene un documento PDF predefinido y conocido")
    public void el_usuario_tiene_un_documento_PDF_predefinido_y_conocido() {
        // Prepara el documento PDF para la prueba
        documentPage.setPDFDocument("ruta/del/documento/documentoConocido.pdf");
    }

    @When("el usuario carga el documento PDF en el sistema")
    public void el_usuario_carga_el_documento_PDF_en_el_sistema() {
        documentPage.uploadPDFDocument();
    }

    @Then("el documento debe almacenarse correctamente")
    public void el_documento_debe_almacenarse_correctamente() {
        Assert.assertTrue("El documento no se almacenó correctamente", documentPage.isDocumentStored());
    }

    @When("el usuario abre el documento cargado")
    public void el_usuario_abre_el_documento_cargado() {
        documentPage.openStoredDocument();
    }

    @Then("el contenido del documento debe ser legible y sin corrupción")
    public void el_contenido_del_documento_debe_ser_legible_y_sin_corrupcion() {
        Assert.assertTrue("El contenido del documento está corrupto o ilegible", documentPage.isContentLegible());
    }
}