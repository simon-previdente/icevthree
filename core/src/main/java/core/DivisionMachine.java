package core;

public class DivisionMachine implements ICalculationMachine {

    private static final DivisionMachine INSTANCE = new DivisionMachine();
    
    public static DivisionMachine getInstance() {
        return INSTANCE;
    }
    
    private DivisionMachine() {
    }
    
    @Override
    public double calculate(double a, double b) throws DivisonByZeroException {
        if (b == 0) {
            throw new DivisonByZeroException();
        }
        return a/b;
    }

}
