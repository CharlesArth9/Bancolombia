package com.example.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Datos;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.DiligenciarFormulario;
import tasks.Ingresar;

import java.util.List;

import static userinterfaces.SignUp_1_PageObject.BTN_SIGNUP;

public class EjercicioStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^Carlos ingresa a la pagina de practica de automatizacion$")
    public void carlosIngresaALaPaginaDePracticaDeAutomatizacion() {
        OnStage.theActorCalled("Carlos").wasAbleTo(Ingresar.alaPagina());
    }


    @When("^Carlos se registra con la siguiente informacion$")
    public void carlosSeRegistraConLaSiguienteInformacion(List<Datos> datos) {
        OnStage.theActorCalled("Carlos").wasAbleTo(Click.on(BTN_SIGNUP));
        OnStage.theActorCalled("Carlos").wasAbleTo(DiligenciarFormulario.conLaInformacion(datos));


    }

    @Then("^Carlos verifica que el registro fue correcto$")
    public void carlosVerificaQueElRegistroFueCorrecto() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

}
