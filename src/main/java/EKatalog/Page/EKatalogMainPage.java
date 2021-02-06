package EKatalog.Page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;

public class EKatalogMainPage {

    public SelenideElement siteLogin = $x("//*[@class=\"wu_entr\"]"); //Email login
    public SelenideElement compare =$x("//*[@id=\"compared_goods_toolbar\"]"); //Compare button

    public void clickNewWindow() {
        String windowHandleFirst = WebDriverRunner.getWebDriver().getWindowHandle();
        compare.click();

        Set<String> windowHandles = WebDriverRunner.getWebDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if (!nextValue.equals(windowHandleFirst)) {
                WebDriverRunner.getWebDriver().switchTo().window(nextValue);
            }
        }
    }
    public void autorization(){
        siteLogin.click();
    }

}
