package ui.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import common.PropertyReader;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (null != driverThreadLocal.get()) {
            return driverThreadLocal.get();
        }
        PropertyReader propertyReader = new PropertyReader();
        switch (propertyReader.getBrowser()) {
            case "Chrome" -> driverThreadLocal.set(new ChromeDriver());
            case "Firefox" -> driverThreadLocal.set(new FirefoxDriver());
        }
        return driverThreadLocal.get();
    }

    public static void closeDriver() {
        if (driverThreadLocal != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}
