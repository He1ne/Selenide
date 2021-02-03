package selenideOOP.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;

public class YandexSearchPage {
    public SelenideElement checkLink = $x( "(//*[@class=\"path organic__path\"])//*[text()= \"market.yandex.ru\"] ");

    public SelenideElement linkButton= $x("//*[@class=\"path organic__path\"]//*[text() = \"market.yandex.ru\"]"); //Шпоргалка для новой вкладки, не забудь поменять локатор!

    public void clickNewWindow() {
        String windowHandleFirst = WebDriverRunner.getWebDriver().getWindowHandle();//тек вкладка

        linkButton.click();

        Set<String> windowHandles = WebDriverRunner.getWebDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if (!nextValue.equals(windowHandleFirst)) {
                WebDriverRunner.getWebDriver().switchTo().window(nextValue);
            }
        }
    }// Конец шпоры


    public void checkFieldsIsDisplayed(){
        checkLink.isDisplayed();
    }
    public String checkFieldsGetText(){
        return checkLink.getAttribute("innerText");
    }
}
