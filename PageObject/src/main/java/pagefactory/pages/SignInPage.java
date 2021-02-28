package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement numberOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[contains(@class,'submit main')]")
    private WebElement logInButton;

    @FindBy(xpath = "//div[@class='ttl js_title']")
    private WebElement successLogInTitleOfPopup;

    @FindBy(xpath = "//div[@id='modalAlert']//button[@title='Close']")
    private WebElement closeLogInPopupButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void insertNumberOrEmail(String login){ numberOrEmailInput.sendKeys(login);}

    public void insertPassword(String password){ passwordInput.sendKeys(password);}

    public void clickOnLogInButton(){logInButton.click();}

    public String getTextOfTitleOfPopup(){ return successLogInTitleOfPopup.getText();}

    public void clickOnCloseLogInPopupButton(){closeLogInPopupButton.click();}

}
