package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagefactory.pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public AppleStorePage getAppleStorePage() {
        return new AppleStorePage(getDriver());
    }

    public IphonePage getIphonePage() {
        return new IphonePage(getDriver());
    }

    public SignInPage getSignInPage() { return new SignInPage(getDriver()); }

    public ElectronicPage getElectronicPage(){return new ElectronicPage(getDriver());}

    public UserFavouritePage getUserFavouritePage(){return new UserFavouritePage(getDriver());}

    public SystemUnitsPage getSystemUnitsPage(){return new SystemUnitsPage(getDriver());}

    public UserProfilePage getUserProfilePage(){return new UserProfilePage(getDriver());}


}
