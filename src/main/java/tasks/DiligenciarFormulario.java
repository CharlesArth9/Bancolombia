package tasks;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.SignUp_1_PageObject.*;

public class DiligenciarFormulario implements Task {
    List <Datos> datos;

    public DiligenciarFormulario(List<Datos> datos) {
        this.datos = datos;
    }

    public static DiligenciarFormulario conLaInformacion(List<Datos> datos){
        return Tasks.instrumented(DiligenciarFormulario.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.wasAbleTo(
                Enter.theValue(datos.get(0).getName()).into(INPUT_NAME),
                Enter.theValue(datos.get(0).getLastname()).into(INPUT_LASTNAME),
                Enter.theValue(datos.get(0).getEmail()).into(INPUT_EMAIL));



    }
}
