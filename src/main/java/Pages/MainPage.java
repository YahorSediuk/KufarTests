package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static Constants.Constants.URL.MAIN_PAGE_URL;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public MainPage(){
        Selenide.open(MAIN_PAGE_URL);
    }

    private final SelenideElement cookie = $x("//div[@class='Politics_styles_buttons__LWXq2']");
}
