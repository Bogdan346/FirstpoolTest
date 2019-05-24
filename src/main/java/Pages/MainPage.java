package Pages;

import WebDriverSetting.WebDriverSetting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver = WebDriverSetting.getInstance();

    By loginButton = By.xpath("//*[contains(@class,'esk-notif-card__login-enter-expanded')]");


    public void pressLoginButton() {

        driver.findElement(loginButton).click();
    }

}
