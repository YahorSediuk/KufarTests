package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountPage {

    private final SelenideElement accountEmail = $x("//div[@class='styles_profile_data_item__UFEcW styles_profile_data_item-email__XQ67h']//span");

    public String getUserEmailFromSettings(){
        return accountEmail.getText();
    }
}
