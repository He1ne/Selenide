package EKatalog.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ComparePage {

    SelenideElement del = $x("//*[@title=\"Удалить товар из сравнения\"]");

    private SelenideElement findedPhoneName(String pName){
     return $x("//*[@class=\"comp-model-name\"]//*[contains(text(),'"+pName+"')]");
    }

    public String finalName(String pName){
        return findedPhoneName(pName).getText();
    }
    public void delPhone() throws InterruptedException {
        Thread.sleep(2000);
        del.click();
    }
}

