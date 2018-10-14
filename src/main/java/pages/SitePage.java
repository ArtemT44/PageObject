package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SitePage {
    WebDriver driver;
    private By vacancyPage = By.xpath(".//a[@title='Вакансии']");
    private By siteMainPage = By.xpath(".//*[@class='footer-content__23RLk']");
    public SitePage(WebDriver driver) {
        this.driver = driver;
    }

    public VacancyPage openVacancyPage() {
        driver.findElement(vacancyPage).click();
        return new VacancyPage(driver);
    }

    public void waitPageLoad() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.waiter().until(ExpectedConditions.visibilityOf(driver.findElement(siteMainPage)));
    }
}
