package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class InitialComponent {
    protected FirefoxDriver driver;

    @BeforeMethod
    public void setUp(){
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        //driver.close();
    }
}
