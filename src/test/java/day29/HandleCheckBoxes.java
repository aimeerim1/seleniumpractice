package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        for (WebElement checkbox : checkboxes) {
//            js.executeScript("arguments[0].click();", checkbox);
//        }
        //select last 3 checkboxes
        int total = checkboxes.size();
        for (int i = total - 3; i < total; i++) {
            WebElement checkbox = checkboxes.get(i);
            System.out.println("Кликаю по чекбоксу с id: " + checkbox.getAttribute("id"));
            js.executeScript("arguments[0].click();", checkbox);
        }
    }
}
