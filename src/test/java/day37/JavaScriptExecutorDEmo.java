package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDEmo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement inputbox = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','JOHN')",inputbox);

        WebElement rdbtn = driver.findElement(By.xpath("(//input[@id='male'])[1]"));
        js.executeScript("arguments[0].click()",rdbtn);

    }
}
