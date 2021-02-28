package pagefactory.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pagefactory.pages.BasePage;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertTrue;

public class CheckFiltersTest extends BaseTest {

    private final int MIN_VALUE = 42000;
    private final int MAX_VALUE = 43000;
    /*
    Вопрос на лекцию. Что делать лучше в случае, когда для функции нужна авторизация , куда её выносить, в отдельную функцию?
     */
    @Test
    public void checkRangePrice() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnIphoneButton();
        getIphonePage().insertMinValueInput(MIN_VALUE);
        getIphonePage().insertMaxValueInput(MAX_VALUE);
        getIphonePage().waitVisibilityOfElement(100, getIphonePage().getShowResultsButton());
        getIphonePage().clickOnShowResultsButton();
        getIphonePage().waitForPageLoadComplete(30);
        for (int price : getIphonePage().getPricesList()) {
            assertTrue(price>=MIN_VALUE&&price<=MAX_VALUE);
        }
    }
}
