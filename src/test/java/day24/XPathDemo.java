package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.ru/index.php");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@placeholder='Поиск']")).sendKeys("tshirt");
//        driver.findElement(By.xpath("//input[@placeholder='Поиск' and @name='search']")).sendKeys("Tshirt");
//        driver.findElement(By.xpath("//input[@placeholder='Поиск' or @name='searh']")).sendKeys("Tshirt");
        driver.findElement(By.xpath("//*[text()='MacBook']")).click();
        driver.findElement(By.xpath("//*[text()='MacBoolk']")).click();

    }
}
