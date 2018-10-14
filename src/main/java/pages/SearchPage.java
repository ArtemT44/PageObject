package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    WebDriver driver;

    private By searchField = By.xpath("//input[@id='lst-ib']");
    private By openFirstFindLink = By.xpath("(.//h3[starts-with(text(),'Альфа-Банк - кредитные ')])");
    private By searchResulPage = By.xpath(".//*[@id='hdtb-msb-vis']");

    public SearchPage(WebDriver driver) {
        this.driver=driver;
    }

    public SearchResultPage searchValue(String placeholder) {
        driver.findElement(searchField).sendKeys(placeholder);
        return new SearchResultPage(driver);
    }
    public WebDriverWait waiter(){
        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
        return explicitWait;
    }
    public SearchResultPage pressEnter(){
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public FindPage openPage() {
        driver.findElement(openFirstFindLink).click();
        return new FindPage(driver);

    }

    public void waitPageLoad() {
        waiter().until(ExpectedConditions.presenceOfElementLocated(searchResulPage));
    }
}
