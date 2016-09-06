package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExponentiationTest {

    @Test
    public void testOneExponentialOneShouldReturnOne() {
        assertEquals(1, ExponentiationMachine.getInstance().calculate(1, 1), 0);
    }

    @Test
    public void testZeroExponentialZeroShouldReturnOne() {
        assertEquals(1, ExponentiationMachine.getInstance().calculate(0, 0), 0);
    }

    @Test
    public void testOneExponentialMinusOneShouldReturnOne() {
        assertEquals(1, ExponentiationMachine.getInstance().calculate(1, -1), 0);
    }

    @Test
    public void testTwoExponentialThreeShouldReturnEight() {
        assertEquals(8, ExponentiationMachine.getInstance().calculate(2, 3), 0);
    }
}
