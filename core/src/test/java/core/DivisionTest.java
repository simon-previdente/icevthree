package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
    

    @Test
    public void testCalculate() throws DivisonByZeroException {
        assertEquals(2.5, DivisionMachine.getInstance().calculate(5, 2), 0);
    }
    
    @Test(expected = DivisonByZeroException.class) 
    public void testDivisionByZero() throws DivisonByZeroException {
        DivisionMachine.getInstance().calculate(5, 0);
    }

}
