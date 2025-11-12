package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());
        int counter = 0;
        for (WebElement linkElement : links) {
            String hrefValue = linkElement.getAttribute("href");

            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("Href value is null or empty");
                continue;
            }

            try {
                URL linkURL = new URL(hrefValue);
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefValue + " ==> Broken link");
                    counter++;
                } else {
                    System.out.println(hrefValue + " ==> Valid link");
                }

            } catch (Exception e) {
//                System.out.println(hrefValue + " ==> Exception: " + e.getMessage());
            }
        }

//        driver.quit();
        System.out.println("Count of broken links :" +counter);
    }
}
