package pagefactory.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class AddToFavouriteTest extends BaseTest {

    private final String EMAIL = "aleksus20103@gmail.com";
    private final String PASSWORD = "adminadmin";
    private final int EXPECTED_SIZE_OF_FAVOURITES = 1;
    @Test
    public void checkAddFavourite(){
        getHomePage().clickOnSignInIcon();
        getSignInPage().insertNumberOrEmail(EMAIL);
        getSignInPage().insertPassword(PASSWORD);
        getSignInPage().clickOnLogInButton();
        getSignInPage().clickOnCloseLogInPopupButton();
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnElectronicButton();
        getElectronicPage().clickOnSystemUnitsButton();
        getHomePage().waitForPageLoadComplete(30);
        getSystemUnitsPage().clickOnFavouriteButton();
        getHomePage().waitVisibilityOfElement(30,getSystemUnitsPage().getFavouritePopup());
        getSystemUnitsPage().clickOnCloseAddFavouriteSuccessPopupButton();
        getHomePage().clickOnSignInIcon();
        getUserProfilePage().clickOnFavouritesButton();
        assertEquals(getUserFavouritePage().getSizeOfFavouritesList(), EXPECTED_SIZE_OF_FAVOURITES);
        getUserFavouritePage().clickOnFavouriteElementRemoveButton();
    }

}
