import org.junit.Test;

public class homeworkTest extends BasicTest{

    @Test
    public void TestForGonciarz() {
       loginPage.logInToArena(ADMIN_LOGIN, ADMIN_PASSWORD);
        loggedPage.goToAdminPage();
        adminPage.checkIfTitleexists();
    }

}
