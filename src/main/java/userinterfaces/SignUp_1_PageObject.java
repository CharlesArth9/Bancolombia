package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUp_1_PageObject {

    public static final net.serenitybdd.screenplay.targets.Target BTN_SIGNUP = Target.the
            ("CLICK EN SIGN UP").located(By.xpath("(//a[@ui-sref='signup.personal'])[1]"));
     public static final net.serenitybdd.screenplay.targets.Target INPUT_NAME = Target.the
            ("Se ingresa nombre").located(By.cssSelector("input#firstName"));
    public static final net.serenitybdd.screenplay.targets.Target INPUT_LASTNAME = Target.the
            ("Se ingresa APELLIDO").located(By.cssSelector("input#lastName"));
   public static final net.serenitybdd.screenplay.targets.Target INPUT_EMAIL = Target.the
            ("Se ingresa CORREO").located(By.cssSelector("input#email"));

}
