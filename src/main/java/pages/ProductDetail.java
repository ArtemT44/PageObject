package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetail {
    WebDriver driver;

    private By productNameInDetail = By.xpath(".//div[@class='n-title__text']/h1");

    public ProductDetail(WebDriver driver) {

        this.driver=driver;
    }

    public String findProductNameInDetail() {
        return driver.findElement(productNameInDetail).getText();
    }
}
