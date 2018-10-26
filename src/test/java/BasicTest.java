import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class BasicTest {
    WebDriver driver;
    LoginPage loginPage;
    LoggedPage loggedPage;
    AdminPage adminPage;
    String ADMIN_LOGIN = "administrator@testarena.pl";
    String ADMIN_PASSWORD = "sumXQQ72$L";
    String baseURL = "http://demo.testarena.pl";

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loggedPage = PageFactory.initElements(driver, LoggedPage.class);
        adminPage = PageFactory.initElements(driver, AdminPage.class);
        driver.get(baseURL);
    }

    @After
    public void shouldLoginToTestArena() {
        driver.quit();
    }
}