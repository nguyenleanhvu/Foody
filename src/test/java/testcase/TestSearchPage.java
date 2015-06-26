package testcase;
import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.Homepage;
import support.SetupTest;

/**
 * Created by vunguyen on 26/06/2015.
 */
public class TestSearchPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"cafe"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testSearchPage(String keyword){
        Homepage homepage = new Homepage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);

        SearchResultPage sr = new SearchResultPage();
        sr.searchToSearchPage(keyword);

      //  Assert.assertEquals(sr.searchPageLoaded(), Boolean.TRUE);


    }
}

