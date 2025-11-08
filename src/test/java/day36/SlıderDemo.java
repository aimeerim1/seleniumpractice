package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlıderDemo {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        //min slider
        WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println("Location min slider is :"+min_slider.getLocation());
        action.dragAndDropBy(min_slider,100,247).perform();
        System.out.println("Location min slider is after moving :"+min_slider.getLocation());

        //max slider
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Location max_slider is :"+max_slider.getLocation());
        action.dragAndDropBy(max_slider,-290,247).perform();
        System.out.println("Location max_slider is after moving :"+max_slider.getLocation());

    }
}
