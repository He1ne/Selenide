package OpenBank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OpenMainPage {
    private SelenideElement eurBuy = $x("(//*[@class=\"main-page-exchange__rate\"])[1]");
    private SelenideElement eurSell = $x("(//*[@class=\"main-page-exchange__rate\"])[2]");
    private SelenideElement usdBuy = $x("(//*[@class=\"main-page-exchange__rate\"])[3]");
    private SelenideElement usdSell = $x("(//*[@class=\"main-page-exchange__rate\"])[4]");

    public Double getRateEurBuy(){
        return   Double.parseDouble(eurBuy.getText().replaceAll(",", "."));
    }
    public Double getRateEurSell() {
        return Double.parseDouble(eurSell.getText().replaceAll(",", "."));
    }
    public Double getRateUsdSell() {
        return Double.parseDouble(usdSell.getText().replaceAll(",", "."));
    }
    public Double getRateUsdBuy() {
        return Double.parseDouble(usdBuy.getText().replaceAll(",", "."));
    }
}
