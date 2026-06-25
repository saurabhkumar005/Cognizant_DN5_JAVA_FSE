package Week1.DSA.Ex2_Ecommerce;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Keyboard", "Accessories"),
            new Product(103, "Mouse", "Accessories"),
            new Product(104, "Monitor", "Electronics"),
            new Product(105, "Camera", "Electronics"),
            new Product(106, "Phone", "Mobiles")
        };

        Scanner scn = new Scanner(System.in);

        int searchId = scn.nextInt();

        SearchService search = new SearchService();
        
        System.out.println("Linear Search for product ID: "+searchId);
        Product p = search.linearSearch(products, searchId);

        if(p!=null){
            System.out.println("Product Found!");
            System.out.println(p.toString());
        }else{
            System.out.println("Product Not Found!");
        }

        System.out.println();
        System.out.println();


        System.out.println("Binary Search for product ID: "+searchId);
        Product pb = search.binarySearch(products, searchId);

        if(pb!=null){
            System.out.println("Product Found!");
            System.out.println(pb.toString());
        }else{
            System.out.println("Product Not Found!");
        }

        search.printComplexity();


    }
}


//Problem Statement
// Exercise 2: E-commerce Platform Search Function
// Scenario: 
// You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.
// Steps:
// 1.	Understand Asymptotic Notation:
// o	Explain Big O notation and how it helps in analyzing algorithms.
// o	Describe the best, average, and worst-case scenarios for search operations.
// 2.	Setup:
// o	Create a class Product with attributes for searching, such as productId, productName, and category.
// 3.	Implementation:
// o	Implement linear search and binary search algorithms.
// o	Store products in an array for linear search and a sorted array for binary search.
// 4.	Analysis:
// o	Compare the time complexity of linear and binary search algorithms.
// o	Discuss which algorithm is more suitable for your platform and why.


