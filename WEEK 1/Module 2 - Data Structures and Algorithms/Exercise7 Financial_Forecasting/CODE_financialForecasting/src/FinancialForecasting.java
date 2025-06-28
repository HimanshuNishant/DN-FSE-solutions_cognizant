public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialValue, double[] growthRates) {
        return applyGrowth(initialValue, growthRates, 0);
    }

    // Helper recursive function
    private static double applyGrowth(double currentValue, double[] rates, int index) {
        // Base case: if all months are processed
        if (index >= rates.length) {
            return currentValue;
        }

        // Apply current month's growth
        double updatedValue = currentValue * (1 + rates[index] / 100.0);

        // Recursive call for next month
        return applyGrowth(updatedValue, rates, index + 1);
    }

    public static void main(String[] args) {
        double initial = 1000.0;
        double[] monthlyGrowthRates = {2.0, 1.5, 3.0, -1.0, 2.5};  // Example: 5 months

        double futureValue = predictFutureValue(initial, monthlyGrowthRates);
        System.out.println("Predicted Future Value: ₹" + futureValue);
    }
}
