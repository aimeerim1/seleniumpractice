package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class OpentheLinkNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement regLink = driver.findElement(By.xpath("(//a[normalize-space()='Register'])[1]"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        List <String> ids = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1));

        driver.findElement(By.xpath("(//input[@id='FirstName'])[1]")).sendKeys("Kenedi");
        driver.switchTo().window(ids.get(0));

    }
}