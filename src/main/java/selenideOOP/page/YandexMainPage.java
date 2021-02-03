package selenideOOP.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class YandexMainPage {

    public SelenideElement searchToolBar = $x("//*[@aria-label=\"Запрос\"]");
    public SelenideElement searchButton = $x("//*[@type=\"submit\"]");

    public void searchMethod(String text){
        searchToolBar.setValue(text);
        searchButton.click();
    }

}
