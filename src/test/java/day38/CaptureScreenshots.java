package day38;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CaptureScreenshots {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //full page screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File soursefile = ts.getScreenshotAs(OutputType.FILE);
//        File targetfile = new File(System.getProperty("user.dir") + "/screenshots/fullpage.png");
//        soursefile.renameTo(targetfile);

        //section capture screenshot
//        WebElement featureCapture = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
//        File soursefile = featureCapture.getScreenshotAs(OutputType.FILE);
//        File targetfile = new File(System.getProperty("user.dir") + "/screenshots/featurecapture.png");
//        soursefile.renameTo(targetfile);
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File soursefile = logo.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir") + "/screenshots/logo.png");
        soursefile.renameTo(targetfile);
        driver.quit();

    }
}
