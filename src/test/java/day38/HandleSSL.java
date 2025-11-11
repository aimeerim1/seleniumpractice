package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Разрешаем небезопасные сертификаты

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://self-signed.badssl.com/");
    }
}