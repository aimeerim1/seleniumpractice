package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HWDraganddrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        //drag and drop

        WebElement drag = driver.findElement(By.xpath("(//div[@id='draggable'])[1]"));
        WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        action.dragAndDrop(drag, drop).perform();
    }
}