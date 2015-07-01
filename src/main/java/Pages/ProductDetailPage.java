package Pages;

import org.openqa.selenium.By;

import static support.Helpers.find_element;


/**
 * Created by vunguyen on 26/06/2015.
 */
public class ProductDetailPage {
    // Name of product: Cafe start buck
    By ProductDetailtext1 = By.xpath("//*[@id=\"reviewSummaryDiv\"]/div/div[1]");
By Searchitem1 = By.xpath("//*[@id=\"directorypage\"]/div/div/div/div/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/h2/a");
    // Menu
   // By ProductDetailtext2 = By.xpath("//*[@id=\"micro-review-filter\"]");

    //By productpageRef = By.xpath("//*[@id=\"directorypage\"]/div/div/div/div/div[2]/div[4]/div[1]/div/div[1]/div[2]/h2/a");


    public Boolean productPageLoaded() {
        find_element(Searchitem1).click();

        return find_element(ProductDetailtext1).isDisplayed();

    }

}
