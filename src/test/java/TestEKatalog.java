import EKatalog.Base.Base;
import EKatalog.Page.EKatalogMainPage;
import org.testng.annotations.Test;

public class TestEKatalog extends Base {
    @Test
    public void test() throws InterruptedException {
        eKatalogMainPage.autorization();
        loginPage.clickLoginByEmailButton();
        loginPage.setLogin("he1ne@yandex.ru", "Hehachi9");
        menuPage.clickMenu("Гаджеты");
        menuPage.clickDropMenu("Мобильные");
        mobilePage.setLowPrice("20000");
        mobilePage.setHighPrice("25000");
        mobilePage.filter("смартфоны");
        mobilePage.filter("64 ГБ");
        mobilePage.filter("NFC (бесконтактная оплата)");
        mobilePage.filter("256 ГБ");
        mobilePage.filter("USB C");
        mobilePage.filter("128 ГБ");
        mobilePage.pushFind();
        Thread.sleep(10000);



    }
}
