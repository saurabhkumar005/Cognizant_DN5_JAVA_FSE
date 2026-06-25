
# Exercise 7: Financial Forecasting Scenario

## Problem Statement
You are developing a financial forecasting tool that predicts future values based on past data. 

---

## Project Structure

```text
Ex7_FinancialForecasting
│
├── ForecastService.java
├── Main.java
└── README.md
```

---

## 1. What is Recursion?

Recursion is a programming technique in which a method calls itself repeatedly until a stopping condition(Base Case) is reached.
It is useful for solving problems that can be divided into smaller versions of the same problem.

Example:

```
forecast(3)
    ↓
forecast(2)
    ↓
forecast(1)
    ↓
forecast(0)
```

When the base case is reached, the recursive calls return one by one until the final result is obtained.

---

## 2. Recursive Algorithm Used

The future value is calculated using the following formula:

```
Future Value = Current Value × (1 + Growth Rate / 100)
```

The recursive method repeatedly applies this formula for the specified number of years.

Base Case:

```
If years == 0
Return currentValue
```

Recursive Case:

```
Return calculateFutureValue(
    currentValue × (1 + growthRate / 100),
    growthRate,
    years - 1
)
```

---

## Time Complexity

**Time Complexity:** `O(n)`

Reason:
The recursive function is called once for each year.

Example:

* Years = 5 → 5 recursive calls
* Years = 10 → 10 recursive calls

Therefore, the execution time increases linearly with the number of years.

---

## Space Complexity

**Space Complexity:** `O(n)`

Reason:
Each recursive function call is stored in the call stack until all calls finish.

---

## Optimization

The recursive solution is simple and easy to understand, but for a very large number of years it creates many recursive calls and consumes additional stack memory.

A better optimization is to use an **iterative (loop-based) approach**, which performs the same calculation with:

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

because it does not use the recursion stack.

---

## Conclusion

This program demonstrates how recursion can be used to forecast future financial values based on a constant annual growth rate.

Recursion provides a clean and readable solution for this problem, while an iterative solution is more memory efficient for large inputs.

---
