import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

  //  private WebDriver driver;

    static WebDriver driver;
/*
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


  */

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='login_field']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField ;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[contains(@class,'auth-form-header p-0')]/h1[text()='Sign in to GitHub']")
    private  WebElement heading;

    @FindBy(xpath = "//div[@id='js-flash-container']//div[@class='container']")
    private WebElement error;

    @FindBy(xpath = "//a[text()='Create an account']")
    private WebElement createAccountLink;

    public LoginPage typeUsername(String username){
        loginField.sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage loginWithInvalidCreds(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        signInButton.click();
        return new LoginPage(driver);
    }

    public String getHeadingText(){
        return heading.getText();
    }

    public String getError(){
        return error.getText();
    }

    public SignUpPage createAccount(){
        createAccountLink.click();
        return new SignUpPage(driver);
    }
    /*


    private By loginField = By.xpath("//input[@id='login_field']");

    private By passwordField = By.xpath("//input[@id='password']");

    private By signInButton = By.xpath("//input[@value='Sign in']");

    private  By heading = By.xpath("//div[contains(@class,'auth-form-header p-0')]/h1[text()='Sign in to GitHub']");

    private By error = By.xpath("//div[@id='js-flash-container']//div[@class='container']");

    private By createAccountLink = By.xpath("//a[text()='Create an account']");

    public LoginPage typeUsername(String username){
        driver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage loginWithInvalidCreds(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }

    public String getError(){
        return driver.findElement(error).getText();
    }

    public SignUpPage createAccount(){
        driver.findElement(createAccountLink).click();
        return new SignUpPage(driver);
    }
    */
}
