package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage
{
   // Locators
    private WebDriver driver ;
    private By txtUserName = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPID = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@value='Register']");
    private By lnkLogin = By.xpath("//div[@id ='content']//a[@href ='/Account/Login.cshtml'] ");



    //Web Elements
    private WebElement getTxtUserName() {return driver.findElement(txtUserName) ;}
    private WebElement getTxtPassword() {return driver.findElement(txtPassword) ;}
    private WebElement getTxtConfirmPassword(){return driver.findElement(txtConfirmPassword); }
    private WebElement getTxtPID(){return driver.findElement(txtPID); }
    private WebElement getBtnRegister() {return driver.findElement(btnRegister) ;}
    private WebElement getLnkLogin(){return driver.findElement(lnkLogin) ;}



    //Methods
    public void openPage(String baseUrl, WebDriver driver)
    {
        driver.get(baseUrl);
        this.driver = driver ;
    }

    public void register(String userName, String password, String confirmPassword, String PID)
    {
        getTxtUserName().sendKeys(userName);
        getTxtPassword().sendKeys(password);
        getTxtConfirmPassword().sendKeys(confirmPassword);
        getTxtPID().sendKeys(PID);
        getBtnRegister().click();
    }

    public void navigateLoginPage()
    {
        getLnkLogin().click();

    }





}
