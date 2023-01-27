package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethodlari {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

      // 1  driver.manage().window().getSize() -->icinde oldugumuz sayfanin pixel olarak olculerini yazdirir(1051, 798)
        System.out.println(driver.manage().window().getSize());


      //  2 driver.manage().window().getPosition() ---> icinde oldugumuz sayfanin pixel olarak konumunu dondurur(9, 9)
        System.out.println(driver.manage().window().getPosition());

    driver.manage().window().setPosition(new Point(15,15));//3 sol alt koseyi bizim istedigimiz pixel noktasina tasir

    driver.manage().window().setSize(new Dimension(900,600)); // 4 alt kose sabit, olculeri istenen gibi yapar


        driver.manage().window().maximize();
        driver.manage().window().minimize();



    }
}
