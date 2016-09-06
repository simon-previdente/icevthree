package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void test() {
        assertEquals(32, MultiplicationMachine.getInstance().calculate(8, 4), 0);
    }

}
