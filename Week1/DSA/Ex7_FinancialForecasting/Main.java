package Week1.DSA.Ex7_FinancialForecasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ForecastService forecast = new ForecastService();
        
        System.out.print("Enter Current Value : ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%) : ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years : ");
        int years = sc.nextInt();

        double futureValue = forecast.calculateFutureValue(currentValue, growthRate, years);
        System.out.printf("\nPredicted Future Value after %d years = %.2f", years, futureValue);

        sc.close();
    }
}


// Exercise 7: 
// Financial Forecasting Scenario: You are developing a financial forecasting tool that predicts future values based on past data. 
// Steps: 1. Understand Recursive Algorithms: o Explain the concept of recursion and how it can simplify certain problems. 
// 2. Setup: o Create a method to calculate the future value using a recursive approach. 
// 3. Implementation: o Implement a recursive algorithm to predict future values based on past growth rates. 
// 4. Analysis: Discuss the time complexity of your recursive algorithm. Explain how to optimize the recursive solution to avoid excessive computation.