package OpenBank.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

    public SelenideElement checkLink = $x("//*[@class=\"TbwUpd NJjxre\"]//*[text()=\"www.open.ru\"]");
    public SelenideElement linkButton = $x("//*[@class=\"TbwUpd NJjxre\"]//*[text()=\"www.open.ru\"]");


    public void clickNewWindow() {
        String windowHandleFirst = WebDriverRunner.getWebDriver().getWindowHandle();

        linkButton.click();

        Set<String> windowHandles = WebDriverRunner.getWebDriver().getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if (!nextValue.equals(windowHandleFirst)) {
                WebDriverRunner.getWebDriver().switchTo().window(nextValue);
            }
        }
    }
    public void checkFieldsIsDisplayed(){

        checkLink.isDisplayed();
    }
    public String checkFieldsGetText(){

        return checkLink.getAttribute("innerText");
    }
}
