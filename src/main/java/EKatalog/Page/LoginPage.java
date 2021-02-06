package EKatalog.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private SelenideElement loginByMail = $x("//*[@class=\"signin-with signin-with-ek d-flex justify-content-center align-items-center\"]"); //Choose type of login
    private SelenideElement emailOrLogin = $x("//*[@placeholder=\"E-Mail или Логин\"]"); // Window for email
    private SelenideElement password = $x("//*[@placeholder=\"Пароль\"]"); //Window for password
    private SelenideElement enterButton = $x("//*[@type=\"submit\" and text() = \"ВОЙТИ\"]"); //Button ENTER
    private SelenideElement loginOff = $x("//*[@class=\"help2\"]");// Log out

    public void clickLoginByEmailButton() {
        loginByMail.click();
    }
    public void setLogin(String email, String pass){
        emailOrLogin.setValue(email);
        password.setValue(pass);
        enterButton.click();
    }
    public void off(){
        loginOff.click();
    }

}
