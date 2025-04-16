package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    
    tc_007Page page = new tc_007Page();

    @Given("el sistema está listo para cargar documentos")
    public void el_sistema_esta_listo_para_cargar_documentos() {
        page.setupEnvironment();
    }

    @When("inicio el proceso de carga de múltiples documentos simultáneamente")
    public void inicio_el_proceso_de_carga_de_multiples_documentos_simultaneamente() {
        page.uploadMultipleDocuments();
    }

    @Then("el sistema mantiene un rendimiento aceptable sin mayores latencias")
    public void el_sistema_mantiene_un_rendimiento_aceptable_sin_mayores_latencias() {
        boolean isPerformanceAcceptable = page.isPerformanceAcceptable();
        Assert.assertTrue("El rendimiento no es aceptable", isPerformanceAcceptable);
    }

    @Then("verifico que el tiempo de respuesta para cada carga está dentro de los SLA definidos")
    public void verifico_que_el_tiempo_de_respuesta_para_cada_carga_esta_dentro_de_los_sla_definidos() {
        boolean areResponseTimesWithinSLA = page.areResponseTimesWithinSLA();
        Assert.assertTrue("El tiempo de respuesta no cumple con los SLA", areResponseTimesWithinSLA);
    }
}