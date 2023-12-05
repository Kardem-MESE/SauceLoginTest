package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernamebox = By.cssSelector("#user-name");
    By passwordbox = By.cssSelector("#password");

    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLogin() {
        elementHelper.click(loginButton);
    }
    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String username) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"abcdef");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox, "123456");

    }

    public void writeCorrectUsernameForUsernameField(String username) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox, "standard_user");

    }

    public void writeFalsePasswordForPasswordField(String password) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox, "123456");
    }

    public void checkMessageForMatch(String error) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeFalseUsernameForUsernameField(String username) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"123aaa");
    }

    public void writeCorrectPasswordForPasswordField(String password) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox,"secret_sauce");
    }
}
