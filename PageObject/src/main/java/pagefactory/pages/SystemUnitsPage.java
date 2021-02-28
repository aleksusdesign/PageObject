package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemUnitsPage extends BasePage {

    @FindBy(xpath = "//button[@data-wishlist-add='234924']")
    private WebElement favouriteButton;

    @FindBy(xpath = "//div[@id='modalAlert']//button[@title='Close']")
    private WebElement closeAddFavouriteSuccessPopupButton;

    @FindBy(id = "modalAlert")
    private WebElement favouritePopup;



   public SystemUnitsPage(WebDriver driver){super(driver);}

   public void clickOnFavouriteButton(){favouriteButton.click();}

   public void clickOnCloseAddFavouriteSuccessPopupButton(){closeAddFavouriteSuccessPopupButton.click();}

   public WebElement getFavouritePopup(){return favouritePopup;}

}
