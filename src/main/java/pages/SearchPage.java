package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage {
    WebDriver driver;

    private By searchField = By.xpath("//input[@id='lst-ib']");
    private By openFirstFindLink = By.xpath("(.//h3[starts-with(text(),'Альфа-Банк - кредитные ')])");
    public SearchPage(WebDriver driver) {
        this.driver=driver;
    }

    public SearchResultPage searchValue(String placeholder) {
        driver.findElement(searchField).sendKeys(placeholder);
        return new SearchResultPage(driver);
    }
    public SearchResultPage pressEnter(){
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public FindPage openPage() {
        driver.findElement(openFirstFindLink).click();
        return new FindPage(driver);

    }
}
