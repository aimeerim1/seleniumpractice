package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://obistest.manas.edu.kg/site/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("2004.01023");
    }
}
