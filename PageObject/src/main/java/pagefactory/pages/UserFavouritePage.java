package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserFavouritePage extends BasePage{
    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    List<WebElement> favouritesList;

    @FindBy(xpath = "//button[@data-wishlist-remove='234924']")
    private WebElement favouriteElementRemoveButton;

    public UserFavouritePage(WebDriver driver){super(driver);}

    public int getSizeOfFavouritesList() {
        return favouritesList.size();
    }

    public void clickOnFavouriteElementRemoveButton(){favouriteElementRemoveButton.click();}

}
