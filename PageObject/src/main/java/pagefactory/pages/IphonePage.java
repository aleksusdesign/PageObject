package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class IphonePage extends BasePage {


    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> pricesList;

    @FindBy(xpath = "//input[contains(@class,'min')]")
    private WebElement minValueInput;

    @FindBy(xpath = "//input[contains(@class,'max')]")
    private WebElement maxValueInput;

    @FindBy(xpath = "//div[contains(@class, 'open-f')]//a")
    private WebElement showResultsButton;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void insertMinValueInput(int value){
        minValueInput.clear();
        minValueInput.sendKeys(Integer.toString(value));
    }

    public void insertMaxValueInput(int value){
        maxValueInput.clear();
        maxValueInput.sendKeys(Integer.toString(value));
    }

    public WebElement getShowResultsButton(){ return showResultsButton;}

    public void clickOnShowResultsButton(){ showResultsButton.click();}

    public List<Integer> getPricesList() {
        List<Integer> list = new ArrayList<>();
        for(WebElement webElement : pricesList)
        {
            list.add(Integer.parseInt(webElement.getText().split(" ")[0]));
        }

        return list;
    }
}
