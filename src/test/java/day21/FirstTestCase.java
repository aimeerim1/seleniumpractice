package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/aimeerim1");

    }
}