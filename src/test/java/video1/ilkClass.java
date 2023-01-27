package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) {
        System.out.println(WebDriverManager.chromedriver());
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");
    }
}
