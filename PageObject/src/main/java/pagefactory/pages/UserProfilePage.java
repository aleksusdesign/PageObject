package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage{
    @FindBy(xpath = "//a[contains(@href,'favorite')][contains(@class,'ca')]")
    private WebElement favouritesButton;

    public UserProfilePage(WebDriver driver) {super(driver);};

    public void clickOnFavouritesButton(){favouritesButton.click();}
}
