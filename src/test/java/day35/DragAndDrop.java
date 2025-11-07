package day35;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");

    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    Actions act = new Actions(driver);
    //drag and drop

    WebElement rome = driver.findElement(By.xpath("(//div[@id='box6'])[1]"));


    WebElement italy = driver.findElement(By.xpath("(//div[@id='box106'])[1]"));

    act.dragAndDrop(rome, italy).perform();
}
}