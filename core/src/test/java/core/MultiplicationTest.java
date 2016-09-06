package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void testCalculate() {
        assertEquals(21, MultiplicationMachine.getInstance().calculate(3, 7), 0);
    }

}
