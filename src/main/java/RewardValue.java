public class RewardValue {

    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // constructor that accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        }
    }

    // method to get cash value
    public double getCashValue(){
        return cashValue;
    }

    // method to get miles value
    public double getMilesValue(){
        return milesValue;
    }
}
