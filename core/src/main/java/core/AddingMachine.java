package core;

public class AddingMachine implements ICalculationMachine {
    
    private static final AddingMachine INSTANCE = new AddingMachine();
    
    public static AddingMachine getInstance() {
        return INSTANCE;
    }
    
    private AddingMachine() {
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

}
