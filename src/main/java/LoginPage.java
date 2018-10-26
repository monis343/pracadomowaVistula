import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy (id = "email")
    WebElement emailInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "login")
    WebElement loginButton;

    public void logInToArena(String email, String pass) {

        emailInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        loginButton.click();

    }


}
