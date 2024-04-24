package ro.ulbs.paradigme.lab8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {
    private DoubleCalculator dc;
    @BeforeEach
    public void setup(){
        dc=new DoubleCalculator(5);
    }

    @Test
    public void testAddPositives(){
        dc.add(3.2);
        Assertions.assertEquals(dc.result(),8.2);
    }

    @Test
    public void testAddNegatives(){
        dc.add(-3);
        Assertions.assertEquals(dc.result(),2);
    }

    @Test
    public void testSubtractPositives(){
        dc.subtract(3);
        Assertions.assertEquals(dc.result(),2);
    }

    @Test
    public void testSubtractNegatives(){
        dc.subtract(-3);
        Assertions.assertEquals(dc.result(),8);
    }

    @Test
    public void testMultiplyPositives(){
        dc.multiply(2);
        Assertions.assertEquals(dc.result(),10);
    }

    @Test
    public void testMultiplyNegatives(){
        dc.multiply(-2);
        Assertions.assertEquals(dc.result(),-10);
    }

    @Test
    public void testMultiplyBy0(){
        dc.multiply(0);
        Assertions.assertEquals(dc.result(),0);
    }

    @Test
    public void testDividePositives(){
        dc.divide(5);
        Assertions.assertEquals(dc.result(),1);
    }

    @Test
    public void testDivideNegatives(){
        dc.divide(-5);
        Assertions.assertEquals(dc.result(),-1);
    }

    @Test
    public void testDivideBy0(){
        dc.divide(0);
        Assertions.assertEquals(dc.result(),Double.POSITIVE_INFINITY);
    }

    @AfterEach
    public void tearDown(){
        dc=null;
    }

}
