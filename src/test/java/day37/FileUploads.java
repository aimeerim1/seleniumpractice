package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //single file upload - Test1.txt
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/home/aimeerim/Desktop/Other/Documents/myapplication.pdf");
//
//        if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("myapplication.pdf"))
//        {
//            System.out.println("File is sucessfully uploaded");
//        }
//        else
//        {
//            System.out.println("Upload failed.");
//        }
        String file1 = "/home/aimeerim/Desktop/Other/Documents/myapplication.pdf";
        String file2 ="/home/aimeerim/Desktop/Other/Documents/myapplication.pdf";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
        int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        if(noOfFilesUploaded == 2)
        {
            System.out.println("All Files are uploaded");
        }
        else
        {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }

    }
}
