package Week1.DSA.Ex2_Ecommerce;

public class SearchService {
    public Product linearSearch(Product[] products, int productId){
        for(Product product : products){
            if(product.getProductId()==productId){
                return product;
            }
        }
        return null;
    }
    public Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if (products[mid].getProductId()==productId) {
                return products[mid];
            }
            else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void printComplexity() {

        System.out.println("\n===== Time Complexity =====");
        System.out.println("Linear Search");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n)");
        System.out.println("Worst Case   : O(n)");
        System.out.println();
        System.out.println("Binary Search");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");
        
    }
}
