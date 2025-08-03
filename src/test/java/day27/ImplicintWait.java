package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicintWait {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://obistest.manas.edu.kg/site/login");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("2004.01023");
    }
}
