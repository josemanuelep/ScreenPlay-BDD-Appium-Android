package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;

public class Login implements Task {
    private String userName;
    private String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static Login with(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(userName).into(INPUT_USERNAME),
            Click.on(BTN_NEXT_IN_USERNAME),
            Click.on(BTN_ENTER_PASSWORD_INSTEAD),
            Enter.theValue(password).into(INPUT_PASSWORD),
            Click.on(BTN_NEXT_IN_PASSWORD)
    );
    }
}
