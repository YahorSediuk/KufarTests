import CORE.Setup;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


import static Constants.Constants.UserCredentials.*;

public class Tests extends Setup {

    @Test(description = "Case - Successful Login")
    public void Test_SuccessfulLoginUser() {
       Assert.assertTrue(new MainPage()
               .acceptCookies()
               .loginUser(USER_EMAIL, USER_PASSWORD)
               .closeModalWindow()
               .toAccountSettings()
               .getUserEmailFromSettings().contains(USER_EMAIL));
    }

    /*@Test(description = "Case = Unsuccessful Login: Wrong Password")
    public void Test_UnsuccessfulLoginUser () {
       Assert.assertTrue(new MainPage()
               .acceptCookies()
               .loginUser(USER_EMAIL, USER_INCORRECT_PASSWORD)
               .getLoginFormButton()
               .is(Condition.disabled));
    }*/


}
