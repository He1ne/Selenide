package selenideOOP.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MarketNotePage {

    private SelenideElement  price = $x("//*[@name=\"Цена до\"]");

    private SelenideElement  maker= $x("//*[@class=\"NVoaOvqe58\" and text() = \"Apple\"]");

    private SelenideElement  screen = $x("//*[@class=\"NVoaOvqe58\" and text() = '13\"-13.9\"']");

    private SelenideElement model = $x( "(//*[@data-zone-name=\"title\"])[1]");

    public void setPrice(String sum){
        price.setValue(sum);
    }
    public void chooseMaker(){
        maker.click();
    }
    public void chooseScreenSize(){
        screen.click();
    }
    public String printModel(){
        return model.getText();
    }
}
