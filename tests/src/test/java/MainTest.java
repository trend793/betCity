import elements.PageElements;
import org.junit.jupiter.api.Test;

public class MainTest extends TestBase {

    @Test
    void checkDateTest() {
        System.out.println("555");


        web.testMethods().selectDate().verifyDate();

        System.out.println("999");
    }
    @Test
    void checkTimeBeltTest(){

        web.testMethods().selectTimeBelt()
                .saveTimeBelt()
                .verifyTimeBelt();
    }
    @Test
    void checkEventsInFavourites(){
        web.testMethods().selectEvents().selectEventTeam(PageElements.NBA_DENVER_BUTTON)
                .verifyEvensFavourites(PageElements.DENVER_IN_FAVOURITES,PageElements.NBA_DENVER_BUTTON);
        web.testMethods().selectEvents().selectEventTeam(PageElements.NBA_BOSTON_BUTTON)
                .verifyEvensFavourites(PageElements.BOSTON_IN_FAVOURITES,PageElements.NBA_BOSTON_BUTTON);

    }
}
