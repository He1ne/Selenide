package selenideOOP.base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenideOOP.page.MarketMainPage;
import selenideOOP.page.MarketNotePage;
import selenideOOP.page.YandexMainPage;
import selenideOOP.page.YandexSearchPage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public YandexMainPage yandexMainPage;
    public YandexSearchPage yandexSearchPage;
    public MarketMainPage marketMainPage;
    public MarketNotePage marketNotePage;


    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

        open("https://yandex.ru/");

        yandexMainPage = new YandexMainPage();
        yandexSearchPage = new YandexSearchPage();
        marketMainPage = new MarketMainPage();
        marketNotePage = new MarketNotePage();
    }

    @AfterMethod
    public void exit(){

    }
}