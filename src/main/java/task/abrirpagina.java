package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class abrirpagina implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.utest.com/")
        );
    }

    public static abrirpagina conlaUrl(){
        return Tasks.instrumented(abrirpagina.class);
    }
}
