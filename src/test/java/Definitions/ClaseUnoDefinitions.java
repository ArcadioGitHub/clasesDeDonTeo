package Definitions;

import Locators.ClaseUnoPageObjects;
import Tests.ClaseUnoTest;
import Utilities.Utils;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class ClaseUnoDefinitions {

    Utils utils;
    ClaseUnoTest claseunotest;

    @Given("^El usuario abre la pagina (.*)$")
    public void elUsuarioAbreLaPagina(String url)  {
        utils.openMainPage(url);
    }

    @And("^El usuario hace click en el boton let me hack$")
    public void elUsuarioHaceClickEnElBotonLetMeHack() {
        claseunotest.clickEnBotonLetMeHack();
    }

    @When("^El usuario llena el formulario$")
    public void elUsuarioLlenaElFormulario(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        claseunotest.llenarFormulario(rows);
    }

    @And("^El usuario hace click en el boton submit$")
    public void elUsuarioHaceClickEnElBotonSubmit() {
        claseunotest.clickEnBotonSubmit();
    }

    @Then("^El usuario verifica el mensaje de exito (.*)$")
    public void elUsuarioVerificaElMensajeDeExito(String mensajeExito) { claseunotest.verificarMensajeDeExito(mensajeExito);
    }
}
