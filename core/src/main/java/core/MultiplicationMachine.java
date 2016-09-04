package core;

/**
 * Multiplaction Machine
 * 
 * @author jgeisel
 *
 */
public final class MultiplicationMachine implements ICalculationMachine {

    private static final MultiplicationMachine INSTANCE = new MultiplicationMachine();
    
    /**
     * Singleton Constructor
     */
    private MultiplicationMachine() {
    }
    
    public static MultiplicationMachine getInstance() {
        return INSTANCE;
    }
    
    @Override
    public double calculate(double a, double b){
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

}
