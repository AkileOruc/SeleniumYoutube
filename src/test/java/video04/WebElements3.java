package video04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class WebElements3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));
        driver.get("https://www.bestbuy.com");
        List<WebElement> buttonListesi = driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());
        Iterator var3 = buttonListesi.iterator();

        while(var3.hasNext()) {
            WebElement each = (WebElement)var3.next();
            System.out.println(each.getText());
        }

    }


}
