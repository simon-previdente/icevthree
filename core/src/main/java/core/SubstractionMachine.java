package core;

/**
 * Substraction Machine, uses {@link AddingMachine}
 * 
 * @author jgeisel
 *
 */
public final class SubstractionMachine implements ICalculationMachine {

    private static final SubstractionMachine INSTANCE = new SubstractionMachine();
    
    /**
     * Singleton Constructor
     */
    private SubstractionMachine() {
    }
    
    public static SubstractionMachine getInstance() {
        return INSTANCE;
    }
    
    @Override
    public double calculate(double a, double b){
        return AddingMachine.getInstance().calculate(a, -b);
    }

}
