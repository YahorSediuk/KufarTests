package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.time.Duration;

import static Constants.Constants.URL.MAIN_PAGE_URL;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MainPage {

    public MainPage(){
        Selenide.open(MAIN_PAGE_URL);
    }

    private final SelenideElement cookie = $x("//div[@class='Politics_styles_buttons__LWXq2']");
    private final SelenideElement logButton = $x("//button[@class='styles_button__oKUgO styles_outline__maWFU styles_size-m__NgAcw']");
    private final SelenideElement emailInput = $x("//input[@id='login']");
    private final SelenideElement passwordInput = $x("//input[@id='password']");
    private final SelenideElement loginFormButton = $x("//form//button");
    private final SelenideElement accountIcon = $x("//div[@data-testid='user_profile_pic']");
    private final SelenideElement accountSettings = $x("//a[@data-testid='profile_menu_settings_link']");
    private final SelenideElement closeModalWindow = $x("//div[@class='styles_buttons__uir1j']//button");

    /**
     * Method for accepting cookies
     */
    public MainPage acceptCookies(){
        cookie.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Method for log-in by user credentials
     */
    public MainPage loginUser(String email, String password) {
        logButton.click();
        emailInput.shouldBe(Condition.enabled).sendKeys(email);
        passwordInput.shouldBe(Condition.enabled).sendKeys(password);
        loginFormButton.click();
        return this;
    }

    /**
     * Method for closing modal window (if appears)
     */
    public MainPage closeModalWindow(){
        if (closeModalWindow.is(Condition.enabled, Duration.ofSeconds(2))){
            closeModalWindow.click();
        }
        return this;
    }

    /**
     * Method for going to account settings
     */
    public AccountPage toAccountSettings(){
        accountIcon.click();
        accountSettings.shouldBe(Condition.visible).click();
        return new AccountPage();
    }


}
