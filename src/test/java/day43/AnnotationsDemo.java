package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
    @BeforeMethod
    void login(){
        System.out.println("Logining");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("Search");
    }
    @Test(priority = 2)
    void advicesearch(){
        System.out.println("Advice search");
    }

    @AfterMethod
    void logout(){
        System.out.println("Log out");
    }
}
