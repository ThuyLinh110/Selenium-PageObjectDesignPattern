package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage
{
    //Locators

    private By txtUserName = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='Login']");
    private By lnkRegister = By.xpath("//div[@id ='content']//a[@href ='Register.cshtml']");
    private By lnkForgotPassword = By.xpath("//div[@id ='content']//a[@href ='/Account/ForgotPassword.cshtml']");


    //WebElements
    private WebElement getTxtUserName() {return this.driver.findElement(txtUserName) ;}
    private WebElement getTxtPassword() {return this.driver.findElement(txtPassword) ;}
    private WebElement getBtnLogin() {return this.driver.findElement(btnLogin) ;}
    private WebElement getLnkRegister() {return this.driver.findElement(lnkRegister) ; }
    private WebElement getLnkForgotPassword() {return this.driver.findElement(lnkForgotPassword) ; }



    //Methods

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
