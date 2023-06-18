public class RewardValue {
    private double cashValue;
    public final double Conversion_Rate = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue){
        return (int) ( cashValue/Conversion_Rate);
    }

    private double convertToCash(double milesValue){
        return milesValue * Conversion_Rate;
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }






}
