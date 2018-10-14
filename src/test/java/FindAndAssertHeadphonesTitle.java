import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class FindAndAssertHeadphonesTitle extends InitialComponent {

    @Test
    public void findAndAssertHeadphoneTitle() throws InterruptedException {
        MarketPage marketpage = new MarketPage(driver);
        MainPage mainpage = new MainPage(driver);
        CatalogPage catalogpage = new CatalogPage(driver);
        ProductList productlist = new ProductList(driver);
        ProductDetail gooddetail = new ProductDetail(driver);

        mainpage.openPage("https://yandex.ru");
        marketpage.openMarketPage("Маркет");
        catalogpage.openCatalogList("Электроника");
        catalogpage.openHedphonesList();
        productlist.filterByManufacturer("Beats");
        productlist.waitForElementPresent("Beats");
        productlist.fillMinCost("17000");
        productlist.waitForElementPresent("Beats");
        productlist.fillMaxCost("25000");
        productlist.waitForElementPresent("Beats");
            String firstProductNameInList = productlist.saveFirstGoodTitle();
        productlist.goToFirstPhoneInList();
        gooddetail.waitForElement();
            String productNameInDetail = gooddetail.findProductNameInDetail();
        Assert.assertEquals(firstProductNameInList,productNameInDetail);
    }
}
