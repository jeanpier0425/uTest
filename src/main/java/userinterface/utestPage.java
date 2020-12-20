package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class utestPage {

    public static final Target JOIN_TODAY  = Target.the("boton login").located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Join Today')]"));
    public static final Target NOMBRE  = Target.the("campo nombre").located(By.xpath("//input[@id='firstName']"));
    public static final Target APELLIDO  = Target.the("campo apellido").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL  = Target.the("campo email").located(By.xpath("//input[@id='email']"));
    public static final Target MES  = Target.the("campo mes").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DIA  = Target.the("campo mes").located(By.xpath("//select[@id='birthDay']"));
    public static final Target ANIO  = Target.the("campo mes").located(By.xpath("//select[@id='birthYear']"));
    public static final Target NEXT  = Target.the("campo mes").located(By.xpath("//span[text()='Next: Location']"));
    public static final Target CITY  = Target.the("campo mes").located(By.xpath("//input[@id='city']"));


}
