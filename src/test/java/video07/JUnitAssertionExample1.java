package video07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JUnitAssertionExample1 {

    static WebDriver driver;

    @BeforeClass
            public static void setUo(){
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
    }
     @AfterClass
     public static void teardown(){
 //11. Close driver
        driver.close();
     }

    @Test
    public void test01(){
//3. Verify that home page is visible successfully
        WebElement logo=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
// normalde bu methodla yapip if else yapabilirdik ama ASSERT kullanmak daha kolay ve mantikli System.out.println(logo.isDisplayed());

        Assert.assertTrue(logo.isDisplayed());
 //4. Click on 'Signup / Login' button
        WebElement signUp= driver.findElement(By.xpath("//a[@href='/login']"));
        signUp.click();

 //5. Verify 'Login to your account' is visible
        WebElement login= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(login.isDisplayed());

//6. Enter correct email address and password
        WebElement emailAdress= driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        emailAdress.sendKeys("ahmet@nehaber.com");

        WebElement passeword=driver.findElement(By.xpath("//input[@name='password']"));
        passeword.sendKeys("12345");


      //  WebElement loginButonu=driver.findElement(By.xpath("//button[@data-qa='login-button']"));
      // loginButonu.click();
        // SADECE CLICK ISE bunun yerine alttaki daha dogru
//7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//8. Verify that 'Logged in as username' is visible
        WebElement loggedIn= driver.findElement(By.xpath("//a[ text()=' Logged in as '] "));
        System.out.println(loggedIn.getText());

         Assert.assertTrue(loggedIn.isDisplayed());
//9. Click 'Logout' button

         driver.findElement(By.xpath("//a[text()=' Logout']")).click();
//10. Verify that user is navigated to login page
          String expectedUrl="https://automationexercise.com/login";
          String actualUrl=driver.getCurrentUrl();

          Assert.assertEquals(expectedUrl,actualUrl);
    }

}
