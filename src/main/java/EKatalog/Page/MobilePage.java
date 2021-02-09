package EKatalog.Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MobilePage {
    private SelenideElement lowPrice = $x("//*[@id=\"minPrice_\"]");
    private SelenideElement highPrice = $x("//*[@id=\"maxPrice_\"]");
    private ElementsCollection typeOfPhones = $$x("//*[@class=\"match-li-href\"]/label");
    private SelenideElement findButton = $x("//*[@class=\"submit-button\"]");

    private SelenideElement compareLink(String namePhone) {
        return $x("//*[text()= \""+namePhone+"\"]/ancestor::table[@class=\"model-short-block\"]//*[@class=\"ctrl-chk1 h\"]");
    }

    private SelenideElement getNameOfPhone(String getName) {
        return $x("//*[@class=\"model-short-info\"]//*[contains(text(),\""+getName+"\")]");
    }
    public String saveNamePhone(String getName){
        return getNameOfPhone(getName).getText();
    }


    /*
        private SelenideElement type(String typeOfPhone) {
            return $x("//*[@class=\"match-li-href \"]//a[text()=\""+typeOfPhone+"\"]");
        }
    */
    public void filter(String typePhone) throws InterruptedException {
        Thread.sleep(500);
        typeOfPhones.findBy(Condition.exactText(typePhone)).scrollIntoView(true).click();
    }

    public void pushFind() {
        findButton.scrollIntoView(true).click();
    }

    public void clickCompare(String namePhone) {
        compareLink(namePhone).click();
    }
    public void setLowPrice(String lowCost) {
        lowPrice.setValue(lowCost);
    }
    public void setHighPrice(String highCost) {
        highPrice.setValue(highCost);
    }
}
