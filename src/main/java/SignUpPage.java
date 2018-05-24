import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {

 //   private WebDriver driver;

    static WebDriver driver;
/*
    public SignUpPage(WebDriver driver) {

        this.driver = driver;
    }

*/

    public SignUpPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
/*
    private By heading = By.xpath("//div[@class='setup-header setup-org']/h1");

    private By userNameInput = By.xpath("//input[@id='user_login']");

    private By userEmailInput = By.xpath("//input[@id='user_email']");

    private By userPasswordInput = By.xpath("//input[@id='user_password']");

    private By createAccountButton = By.xpath("//button[@id='signup_button']");

    private By mainError = By.xpath("//form[@id='signup-form']/div[@class='flash flash-error my-3']");

    private By nameError = By.xpath("//input[@id='user_login']/ancestor::dd/following-sibling::dd");

    private By emailError = By.xpath("//input[@id='user_email']/ancestor::dd/following-sibling::dd");

    private By passwordError = By.xpath("///input[@id='user_password']/ancestor::dd/following-sibling::dd");



*/
    @FindBy(xpath = "//div[@class='setup-header setup-org']/h1")
    private WebElement heading;

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement userPasswordInput;

    @FindBy(xpath = "//button[@id='signup_button']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//form[@id='signup-form']/div[@class='flash flash-error my-3']")
    private WebElement mainError;

    @FindBy(xpath = "//input[@id='user_login']/ancestor::dd/following-sibling::dd")
    private WebElement nameError;

    @FindBy(xpath = "//input[@id='user_email']/ancestor::dd/following-sibling::dd")
    private WebElement emailError;

    @FindBy(xpath = "//input[@id='user_password']/ancestor::dd/following-sibling::dd")
    private WebElement passwordError;

    public SignUpPage inputUserName(String username){
       userNameInput.sendKeys(username);
        return this;
    }

    public SignUpPage inputEmail(String email){
        userEmailInput.sendKeys(email);
        return this;
    }

    public SignUpPage inputPassword(String password){
        userPasswordInput.sendKeys(password);
        return this;
    }

    public SignUpPage registerInvalidCreds(String username, String password, String email){
        this.inputUserName(username);
        this.inputPassword(password);
        this.inputEmail(email);
        createAccountButton.click();
        return new SignUpPage(driver);

    }

    public String getHeading(){

        return heading.getText();
    }


    public String getMainError(){

        return mainError.getText();
    }


    public String getnameError(){

        return nameError.getText();
    }

    public String getemailError(){

        return emailError.getText();
    }

    public String getpasswordError(){

        return passwordError.getText();
    }

    /*
    public SignUpPage inputUserName(String username){
        driver.findElement(userNameInput).sendKeys(username);
        return this;
    }

    public SignUpPage inputEmail(String email){
        driver.findElement(userEmailInput).sendKeys(email);
        return this;
    }

    public SignUpPage inputPassword(String password){
        driver.findElement(userPasswordInput).sendKeys(password);
        return this;
    }

    public SignUpPage registerInvalidCreds(String username, String password, String email){
        this.inputUserName(username);
        this.inputPassword(password);
        this.inputEmail(email);
        driver.findElement(createAccountButton).click();
        return new SignUpPage(driver);

    }
*
    public String getHeading(){
        return driver.findElement(heading).getText();
    }


    public String getMainError(){
        return driver.findElement(mainError).getText();
    }


    public String getnameError(){
        return driver.findElement(nameError).getText();
    }

    public String getemailError(){
        return driver.findElement(emailError).getText();
    }

    public String getpasswordError(){
        return driver.findElement(passwordError).getText();
    }
*/

}
