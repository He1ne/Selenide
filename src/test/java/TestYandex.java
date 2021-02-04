import org.testng.Assert;
import org.testng.annotations.Test;
import selenideOOP.base.BaseTest;

public class TestYandex extends BaseTest {
    @Test
    public void test() throws InterruptedException {
       yandexMainPage.searchMethod("Яндекс Маркет");
       yandexSearchPage.checkFieldsIsDisplayed();

       //String same = yandexSearchPage.checkFieldsGetText();
       //Assert.assertEquals("market.yandex.ru", same);

        Assert.assertEquals("market.yandex.ru", yandexSearchPage.checkFieldsGetText());

        yandexSearchPage.clickNewWindow();
        marketMainPage.tryCatch();
        marketMainPage.goToNoteBook();
        marketNotePage.chooseMaker();
        marketNotePage.setPrice("100000");
        marketNotePage.chooseScreenSize();
        Thread.sleep(5000);
        System.out.println(marketNotePage.printModel());
    }
}
