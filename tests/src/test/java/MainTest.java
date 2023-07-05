import org.junit.jupiter.api.Test;

public class MainTest extends TestBase {

    @Test
    void checkDateTest() {
        web.onMasterPage().selectDate()
                .verifyDate();
    }

    @Test
    void checkTimeBeltTest(){
        web.onMasterPage().selectTimeBelt()
                .saveTimeBelt()
                .verifyTimeBelt();
    }

    @Test
    void checkEventsInFavourites(){
        web.onMasterPage().selectEventsInLine()
                .selectNBA()
                .addTeamInFavouritesAndVerifyTeamInFavourites();
    }

    @Test
    void checkLoginAndPasswordField(){
        web.onMasterPage().clickLoginButton()
                .checkNotError()
                .fillLoginForm()
                .clickConfirmButtonInLoginForm()
                .verifyError();
    }
}
