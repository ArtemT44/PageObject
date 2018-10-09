package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductList {
    WebDriver driver;

    private By firstGoodTitle = By.xpath("(.//div[@class='n-snippet-cell2__title']/a)[1]");
    private By minPrice = By.xpath("//input[contains(@class,'1d02bPcWht')]");
    private By maxPrice = By.xpath("//input[contains(@class,'1f2usTwyAs')]");

    public ProductList(WebDriver driver)
    {
        this.driver=driver;
    }

    public ProductList filterByManufacturer(String placeholder) {
        driver.findElement(By.xpath("(//span[@class='NVoaOvqe58'][contains(.,'"+placeholder+"')])[1]")).click();
        return new ProductList(driver);
    }

    public ProductList fillMinCost(String placeholder) {
        driver.findElement(minPrice).sendKeys(placeholder);
        return new ProductList(driver);
    }

    public void fillMaxCost(String placeholder) {
        driver.findElement(maxPrice).sendKeys(placeholder);
    }

    public String saveFirstGoodTitle() {
        return driver.findElement(firstGoodTitle).getText();
    }

    public ProductDetail goToFirstPhoneInList() {
        driver.findElement(firstGoodTitle).click();
        return new ProductDetail(driver);
    }


}
