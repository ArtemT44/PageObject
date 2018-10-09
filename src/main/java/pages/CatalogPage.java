package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private WebDriver driver;

    public CatalogPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private By openGood = By.xpath("//*[@class='_1Y6X2G3jjK']/a[contains(.,'Мобильные телефоны')]");
    private By openHeadPhone = By.xpath(".//*[@class='_1Y6X2G3jjK']/a[contains(text(),'Наушники и Bluetooth-гарнитуры')]");

    public ProductList openMobilePhoneList() {
        driver.findElement(openGood).click();
        return new ProductList(driver);
    }

    public ProductList openHedphonesList() {
        driver.findElement(openHeadPhone).click();
        return new ProductList(driver);
    }

    public CatalogPage openCatalogList(String placeholder) {
        driver.findElement(By.xpath("//a[@class='link topmenu__link'][contains(.,'"+placeholder+"')]")).click();
        return new CatalogPage(driver);
    }
}
