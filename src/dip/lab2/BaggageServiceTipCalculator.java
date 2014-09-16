package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculatorStrategy {
    private double MIN_BILL = 0;
    private double MAX_BILL = 100;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;

    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double calculateTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }
    
    @Override
    public void displayTip () {
        System.out.println("You owe your baggage handler a tip of: " + calculateTip());
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public double getMIN_BILL() {
        return MIN_BILL;
    }

    public void setMIN_BILL(double MIN_BILL) {
        this.MIN_BILL = MIN_BILL;
    }

    public double getMAX_BILL() {
        return MAX_BILL;
    }

    public void setMAX_BILL(double MAX_BILL) {
        this.MAX_BILL = MAX_BILL;
    }

    public double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public void setGOOD_RATE(double GOOD_RATE) {
        this.GOOD_RATE = GOOD_RATE;
    }

    public double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public void setFAIR_RATE(double FAIR_RATE) {
        this.FAIR_RATE = FAIR_RATE;
    }

    public double getPOOR_RATE() {
        return POOR_RATE;
    }

    public void setPOOR_RATE(double POOR_RATE) {
        this.POOR_RATE = POOR_RATE;
    }
    
    
    
    

}
