package pagefactory.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LogInTests extends BaseTest {

    private final String EMAIL = "aleksus20103@gmail.com";
    private final String PASSWORD = "adminadmin";
    private final String EXPECTED_TITLE = "";

    @Test
    public void checkSuccessLogIn() {
        getHomePage().clickOnSignInIcon();
        getSignInPage().insertNumberOrEmail(EMAIL);
        getSignInPage().insertPassword(PASSWORD);
        getSignInPage().clickOnLogInButton();
        assertEquals(getSignInPage().getTextOfTitleOfPopup(),EXPECTED_TITLE);
    }

}
