package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assert {

    @Test
    public void tes01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        String expectedIcerik = "AMAZON";
        String actualTitle = driver.getTitle();

        /*
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");

        }else{
            System.out.println("Title Testi FAILED");
        }

         */
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        driver.close();
    }
}
