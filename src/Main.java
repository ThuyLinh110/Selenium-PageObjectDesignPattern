import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.RegisterPage;

public class Main {
    public static WebDriver driver ;
    public static void setup ()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\NTLINH\\AUTO\\Driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void main(String[] args)
    {
        setup();
        LoginPage loginPage = new LoginPage();
        loginPage.openPage("http://www.railwayb2.somee.com/Account/Login.cshtml", driver);
        loginPage.navigateForgotPasswordLink();
        loginPage.closePage();
//        loginPage.navigateRegisterLink();
//        loginPage.login("linh@gmail.com","123456789");


//        RegisterPage registerPage = new RegisterPage();
//        registerPage.openPage("http://www.railwayb2.somee.com/Account/Register.cshtml", driver);
//        registerPage.navigateConfirmCode();
//        registerPage.register("linh@gmail.com","1234567890","1234567098","123456789");
//        registerPage.navigateLoginPage();
    }
}