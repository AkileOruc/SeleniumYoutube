package video03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementLocators {



        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));
            driver.get("https://www.amazon.com");
            WebElement amazonAramaKutusu = driver.findElement(By.name("field-keywords"));
            amazonAramaKutusu.sendKeys(new CharSequence[]{"Nutella" + Keys.ENTER});
            Thread.sleep(5000L);
            driver.close();
        }
    }

