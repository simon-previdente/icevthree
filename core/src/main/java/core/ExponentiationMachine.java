package core;

/**
 * Exponentiation Machine
 * 
 * @author jgeisel
 *
 */
public final class ExponentiationMachine implements ICalculationMachine {

    private static final ExponentiationMachine INSTANCE = new ExponentiationMachine();
    
    /**
     * Singleton constructor
     */
    private ExponentiationMachine() {
    }
    
    public static ExponentiationMachine getInstance() {
        return INSTANCE;
    }
    
    @Override
    public double calculate(double a, double b){
        return Math.pow(a, b);
    }

}
