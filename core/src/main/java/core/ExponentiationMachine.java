package core;

public class ExponentiationMachine implements ICalculationMachine {

    private static final ExponentiationMachine INSTANCE = new ExponentiationMachine();
    
    public static ExponentiationMachine getInstance() {
        return INSTANCE;
    }
    
    private ExponentiationMachine() {
    }
    
    @Override
    public double calculate(double a, double b){
        return Math.pow( a,b );
    }

}
