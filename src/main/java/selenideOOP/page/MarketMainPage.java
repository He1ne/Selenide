package selenideOOP.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;

import static com.codeborne.selenide.Selenide.$x;

public class MarketMainPage {

    private SelenideElement spam = $x("//*[@type=\"button\"]//*[text()=\"Понятно\"]");

    private SelenideElement pc = $x("//*[@class=\"_3Lwc_UVFq4\"]//*[text() = \"Компьютеры\"]");

    private SelenideElement noteBook = $x("//*[@data-autotest-id=\"subItems\"]//*[text()= \"Ноутбуки\"]");

    public void tryCatch() {
        try {
            spam.isDisplayed();
            spam.click();

        } catch (ElementNotFound elementNotFound) {
        }
    }

    public void goToNoteBook() {
        pc.click();
        noteBook.click();
    }
}


