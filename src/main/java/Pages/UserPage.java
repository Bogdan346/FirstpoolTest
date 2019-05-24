package Pages;

import WebDriverSetting.WebDriverSetting;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPage {
    WebDriver driver = WebDriverSetting.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 15);
    By userName = By.xpath("//*[@class ='mail-User-Name']");
    By recipient = By.xpath("//*[@id='recipient-1']");
    By outYandexService = By.xpath(" //*[contains(text(),'Выйти из сервисов Яндекса')]");

    public void checkName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(userName));
        String siteText = driver.findElement(userName).getText();
        String result = "AutotestUser";
        Assert.assertEquals(result, siteText);
        System.out.println(siteText + "\n" + result + "\n");

    }

    public void logOut() {
        MainPage mp = new MainPage();
        wait.until(ExpectedConditions.presenceOfElementLocated(recipient));
        driver.findElement(recipient).click();
        driver.findElement(outYandexService).click();

        String siteText = driver.findElement(mp.loginButton).getText();
        String result = "Войти в почту";
        Assert.assertEquals(result, siteText);
        System.out.println(siteText + "\n" + result + "\n" + "Logout is accept");


    }


}
