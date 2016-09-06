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
        if (Double.compare(a, 0) == 0 || Double.compare(b, 0) == 0) {
            return 0;
        }
        return a * b;
    }

}
