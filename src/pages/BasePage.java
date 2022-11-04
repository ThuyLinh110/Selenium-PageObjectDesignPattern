package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver ;

    //Locator of tabs
    protected By tabHome = By.xpath("//div[@id ='menu']//a[@href='../'] " );
    protected By tabFAQ = By.xpath("//div[@id ='menu']//a[@href='#'] " );
    protected By tabContact = By.xpath("//div[@id ='menu']//a[@href='/Page/Contact.cshtml'] " );
    protected By tabTimetable = By.xpath("//div[@id ='menu']//a[@href='TrainTimeListPage.cshtml'] " );
    protected By tabTicketPrice = By.xpath("//div[@id ='menu']//a[@href='/Page/TrainPriceListPage.cshtml'] " );
    protected By tabBookTicket = By.xpath("//div[@id ='menu']//a[@href='/Page/BookTicketPage.cshtml'] " );
    protected By tabRegister = By.xpath("//div[@id ='menu']//a[@href='/Account/Register.cshtml'] " );
    protected By tabLogin = By.xpath("//div[@id ='menu']//a[@href='/Account/Login.cshtml'] " );
    protected By tabMyTicket = By.xpath("//div[@id ='menu']//a[@href='/Page/ManageTicket.cshtml'] " );
    protected By tabChangePassword = By.xpath("//div[@id ='menu']//a[@href='/Account/ChangePassword.cshtml'] " );
    protected By tabLogout = By.xpath("//div[@id ='menu']//a[@href='/Account/Logout'] " );




    //Web Elements
    private WebElement getTabHome() {return this.driver.findElement(tabHome) ;}
    private WebElement getTabFAQ() {return this.driver.findElement(tabFAQ) ;}
    private WebElement getTabContact() {return this.driver.findElement(tabContact) ;}
    private WebElement getTabTimetable() {return this.driver.findElement(tabTimetable) ;}
    private WebElement getTabTicketPrice() {return this.driver.findElement(tabTicketPrice) ;}
    private WebElement getTabBookTicket() {return this.driver.findElement(tabBookTicket) ;}
    private WebElement getTabRegister() {return this.driver.findElement(tabRegister) ;}
    private WebElement getTabLogin() {return this.driver.findElement(tabLogin) ;}
    private WebElement getTabMyTicket() {return this.driver.findElement(tabMyTicket) ;}
    private WebElement getTabChangePassword() {return this.driver.findElement(tabChangePassword) ;}
    private WebElement getTabLogout() {return this.driver.findElement(tabLogout) ;}




    public WebDriver getWebDriver()
    {
        return this.driver;
    }
    public void openPage(String baseUrl, WebDriver driver)
    {

        this.driver = driver ;
        this.driver.get(baseUrl);
    }
    public void closePage()
    {
        this.driver.close();

    }
    public void clickTabHome()
    {
        getTabHome().click();
    }
    public void clickTabFAQ()
    {
        getTabFAQ().click();
    }
    public void clickTabContact()
    {
        getTabContact().click();
    }
    public void clickTabTimetable()
    {
        getTabTimetable().click();
    }
    public void clickTabTicketPrice()
    {
        getTabTicketPrice().click();
    }
    public void clickTabBookTicket()
    {
        getTabBookTicket().click();
    }
    public void clickTabRegister()
    {
        getTabRegister().click();
    }
    public void clickTabLogin()
    {
        getTabLogin().click();
    }
    public void clickTabMyTicket()
    {
        getTabMyTicket().click();
    }
    public void clickTabChangePassword()
    {
        getTabChangePassword().click();
    }
    public void clickTabLogout()
    {
        getTabLogout().click();
    }




}
