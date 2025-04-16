package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Tc_009Page;

public class Tc_009Steps {
    Tc_009Page page = new Tc_009Page();

    @Given("el usuario ha iniciado sesión correctamente")
    public void elUsuarioHaIniciadoSesionCorrectamente() {
        page.login();
    }

    @When("el usuario completa una carga de documento exitosa")
    public void elUsuarioCompletaUnaCargaDeDocumentoExitosa() {
        page.uploadDocument();
    }

    @Then("el sistema envía una notificación de confirmación al usuario")
    public void elSistemaEnvíaUnaNotificaciónDeConfirmaciónAlUsuario() {
        Assert.assertTrue(page.isConfirmationNotificationDisplayed());
    }

    @When("el usuario accede al historial de notificaciones")
    public void elUsuarioAccedeAlHistorialDeNotificaciones() {
        page.accessNotificationHistory();
    }

    @Then("el historial muestra el registro del documento recientemente cargado")
    public void elHistorialMuestraElRegistroDelDocumentoRecientementeCargado() {
        Assert.assertTrue(page.isDocumentInHistory());
    }
}