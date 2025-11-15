package day44;

import org.testng.annotations.Test;

public class PaymentTests {
    @Test (priority = 1,groups = {"regression","sanity"})

    void paymentinLir(){
        System.out.println("This is payment in lir");

    }

    @Test(priority = 2,groups = {"regression","sanity"})

    void paymentinSom(){
        System.out.println("Payment in Som");
    }
}
