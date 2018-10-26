import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

    @FindBy (xpath = "//h1[contains(text(), 'Projekty')]")
    WebElement title;

    public void checkIfTitleexists(){
        assert title.isDisplayed();
    }

}
