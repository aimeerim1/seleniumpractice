package day43;

import org.testng.annotations.*;

public class AnnotationsDemo1 {
    @BeforeClass
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

    @AfterClass
    void logout(){
        System.out.println("Log out");
    }
}
