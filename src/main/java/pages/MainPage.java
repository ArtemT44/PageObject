package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openPage(String URL) {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return  new MainPage(driver);
    }

    public void openCatalogList() {

    }
}
