package day44;

import org.testng.annotations.Test;

public class SignUpTests {
    @Test(priority = 1,groups = {"regression"})
    void signupByEmail(){
        System.out.println("this is sign uo by email");
    }
    @Test(priority = 1,groups = {"regression"})
    void signupByFacebook(){
        System.out.println("this is sign uo by facebook");
    }
    @Test(priority = 1,groups = {"regression"})
    void signupByTwitter(){
        System.out.println("this is sign uo by Twitter");
    }
}
