package WebDriverSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverSetting {


    public static WebDriver instance ;
    public static String browserName = "CH";

    public static WebDriver getInstance() {


        if (instance == null && browserName.equals("CH")) {
            instance = new ChromeDriver();
        } else if (instance == null && browserName.equals("FF")) {
            instance = new FirefoxDriver();
        } else if (instance == null && browserName.equals("IE")) {
            instance = new InternetExplorerDriver();
        }
        return instance;
    }


    public  static void destroy() {
        instance.quit();
        instance=null;
    }

}
