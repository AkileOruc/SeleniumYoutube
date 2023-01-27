package video04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15L));


        driver.get("https:www.facebook.com");
        //cookies kabul etmek icin
        driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();

        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@id='email']"));

        epostaKutusu.sendKeys(new CharSequence[]{"Hlkiujhgtrf"});

        WebElement passKutusu = driver.findElement(By.xpath("//input[@id='pass']"));

        passKutusu.sendKeys(new CharSequence[]{"ydgfkshd"});

        driver.findElement(By.xpath("//button[@name='login']")).click();

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));

        String expectedSonucYazisi = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";

        String actualSonucYazisi = sonucYaziElementi.getText();

        if (expectedSonucYazisi.equals(actualSonucYazisi)) {
            System.out.println("girilemedi testi passed");
        } else {
            System.out.println("girilemedi testi failed");
        }

        driver.close();
    }
}
