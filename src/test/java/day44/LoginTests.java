package day44;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1,groups = {"sanity"})
    void loginByEmail(){
        System.out.println("This is a login bu email ");
    }
    @Test(priority = 1,groups = {"sanity"})
    void loginByFaceBook(){
        System.out.println("This is a login bu facebook ");
    }
    @Test(priority = 1,groups = {"sanity"})
    void loginByTwitter(){
        System.out.println("This is a login bu twitter ");
    }
}
