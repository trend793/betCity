import org.junit.jupiter.api.Test;

public class MainTest extends TestBase {

    @Test
    void checkDateTest() {
        web.onMasterPage().onResultsPage()
                .selectDate()
                .verifyDate();
    }

    @Test
    void checkTimeBeltTest() {
        web.onMasterPage().clickSettingButton()
                .selectTimeBelt()
                .saveTimeBelt()
                .verifyTimeBelt();
    }

    @Test
    void checkEventsInFavourites() {
        web.onMasterPage().onLinePage()
                .selectNBA()
                .addTeamInFavouritesAndVerifyTeamInFavourites();
    }

    @Test
    void checkLoginAndPasswordField() {
        web.onMasterPage().clickLoginButton()
                .checkNotError()
                .fillLoginForm()
                .clickConfirmButtonInLoginForm()
                .verifyError();
    }
}
