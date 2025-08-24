package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropCountryEle  = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropCountry = new Select(dropCountryEle);
//        dropCountry.selectByVisibleText("Japan");
//        dropCountry.selectByValue("japan");
//        dropCountry.selectByIndex(2);
        List <WebElement> options = dropCountry.getOptions();
        System.out.println(options.size());
        for(int i =0 ; i<options.size();i++){
            System.out.println(options.get(i).getText());
        }
    }
}
