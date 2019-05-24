package Pages;

import WebDriverSetting.WebDriverSetting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class LoginPage {

    WebDriver driver = WebDriverSetting.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    By passwdForm = By.xpath(" //*[@class='passp-password-form']");
    By loginForm = By.xpath(" //*[@class='passp-login-form']");


    By loginField = By.xpath(" //*[@class ='passp-login-form']//input[@id='passp-field-login']");
    By passwordField = By.xpath("//*[@id='passp-field-passwd']");
    By submitButton = By.xpath(" //*[@class='passp-button passp-sign-in-button']");
    By invalidPassMessege = By.xpath(" //*[@class='passp-form-field__error']");

    public void inputLogin(String name, String passwd) {

        driver.findElement(loginField).sendKeys(name);
        driver.findElement(submitButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(passwd);
        driver.findElement(submitButton).click();
    }


    public void invalidPasswd() {
        WebElement errorMessege = driver.findElement(invalidPassMessege);
        ///проверка на коректность пароля
    }
}
