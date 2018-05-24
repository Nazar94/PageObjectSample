import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

 //   private WebDriver driver;
    static WebDriver driver;
/*
    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

*/


    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[text()='Sign up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@id='user[login]']")
    private WebElement userLoginInput;

    @FindBy(xpath = "//input[@id='user[email]']")
    private WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='user[password]']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[text()='Sign up for GitHub']")
    private WebElement signUpForGitButton;

    public LoginPage clickSignIn(){
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp(){
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage signUpForGitButton(){
        signUpForGitButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String username){
        userLoginInput.sendKeys(username);
        return this;
    }

    public MainPage typeEmail(String email){
        userEmailInput.sendKeys(email);
        return this;
    }

    public MainPage typePassword(String password){
        userPassword.sendKeys(password);
        return this;
    }

    public SignUpPage register(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickSignUp();
        return new SignUpPage(driver);
    }

}
