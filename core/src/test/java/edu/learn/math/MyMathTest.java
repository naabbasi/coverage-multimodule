package edu.learn.math;

import edu.learn.mymath.MyMath;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void sum() {
        new MyMath().sum(1,2);
    }

    @Test
    public void subtract() {
        new MyMath().subtract(1,2);
    }
}
