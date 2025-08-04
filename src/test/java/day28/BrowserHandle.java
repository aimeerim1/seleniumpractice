package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();
        for (String winid : windowIDs)
        {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if (title.equals("Human Resources Management Software | OrangeHRM") ||
                    title.equals("some other title"))
            {
                driver.close();
            }
        }


    }
}
