package Pages;

import org.openqa.selenium.By;

import static support.Helpers.find_element;
/**
 * Created by vunguyen on 26/06/2015.
 */
public class Homepage {
    By homePageBody1 = By.xpath("/html/body/section[1]/div/div/div/div/div[1]");
    String homePageTxt1 = "Bộ sưu tập nổi bật";

    //By homePageBody2 = By.xpath("/html/body/section/div/div/div[5]/div[1]/div/h2");
    //String homePageTxt2 = "Các địa điểm phổ biến";

    //By homePageBody3 = By.xpath("/html/body/section/div/div/div[6]/div/div[1]/h2");
    //String homePageTxt3 = "Gợi ý danh sách đặt món";

    By searchPageRef = By.xpath("//*[@id=\"searchFormTop\"]/div/a/span");
    //By searchPageRef = By.xpath("//*[@id=\"searchFormTop\"]/div/a/span");
    By productPageRef = By.xpath("//*[@id=\"directorypage\"]/div/div/div/div/div[2]/div[4]/div[1]/div/div[1]/div[2]/h2/a");


    // ObjectMap objectMap = new ObjectMap();

    public Boolean homePageLoaded() {
        return find_element(homePageBody1).getText().equals(homePageTxt1);
    }



    //public void gotoSearchPage() {find_element(searchPageRef).click();}



}

