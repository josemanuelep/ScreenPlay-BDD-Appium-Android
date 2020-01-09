package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USERNAME = Target.the("User name input").located(By.id("org.wordpress.android:id/input"));
    public static final Target BTN_NEXT_IN_USERNAME = Target.the("Next in the mail screen").located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target BTN_ENTER_PASSWORD_INSTEAD = Target.the("A little linkeable text to enter the password").located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target INPUT_PASSWORD = Target.the("Password input").located(By.id("org.wordpress.android:id/input"));
    public static final Target BTN_NEXT_IN_PASSWORD = Target.the("Next button in finish screen").located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target LABEL_LOGGED = Target.the("Next button in finish screen").located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
