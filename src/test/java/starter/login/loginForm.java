package starter.login;

import org.openqa.selenium.By;

public class loginForm {
    public static By USERNAME_FIELD = By.id("user-name");
    public static By PASSWORD_FIELD = By.id("password");
    public static By BUTTON_NAME = By.id("login-button");
    public static By BUTTON_ADD1 = By.cssSelector("button[name =add-to-cart-sauce-labs-backpack]");
    public static By BUTTON_ADD2 = By.cssSelector("button[name =add-to-cart-sauce-labs-bike-light]");
    public static By BUTTON_ADD3 = By.cssSelector("button[name =\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
}
