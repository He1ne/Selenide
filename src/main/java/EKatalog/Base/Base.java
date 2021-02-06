package EKatalog.Base;

import EKatalog.Page.*;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    public ComparePage comparePage;
    public EKatalogMainPage eKatalogMainPage;
    public LoginPage loginPage;
    public MenuPage menuPage;
    public MobilePage mobilePage;

    @BeforeMethod
    public void setUP(){

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://www.e-katalog.ru/");

        comparePage = new ComparePage();
        eKatalogMainPage = new EKatalogMainPage();
        loginPage = new LoginPage();
        menuPage = new MenuPage();
        mobilePage = new MobilePage();

    }
    @AfterMethod

    public void exit() {
        loginPage.off();
        }
}
