package day33;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo3x.opencartreports.com/admin/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");
        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");
        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginBtn.click();

        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();

        String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
        System.out.println(text);

        int pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));

        for(int p =1 ; p<=pages;p++){
            if(p>1){
                WebElement activepage= driver.findElement(By.xpath("//ul[@class;='pagination']//*[text()="+p+"]"));
                activepage.click();

            }
           int data= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            for(int r=1;r<=data;r++){
                String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
                String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
                String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
                System.out.println(customerName+"\t"+email+"\t"+status);
            }
        }
    }
}
