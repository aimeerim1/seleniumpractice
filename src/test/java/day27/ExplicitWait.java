package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://obistest.manas.edu.kg/site/login");
        WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        username.sendKeys("2004.01023");
        WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        password.sendKeys("Abehifumi97_");
        WebElement loginbutton= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
        loginbutton.click();
//        driver.close();
    }
}
