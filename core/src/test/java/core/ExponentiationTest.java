package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExponentiationTest {

    @Test
    public void testOneExponentialOneShouldReturnOne() {
        assertEquals(1, ExponentiationMachine.getInstance().calculate(1, 1), 0);
    }

}
