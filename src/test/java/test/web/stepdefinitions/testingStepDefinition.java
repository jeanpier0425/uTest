package test.web.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.IngresarCiudad;
import task.PasoDatosPersonales;
import task.UtestTask;
import task.abrirpagina;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class testingStepDefinition {

    @Before
    public void PrepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^abro la pagina$")
    public void abroLaPagina() {
        theActorCalled("user").wasAbleTo(abrirpagina.conlaUrl());
    }


    @Cuando("^me quiero registrar con los datos personales$")
    public void meQuieroRegistrar(List<Map<String,String>> data) {
        theActorInTheSpotlight().attemptsTo(UtestTask.join(),
                PasoDatosPersonales.alFormulario(data)
        );
    }

    @Cuando("^Adiciono mi ciudad de destino (.*)$")
    public void ingresociudad(String city) {
        theActorInTheSpotlight().attemptsTo(
                IngresarCiudad.enelCampo(city)
        );
    }




}
