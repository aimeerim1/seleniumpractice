package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        //methid1 using sendkeys()
//        WebElement dateInput = driver.findElement(By.id("datepicker"));
//        dateInput.click();
//        dateInput.sendKeys("11/07/2025");

        //Method2 using date picker
        String year = "2024";
        String month = "May";
        String date = "22";
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        while(true){
                String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
                String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

                if(currentYear.equals(year) && currentMonth.equals(month)){
                    break;
                }
//                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//next button
    }
        List<WebElement> dates=driver.findElements (By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
        for(WebElement dt:dates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }

}
}