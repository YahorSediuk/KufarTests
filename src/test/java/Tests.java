import CORE.Setup;
import Pages.MainPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;


import static Constants.Constants.UserCredentials.*;

public class Tests extends Setup {

    @Test(description = "Broken test")
    public void Test_invalid(){
        new MainPage().invalid_test();
    }

    @Test(description = "Case - Successful login")
    public void Test_SuccessfulLoginUser() {
       Assert.assertTrue(new MainPage()
               .acceptCookies()
               .loginUser(USER_EMAIL, USER_PASSWORD)
               .closeModalWindow()
               .toAccountSettings()
               .getUserEmailFromSettings().contains(USER_EMAIL));
    }
}
