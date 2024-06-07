public class RewardValue {
    private double cashValue;
    private double milesConversionRate;

    public RewardValue(double cashValue, double milesConversionRate) {
        this.cashValue = cashValue;
        this.milesConversionRate = milesConversionRate;
    }

    public double getMilesValue() {
        return cashValue * milesConversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }
}
