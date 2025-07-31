package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        String windowId = driver.getWindowHandle();
//        System.out.println("Window id is"+windowId);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowsId = driver.getWindowHandles();
        System.out.println(windowsId);
        driver.quit();

    }
}