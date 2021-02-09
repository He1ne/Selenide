import EKatalog.Base.Base;
import EKatalog.Page.EKatalogMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$x;

public class TestEKatalog extends Base {
        SoftAssert softAssert = new SoftAssert();
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
        mobilePage.filter("128 ГБ");
        mobilePage.filter("256 ГБ");
        mobilePage.filter("NFC (бесконтактная оплата)");
        mobilePage.filter("USB C");
        mobilePage.pushFind();
        Thread.sleep(5000);
        mobilePage.clickCompare("Samsung Galaxy A71");
        mobilePage.clickCompare("Xiaomi Redmi Note 9 Pro");
        String phone1 = mobilePage.saveNamePhone("Samsung Galaxy A71");
        String refactoringPhone1Name = (new StringBuilder(phone1)).insert(18, " ОЗУ 6 ГБ").toString();
        String phone2 = mobilePage.saveNamePhone("Xiaomi Redmi Note 9 Pro");
        String refactoringPhone2Name = (new StringBuilder(phone2)).insert(23, " 64 ГБ").toString();
        eKatalogMainPage.clickNewWindow();
        softAssert.assertEquals(refactoringPhone2Name, comparePage.finalName("Xiaomi Redmi Note 9 Pro 64\u00a0ГБ"));
        softAssert.assertEquals(refactoringPhone1Name, comparePage.finalName(refactoringPhone1Name));
        comparePage.delPhone();
        comparePage.delPhone();
        softAssert.assertAll();

    }
}
