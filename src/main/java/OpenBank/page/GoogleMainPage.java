package OpenBank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleMainPage {

    public SelenideElement searchToolBar = $x("//*[@class=\"gLFyf gsfi\"]");

    public void searchToolBar(String search){
       searchToolBar.setValue(search).pressEnter();
    }
}
