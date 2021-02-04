package OpenBank.base;

import OpenBank.page.GoogleMainPage;
import OpenBank.page.GoogleSearchPage;
import OpenBank.page.OpenMainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public GoogleMainPage googleMainPage;
    public OpenMainPage openMainPage;
    public GoogleSearchPage googleSearchPage;


    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

        open ("https://www.google.com/");

        googleMainPage = new GoogleMainPage();
        openMainPage = new OpenMainPage();
        googleSearchPage = new GoogleSearchPage();
    }

    @AfterMethod
    public void exit() {
    }
}
