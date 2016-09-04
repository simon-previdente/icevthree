package core;

public class MultiplicationMachine implements ICalculationMachine {

    private static final MultiplicationMachine INSTANCE = new MultiplicationMachine();
    
    public static MultiplicationMachine getInstance() {
        return INSTANCE;
    }
    
    private MultiplicationMachine() {
    }
    
    @Override
    public double calculate(double a, double b){
        if (a == 0 || b == 0) {
            return 0;
        }
        return a*b;
    }

}
