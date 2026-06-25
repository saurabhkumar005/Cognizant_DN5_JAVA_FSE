# Exercise 2 - E-commerce Platform Search Function

## Problem Statement

Develop a search functionality for an e-commerce platform to compare the performance of **Linear Search** and **Binary Search** algorithms.

---

## Objective

* Understand Big O Notation.
* Implement Linear Search and Binary Search.
* Compare the time complexity of both algorithms.
* Identify the most suitable search algorithm for an e-commerce platform.

---

## Project Structure

```
Ex2_Ecommerce
│
├── Product.java
├── SearchService.java
└── Main.java
```

---

## Product Attributes

* Product ID
* Product Name
* Category

---

## Algorithms Implemented

### Linear Search

* Searches each product one by one.
* Works on both sorted and unsorted arrays.

### Binary Search

* Searches by repeatedly checking the middle element.
* Requires the array to be sorted.

---

## Time Complexity

| Algorithm     | Best | Average  | Worst    |
| ------------- | ---- | -------- | -------- |
| Linear Search | O(1) | O(n)     | O(n)     |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Conclusion

For small or unsorted datasets, Linear Search is simple and effective.

For large, sorted datasets, Binary Search is more efficient because it significantly reduces the number of comparisons, making it more suitable for an e-commerce platform.

---
