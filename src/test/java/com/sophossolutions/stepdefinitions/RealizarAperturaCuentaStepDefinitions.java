package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.IniciarSesion;
import com.sophossolutions.tasks.RegistroDeCuentaParaBank;
import com.sophossolutions.userinterfaces.HomePageParaBank;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RealizarAperturaCuentaStepDefinitions {


    @Before
    public void setup()
    {
        setTheStage(new OnlineCast());
    }

    @Given("Deseo ir a la pagina ParaBank")
    public void deseoIrALaPaginaParaBank() {
        theActorCalled("JHON").wasAbleTo(Open.browserOn().the(new HomePageParaBank()));
    }

    @When("realizar el registro de la cuenta {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void realizarElRegistroDeLaCuenta(String firstname, String lastname, String adres, String city, String state, String Zipcode, String phone, String ssn, String username, String password, String rPassword)
    {
        theActorInTheSpotlight().attemptsTo(RegistroDeCuentaParaBank.registroDeCuentaParaBank(firstname, lastname, adres, city, state, Zipcode, phone, ssn, username, password, rPassword));
    }



    @When("loguearse con usuario {string} y password {string}")
    public void loguearseConUsuarioYPassword(String username, String password) {

        theActorInTheSpotlight().attemptsTo(IniciarSesion.iniciarSesion(username, password));

    }
    @Then("verificar el numero de la cuenta en el resumen de la cuenta")
    public void verificarElNumeroDeLaCuentaEnElResumenDeLaCuenta() {

    }


}
