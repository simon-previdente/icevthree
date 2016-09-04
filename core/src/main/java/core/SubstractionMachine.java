package core;

public class SubstractionMachine implements ICalculationMachine {

    private static final SubstractionMachine INSTANCE = new SubstractionMachine();
    
    public static SubstractionMachine getInstance() {
        return INSTANCE;
    }
    
    private SubstractionMachine() {
    }
    
    @Override
    public double calculate(double a, double b){
        return AddingMachine.getInstance().calculate(a, -b);
    }

}
