package EKatalog.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ComparePage {
    private SelenideElement findedPhoneName= $x("//*[@class=\"comp-model-name\"]");

    public String finalName(){
        return findedPhoneName.getText();
    }
}
