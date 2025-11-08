package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("(//textarea[@id='inputText1'])[1]")).sendKeys("Aimeerim");
        //select ctrl+a
        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //copy ctrl+c
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //paste ctrl+v
        action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        //tab
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();


    }
}