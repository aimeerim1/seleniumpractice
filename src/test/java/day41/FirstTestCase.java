package day41;

import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    void opennApp(){
        System.out.println("Opening");
    }
    @Test(priority = -1)
    void loginapp(){
        System.out.println("Loginnig");
    }

}
