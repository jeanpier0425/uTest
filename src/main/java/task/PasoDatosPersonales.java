package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import java.util.Map;

import static userinterface.utestPage.*;

public class PasoDatosPersonales implements Task {

    List<Map<String,String>> datospersonales;

    public PasoDatosPersonales(List<Map<String,String>> data) {
        this.datospersonales = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datospersonales.get(0).get("firstname")).into(NOMBRE),
                Enter.theValue(datospersonales.get(0).get("lastname")).into(APELLIDO),
                Enter.theValue(datospersonales.get(0).get("email")).into(EMAIL),
                SelectFromOptions.byVisibleText(datospersonales.get(0).get("month")).from(MES),
                SelectFromOptions.byVisibleText(datospersonales.get(0).get("day")).from(DIA),
                SelectFromOptions.byVisibleText(datospersonales.get(0).get("year")).from(ANIO),
                Click.on(NEXT)
        );
    }


    public static PasoDatosPersonales alFormulario(List<Map<String,String>> data){
        return Tasks.instrumented(PasoDatosPersonales.class,data);
    }


}
