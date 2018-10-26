import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedPage {

    @FindBy (css = ".header_admin")
    WebElement adminButton;

    public void goToAdminPage(){
        adminButton.click();
    }

}
