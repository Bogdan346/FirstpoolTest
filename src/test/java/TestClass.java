import Pages.LoginPage;
import Pages.MainPage;
import Pages.UserPage;
import WebDriverSetting.WebDriverSetting;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class TestClass {

    WebDriver driver = WebDriverSetting.getInstance();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();

    @Test
    public void loginTest() {
        driver.get("https://yandex.by/");
        mainPage.pressLoginButton();
        loginPage.inputLogin("AutotestUser", "AutotestUser123");
        userPage.checkName();
        WebDriverSetting.destroy();


    }

    @Test
    public void logOut() {
        driver.get("https://yandex.by/");
        mainPage.pressLoginButton();
        loginPage.inputLogin("AutotestUser", "AutotestUser123");
        userPage.logOut();
        WebDriverSetting.destroy();

    }


    @Test
    public  void invalidPassword(){

        driver.get("https://yandex.by/");
        mainPage.pressLoginButton();
        loginPage.inputLogin("AutotestUser", "NoAutotestUser123");
        loginPage.invalidPasswd();
    }
}
