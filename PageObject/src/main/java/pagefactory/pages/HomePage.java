package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleSoreButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//div[contains(@class,'bottom__login')]//i[@class='icon icon-user-big']")
    private WebElement signInIcon;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'elektronika')]")
    private WebElement electronicButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickOnElectronicButton(){electronicButton.click();}

    public void clickOnSignInIcon() {
        signInIcon.click();
    }

    public void clickOnAppleStoreButton() {
        appleSoreButton.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

}
