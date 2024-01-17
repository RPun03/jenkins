package rlp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    public void testAddPositiveNumbers() {
        MathUtils mathUtils = new MathUtils();//create an instance of MathUtils
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(-5, mathUtils.add(-2, -3));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(0, mathUtils.add(2, -2));
    }

    @Test
    public void testAddZero() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.add(5, 0));
    }
}


