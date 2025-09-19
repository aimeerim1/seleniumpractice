package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //find count rows
        int rows = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr")).size();
        System.out.println("Count rows are "+rows);
        int col = driver.findElements(By.xpath("(//table[@name='BookTable'])//th")).size();
        System.out.println("Count rows are "+col);

        String BookName = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr[5]//td[1]")).getText();
        System.out.println(BookName);

        for ( int r =2 ;r<=rows;r++){
            for (int c=1 ;c<=col;c++){
                String val = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(val+"\t");
            }
            System.out.println();
        }

        // 5) Print book names whose author is Mukesh

        for(int r=2; r<=rows; r++) {
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
            if(authorName.equals("Mukesh")) {
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println(bookName);
            }
        }
        // 6) Find total price of all the books

        int total = 0;
        for(int r=2; r<=rows; r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            total = total + Integer.parseInt(price);
        }
        System.out.println("Total Price of the books: " + total);


    }
}
