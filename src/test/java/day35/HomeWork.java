package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement input1 = driver.findElement(By.xpath("(//input[@id='field1'])[1]"));
        WebElement input2 = driver.findElement(By.xpath("(//input[@id='field2'])[1]"));
        WebElement copyText = driver.findElement(By.xpath("(//button[normalize-space()='Copy Text'])[1]"));
        input1.clear();
        input1.sendKeys("Aymeerim");
        Actions action = new Actions(driver);
        action.doubleClick(copyText).perform();

        String text = input2.getAttribute("value");
        if(text.equals("Aymeerim")){
            System.out.println("Text copied...");
        }else{
            System.out.println("Text not copied properly...");
        }

    }
}
