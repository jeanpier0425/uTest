package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.utestPage.JOIN_TODAY;

public class UtestTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JOIN_TODAY)
        );
    }

    public static UtestTask join(){
        return Tasks.instrumented(UtestTask.class);
    }


}
