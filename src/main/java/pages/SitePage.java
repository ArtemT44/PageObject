package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SitePage {
    WebDriver driver;
    private By vacancyPage = By.xpath(".//a[@title='Вакансии']");
    public SitePage(WebDriver driver) {
        this.driver = driver;
    }

    public VacancyPage openVacancyPage() {
        driver.findElement(vacancyPage).click();
        return new VacancyPage(driver);
    }
}
