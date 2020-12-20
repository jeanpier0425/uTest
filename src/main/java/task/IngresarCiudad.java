package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.HoverOverBy;

import java.awt.*;
import java.awt.event.KeyEvent;

import static userinterface.utestPage.CITY;

public class IngresarCiudad implements Task {

    private String city;
    Robot robot = new Robot();

    public IngresarCiudad(String city) throws AWTException {
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(CITY)
        );
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(5000);

    }

    public static IngresarCiudad enelCampo(String city){
        return Tasks.instrumented(IngresarCiudad.class,city);
    }
}
