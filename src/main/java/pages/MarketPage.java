package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketPage {

    private WebDriver driver;

    public MarketPage(WebDriver driver) {
        this.driver = driver;
    }

    public MarketPage openMarketPage(String placeholder) {
        driver.findElement(By.xpath("(.//a[contains(text(),'"+placeholder+"')])[1]")).click();
        return new MarketPage(driver);
    }

    public CatalogPage openCatalogList(String placeholder) {
        driver.findElement(By.xpath("//a[@class='link topmenu__link'][contains(.,'"+placeholder+"')]"));
        return new CatalogPage(driver);
    }
}
