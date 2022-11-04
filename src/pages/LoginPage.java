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

    //WebElements
    private WebElement getTxtUserName() {return driver.findElement(txtUserName) ;}
    private WebElement getTxtPassword() {return driver.findElement(txtPassword) ;}
    private WebElement getBtnLogin() {return driver.findElement(btnLogin) ;}


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

}
