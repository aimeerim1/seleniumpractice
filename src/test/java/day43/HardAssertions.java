package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    void test(){
//        Assert.assertEquals("xyz","xyz");//passed
//        Assert.assertEquals("123","124");//failed

//        Assert.assertNotEquals("Ai","Ai");//failed
//        Assert.assertNotEquals("A","Ai");//passed

//        Assert.assertTrue(true);//passed
//        Assert.assertTrue(false); //failed

//        Assert.assertFalse(1==1);//failed
//        Assert.assertFalse(1==2);//passed

        Assert.fail();

    }
}
