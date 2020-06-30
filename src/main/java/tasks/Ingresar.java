package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.IngresoPageObject;

public class Ingresar implements Task {
    private IngresoPageObject page;

    public static Ingresar alaPagina(){
        return Tasks.instrumented(Ingresar.class);
    }

    @Override


    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(page));
    }
}
