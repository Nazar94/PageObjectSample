import org.openqa.selenium.WebDriver;

public class Main {

    static WebDriver driver;

    public static void main(String [] args){
/*
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://github.com/join");

 //      MainPage mainPage = new MainPage(driver);

  //      MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

     //   mainPage.register("user11", "email@ua.com", "password");
 /*       mainPage.register("user", "user@mail.com", "password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage.clickSignIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*//*
        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.registerInvalidCreds("idf", "sdaw", "awdWA");
        System.out.print(signUpPage.getMainError());


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        driver.get("https://github.com");
        mainPage.clickSignIn();//returns Login page call methos sign in on main page
      //  String heading = loginPage.getHeadingText();
*/
    }

}
