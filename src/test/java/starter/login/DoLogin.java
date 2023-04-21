package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.sound.midi.Instrument;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {
    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public static Performable withredentials(String username,String password){
        return instrumented(DoLogin.class,username,password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(loginForm.USERNAME_FIELD),
                Enter.theValue(password).into(loginForm.PASSWORD_FIELD),
                Click.on(loginForm.BUTTON_NAME),
                Click.on(loginForm.BUTTON_ADD1),
                Click.on(loginForm.BUTTON_ADD2),
                Click.on(loginForm.BUTTON_ADD3)


        );

    }
}
