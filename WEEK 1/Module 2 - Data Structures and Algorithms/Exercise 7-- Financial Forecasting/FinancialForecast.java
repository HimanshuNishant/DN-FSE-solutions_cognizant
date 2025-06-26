class FinancialForecast {

    // Recursive method to predict future value with varying growth rates
    public static double predictFutureValue(double initialValue, double[] monthlyGrowthRates) {
        return applyGrowthRecursive(initialValue, monthlyGrowthRates, 0);
    }

    // Helper recursive method
    private static double applyGrowthRecursive(double currentValue, double[] rates, int monthIndex) {
        // Base case: all months processed
        if (monthIndex >= rates.length) {
            return currentValue;
        }

        // Apply current month's growth and proceed to the next month
        double updatedValue = currentValue * rates[monthIndex];
        return applyGrowthRecursive(updatedValue, rates, monthIndex + 1);
    }

    public static void main(String[] args) {
        double startingValue = 500.0;
        double[] monthlyRates = {1.04, 1.03, 1.02};  // Growth rates for 3 months

        double predictedValue = predictFutureValue(startingValue, monthlyRates);
        System.out.printf("Predicted value after %d months: %.2f\n", monthlyRates.length, predictedValue);
    }
}
