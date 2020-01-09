package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.LABEL_LOGGED;

public class Verify implements Question<Boolean> {

    private String label;

    public Verify(String label) {
        this.label = label;
    }

    public static Verify the(String label) {
        return new Verify(label);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelToCheck = Text.of(LABEL_LOGGED).viewedBy(actor).asString();
        return label.equals(labelToCheck);
    }
}
