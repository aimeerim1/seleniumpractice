package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//        System.out.println("Display status is:"+logo.isDisplayed());
//        boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//        System.out.println("Enable status is : "+status);
        WebElement statisFemaleRatio = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
        System.out.println("Ratio status is : " +statisFemaleRatio.isSelected());
        statisFemaleRatio.click();
        System.out.println("result is :"+statisFemaleRatio.isSelected());
        driver.quit();

}
}
