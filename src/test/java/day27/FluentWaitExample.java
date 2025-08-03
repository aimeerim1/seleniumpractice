package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://obistest.manas.edu.kg/site/login");

        // Настройка FluentWait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))           // общее время ожидания
                .pollingEvery(Duration.ofSeconds(2))           // как часто проверять
                .ignoring(NoSuchElementException.class);       // игнорировать ошибку, если элемент не найден

        // Ожидаем появление username
        WebElement username = wait.until(driver1 ->
                driver1.findElement(By.xpath("//input[@id='username']")));
        username.sendKeys("2004.01023");

        // Ожидаем появление password
        WebElement password = wait.until(driver1 ->
                driver1.findElement(By.xpath("//input[@id='password']")));
        password.sendKeys("Abehifumi97_");

        // Ожидаем кликабельность кнопки
        WebElement loginButton = wait.until(driver1 -> {
            WebElement btn = driver1.findElement(By.xpath("//button[normalize-space()='OK']"));
            return (btn.isEnabled() && btn.isDisplayed()) ? btn : null;
        });
        loginButton.click();
    }
}
