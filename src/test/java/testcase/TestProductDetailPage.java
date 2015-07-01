package testcase;

import Pages.Homepage;
import Pages.ProductDetailPage;
import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;

/**
 * Created by vunguyen on 26/06/2015.
 */
public class TestProductDetailPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"cafe"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String keyword){
        Homepage homepage = new Homepage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);

        SearchResultPage sr = new SearchResultPage();
        sr.searchToSearchPage(keyword);

        ProductDetailPage productdetailpage = new ProductDetailPage();
        Assert.assertEquals(productdetailpage.productPageLoaded(), Boolean.TRUE);
        //productdetailpage.gotoProductDetailPage();

    }
}