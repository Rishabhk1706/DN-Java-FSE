public class FinancialForecast{

    // Recursive function to calculate future value
    public static double futureValue(double presentValue, double rate, int years){
        // Base case
        if(years == 0){
            return presentValue;
        }

        // Recursive case
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args){
        double presentValue = 1000; // initial investment
        double rate = 0.10;         // 10% growth rate
        int years = 5;

        double result = Math.round(futureValue(presentValue, rate, years) * 100.0) / 100.0;;
        System.out.println("Future Value: " + result);
    }
}