package core;

/**
 * A Machine for adding {@link Double}
 * 
 * @author jgeisel
 *
 */
public final class AddingMachine implements ICalculationMachine {
    
    private static final AddingMachine INSTANCE = new AddingMachine();
    
    /**
     * Singleton Constructor
     */
    private AddingMachine() {
    }
    
    public static AddingMachine getInstance() {
        return INSTANCE;
    }
    
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

}
