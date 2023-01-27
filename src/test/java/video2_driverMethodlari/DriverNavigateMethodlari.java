package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
 // 1 driver.navigate().to("url") driver.get("url) ile ayni islemi yapar ama forward ve back yapabiliriz(ileri-geri)
        driver.navigate().to("https://www.facebook.com");

 //2 driver.navigate().back(); bir onceki sayfaya doner bu ornekte amazon a
        driver.navigate().back();

 //3 driver.navigate().forward();  back();ile geldigi sayfaya yeniden gider bu ornekte facebook a
     driver.navigate().forward();

 // 4  driver.navigate().refresh(); icinde oldugu sayfayi yeniler
      driver.navigate().refresh();
 // driver.close(); close de quit de kapatir ama quit tum sayfalari kapatir close ise en sonuncuyu
      driver.quit();


    }
}
