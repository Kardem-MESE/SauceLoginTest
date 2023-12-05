package StepDefiniton;

import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPagesStepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("write {string} for username field")
    public void writeForUsernameField(String Username) {
        loginPage.writeUsernameForUsernameField(Username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) { loginPage.writePasswordForPasswordField(password);
    }

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String username) { loginPage.writeCorrectUsernameForUsernameField(username);
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String password) { loginPage.writeFalsePasswordForPasswordField(password);
    }

    @Then("Check {string} message about don't match")
    public void checkMessageAboutDonTMatch(String error) { loginPage.checkMessageForMatch(error);
    }

    @When("write False {string} for username field")
    public void writeFalseForUsernameField(String username) { loginPage.writeFalseUsernameForUsernameField(username);
    }

    @When("write Correct {string} for password field")
    public void writeCorrectForPasswordField(String password) { loginPage.writeCorrectPasswordForPasswordField(password);
    }
}
