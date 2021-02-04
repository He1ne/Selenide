import OpenBank.base.BaseTest;
import OpenBank.page.OpenMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOpen extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        googleMainPage.searchToolBar("Открытие");
        googleSearchPage.checkFieldsIsDisplayed();
        googleSearchPage.clickNewWindow();
        Thread.sleep(5000);
        Assert.assertTrue(openMainPage.getRateEurSell()>openMainPage.getRateEurBuy());
        Assert.assertTrue(openMainPage.getRateUsdSell()>openMainPage.getRateUsdBuy());
    }
}
