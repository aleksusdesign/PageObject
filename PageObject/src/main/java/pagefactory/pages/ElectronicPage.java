package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicPage extends BasePage {
    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'gotovyie-pk')]")
    private WebElement systemUnitsButton;

    public ElectronicPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSystemUnitsButton(){systemUnitsButton.click();}
}
