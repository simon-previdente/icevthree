package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingTest {

    @Test
    public void testCalculate() {
        assertEquals(24, AddingMachine.getInstance().calculate(13, 11), 0);
    }

}
