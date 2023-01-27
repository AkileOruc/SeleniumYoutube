package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodlari {
    public static void main(String[] args) {
        System.out.println(WebDriverManager.chromedriver());
        WebDriver driver =new ChromeDriver();
        //  1  driver.get("https://www.amazon.com");      ----->  yazdigimiz url e gider
        driver.get("https://www.amazon.com");

        //  2  driver.getTitle() --------  > icinde oldugumuz sayfanin basligini dondurur

        System.out.println("sayfanin title i: "+driver.getTitle());

        //  3  driver.getCurrentUrl()   ----> icinde oldugumuz sayfanin url sini dondurur

        System.out.println(driver.getCurrentUrl());

        //  4  driver.getPageSource()   ----> icinde oldugumuz sayfanin arka planda calisan kaynak kodlarini dondurur
        System.out.println("==================================");
        System.out.println(driver.getPageSource());
        //  5  driver.getWindowHandle()   -----> icinde olunan sayfanin UNIQUE  hash kodunu dondurur
        System.out.println("==================================");
        System.out.println(driver.getWindowHandle());

        System.out.println("===============================");
        System.out.println(driver.getWindowHandles());
        //  6   driver.getWindowHandles()   ----> acilan tum sayfalarin UNIQUE  hash kodunu dondurur

    }
}
