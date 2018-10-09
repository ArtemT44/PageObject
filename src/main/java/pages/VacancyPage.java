package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyPage {

    WebDriver driver;

    private By vacancyPage = By.xpath(".//a[@title='Вакансии']");
    private By getTitle = By.xpath(".//*[@class='message']");
    private By getTextInfo = By.xpath(".//*[@class='info']");
    private By openAboutPage = By.xpath(".//span[contains(text(),'О работе в банке')]");
    public VacancyPage(WebDriver driver) {
        this.driver=driver;
    }

    public VacancyPage openVacancyPage() {
        driver.findElement(vacancyPage).click();
        return new VacancyPage(driver);
    }
    public VacancyPage openAbotPage(){
        driver.findElement(openAboutPage).click();
        return new VacancyPage(driver);
    }
    public String getTitleInfo() {
        return driver.findElement(getTitle).getText();
    }

    public String getTextInfo() {
        return driver.findElement(getTextInfo).getText();
    }
}
