package core;

/**
 * Interface for caclulation operations
 * 
 * @author jgeisel
 *
 */
@FunctionalInterface
public interface ICalculationMachine {

    /**
     * Calculate operation
     * 
     * @param a first parameter
     * @param b second parameter
     * @return the result of the calculation
     * @throws DivisonByZeroException if a division by zero is done
     */
    double calculate(double a, double b) throws DivisonByZeroException;

}
