import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class SaveIntoFileAboutInfo extends InitialComponent {

    @Test
    public void SaveAboutInfoIntoFile() throws InterruptedException {
        Help help = new Help(driver);
        List<String> listStr = new ArrayList<>();
        String aboutTitle, aboutText, searchPageTitle;
        MainPage mainpage = new MainPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        VacancyPage vacancyPage = new VacancyPage(driver);
        SitePage sitePage = new SitePage(driver);

        mainpage.openPage("https://www.google.ru/");
        searchPageTitle = driver.getTitle();
        searchPage.searchValue("Альфа-Банк");
        searchPage.pressEnter();
        Thread.sleep(1000);
        searchPage.openPage();
        Thread.sleep(1000);
        for (String tab: driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        sitePage.openVacancyPage();
        vacancyPage.openAbotPage();
        aboutTitle = vacancyPage.getTitleInfo();
        aboutText = vacancyPage.getTextInfo();
            listStr.add(aboutTitle);
            listStr.add(aboutText);
           help.createAndWriteFile(listStr, searchPageTitle );
           System.out.print("haha");
        }
    }

