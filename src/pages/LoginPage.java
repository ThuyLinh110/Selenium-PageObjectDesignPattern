package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    //Locators

    private WebDriver driver ;
    private By txtUserName = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='Login']");
    private By lnkRegister = By.xpath("//div[@id ='content']//a[@href ='Register.cshtml']");
    private By lnkForgotPassword = By.xpath("//div[@id ='content']//a[@href ='/Account/ForgotPassword.cshtml']");


    //WebElements
    private WebElement getTxtUserName() {return driver.findElement(txtUserName) ;}
    private WebElement getTxtPassword() {return driver.findElement(txtPassword) ;}
    private WebElement getBtnLogin() {return driver.findElement(btnLogin) ;}
    private WebElement getLnkRegister() {return driver.findElement(lnkRegister) ; }
    private WebElement getLnkForgotPassword() {return driver.findElement(lnkForgotPassword) ; }



    //Methods
    public void openPage(String baseUrl, WebDriver driver)
    {
        driver.get(baseUrl);
        this.driver = driver ;
    }

    public void login(String userName, String password)
    {
        getTxtUserName().sendKeys(userName);
        getTxtPassword().sendKeys(password);
        getBtnLogin().click();
    }
    public void navigateRegisterLink()
    {
        getLnkRegister().click();
    }
    public void navigateForgotPasswordLink()
    {
        getLnkForgotPassword().click();
    }


}
