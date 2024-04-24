package ro.ulbs.paradigme.lab8;

import org.junit.jupiter.api.*;

public class NewIntTest {
    private NewIntCalculator nic;

    @BeforeEach
    public void setup(){
        nic=new NewIntCalculator(5);
    }

    @Test@DisplayName("TEST1")
    public void testAddPositives(){
        nic.add(3);
        Assertions.assertEquals(nic.result(),8);
    }

    @Test@DisplayName("TEST2")
    public void testAddNegatives(){
        nic.add(-3);
        Assertions.assertEquals(nic.result(),2);
    }

    @Test@DisplayName("TEST3")
    public void testSubtractPositives(){
        nic.subtract(3);
        Assertions.assertEquals(nic.result(),2);
    }

    @Test@DisplayName("TEST4")
    public void testSubtractNegatives(){
        nic.subtract(-3);
        Assertions.assertEquals(nic.result(),8);
    }

    @Test@DisplayName("TEST5")
    public void testMultiplyPositives(){
        nic.multiply(2);
        Assertions.assertEquals(nic.result(),10);
    }

    @Test@DisplayName("TEST6")
    public void testMultiplyNegatives(){
        nic.multiply(-2);
        Assertions.assertEquals(nic.result(),-10);
    }

    @Test@DisplayName("TEST7")
    public void testMultiplyBy0(){
        nic.multiply(0);
        Assertions.assertEquals(nic.result(),0);
    }

    @Test@DisplayName("TEST8")
    public void testDividePositives(){
        nic.divide(5);
        Assertions.assertEquals(nic.result(),1);
    }

    @Test@DisplayName("TEST9")
    public void testDivideNegatives(){
        nic.divide(-5);
        Assertions.assertEquals(nic.result(),-1);
    }

    @Test@DisplayName("TEST10")
    public void testDivideBy0(){
        Exception exception =
                Assertions.assertThrows(ArithmeticException.class, () -> {
                    nic.divide(0);
                });

    }

    @AfterEach
    public void tearDown(){
        nic=null;
    }
}
