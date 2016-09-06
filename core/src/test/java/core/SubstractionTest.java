package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractionTest {

    @Test
    public void testSubstract() {
        assertEquals(14, SubstractionMachine.getInstance().calculate(21, 7), 0);
    }

    @Test
    public void testSubstractRelative() {
        assertEquals(-6, SubstractionMachine.getInstance().calculate(1, 7), 0);
    }

    @Test
    public void testSubstract0() {
        assertEquals(10, SubstractionMachine.getInstance().calculate(10, 0), 0);
    }

}
