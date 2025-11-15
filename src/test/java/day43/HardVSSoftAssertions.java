package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssertions {
    SoftAssert sa;
    @Test
    void test_hardassertions(){
        System.out.println("Tisting...");
        System.out.println("Tisting...");
        Assert.assertEquals(1,2);
        System.out.println("Tisting...");
        System.out.println("Tisting...");

    }
    @Test(priority = 2)
    void test_softassertions(){
        System.out.println("Tisting...");
        System.out.println("Tisting...");
        sa = new SoftAssert();
        sa.assertEquals(1,2);
        System.out.println("Tisting...");
        System.out.println("Tisting...");
        sa.assertAll();//gooo

    }


}
