package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractingTest {

    @Test
    public void testCalculatePositiveResult() {
        assertEquals(2, SubstractionMachine.getInstance().calculate(13, 11), 0);
    }

    @Test
    public void testCalculateNegativeResult() {
        assertEquals(-7, SubstractionMachine.getInstance().calculate(4, 11), 0);
    }

    @Test
    public void testCalculateNegativeParams() {
        assertEquals(-15, SubstractionMachine.getInstance().calculate(-4, 11), 0);
    }

    @Test
    public void testCalculateNegativeParams2() {
        assertEquals(15, SubstractionMachine.getInstance().calculate(4, -11), 0);
    }
}
