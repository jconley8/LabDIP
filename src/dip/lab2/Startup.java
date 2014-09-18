package dip.lab2;

// An useful import if you need it.

// Another useful import if you need it.


/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    

    public static void main(String[] args) {
        TipCalculatorService tip = new TipCalculatorService(new BaggageServiceTipCalculator(ServiceQuality.POOR, 5));
        
        tip.displayTip();
    }

}