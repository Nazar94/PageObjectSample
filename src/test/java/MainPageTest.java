import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;



public class MainPageTest {

    static WebDriver driver;
   // private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;
    


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
       // mainPage = new MainPage(driver);
        mainPage= PageFactory.initElements(driver, MainPage.class);
        loginPage= PageFactory.initElements(driver, LoginPage.class);
        signUpPage= PageFactory.initElements(driver, SignUpPage.class);
    }

    @Test

    public void signInTest() {
           // LoginPage loginPage = mainPage.clickSignIn();//returns Login page call methos sign in on main page
            loginPage = mainPage.clickSignIn();
            String heading = loginPage.getHeadingText();
            Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void registerFailTest(){
       // SignUpPage signUpPage = mainPage.register("testuser","email@mail.com", "password");
        signUpPage = mainPage.register("testuser","email@mail.com", "password");
        String error = signUpPage.getMainError();
        Assert.assertEquals("There were problems creating your account.", error);
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
