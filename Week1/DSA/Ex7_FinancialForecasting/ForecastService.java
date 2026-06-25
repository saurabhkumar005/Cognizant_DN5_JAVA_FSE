package Week1.DSA.Ex7_FinancialForecasting;

public class ForecastService {
     public double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }
}
