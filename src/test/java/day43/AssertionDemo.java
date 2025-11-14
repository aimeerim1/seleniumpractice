package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    void title(){
        String act_title="Opencart";
        String exp_title ="Opencart";
        Assert.assertEquals(act_title,exp_title);
    }
}
