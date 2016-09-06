package core;

/**
 * Machine for Divisions. Might raise a {@link DivisonByZeroException}
 * 
 * @author jgeisel
 *
 */
public final class DivisionMachine implements ICalculationMachine {

    private static final DivisionMachine INSTANCE = new DivisionMachine();
    
    /**
     * Singleton Constructor
     */
    private DivisionMachine() {
    }
    
    public static DivisionMachine getInstance() {
        return INSTANCE;
    }
    
    @Override
    public double calculate(double a, double b) throws DivisonByZeroException {
        if (Double.compare(b, 0) == 0) {
            throw new DivisonByZeroException();
        }
        return a / b;
    }

}
