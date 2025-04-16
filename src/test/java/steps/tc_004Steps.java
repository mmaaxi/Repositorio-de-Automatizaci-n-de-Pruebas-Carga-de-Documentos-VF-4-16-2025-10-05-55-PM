package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario no está autenticado")
    public void el_usuario_no_esta_autenticado() {
        page.ensureUserIsLoggedOut();
    }

    @When("el usuario intenta acceder a la funcionalidad de carga")
    public void el_usuario_intenta_acceder_a_la_funcionalidad_de_carga() {
        page.attemptToAccessUploadFunctionality();
    }

    @Then("el sistema debe redirigir al usuario a la pantalla de inicio de sesión")
    public void el_sistema_debe_redirigir_al_usuario_a_la_pantalla_de_inicio_de_sesion() {
        Assert.assertTrue("El usuario no fue redirigido a la pantalla de inicio de sesión", page.isOnLoginPage());
    }

    @Then("debe mostrar un mensaje de acceso denegado")
    public void debe_mostrar_un_mensaje_de_acceso_denegado() {
        Assert.assertTrue("No se mostró un mensaje de acceso denegado", page.isAccessDeniedMessageDisplayed());
    }
}