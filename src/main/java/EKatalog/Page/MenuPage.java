package EKatalog.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.ExactText;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MenuPage {

    private SelenideElement menu(String menuItem){
        return $x("//*[@class=\"mainmenu-item\"]/a[text()=\""+menuItem+"\"]");
    }
   private ElementsCollection dropMenu = $$x("//*[@class=\"mainmenu-sublist\"]/a");

    public void clickMenu(String menuItem){
        menu(menuItem).click();
    }
    public void clickDropMenu(String menuItems){
        dropMenu.findBy(Condition.exactText(menuItems)).click();
    }
}

