package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.ru/index.php");
        driver.manage().window().maximize();
//      driver.findElement(By.name("search")).sendKeys("Windows");
//      boolean statusLogo=  driver.findElement(By.id("logo")).isDisplayed();
//      System.out.println(statusLogo);
//      driver.findElement(By.linkText("Планшеты")).click();
//      driver.findElement(By.partialLinkText("шеты")).click();

//      List<WebElement> headerLinks =  driver.findElements(By.className("dropdown"));
//      System.out.println("Header links size is:"+headerLinks.size());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links count is:" + links.size());
    }

}