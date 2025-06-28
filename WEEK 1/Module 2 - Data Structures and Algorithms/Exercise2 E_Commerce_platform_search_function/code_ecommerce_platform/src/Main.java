import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id)
                return product;
        }
        return null;
    }

    // Binary Search (on sorted array)
    public static Product binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
                new Product(103, "Mouse", "Electronics"),
                new Product(101, "Shirt", "Clothing"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(105, "Shoes", "Footwear"),
                new Product(104, "Laptop", "Electronics"),
                new Product(106, "Book", "Stationery"),
                new Product(108, "Bag", "Accessories"),
                new Product(107, "Watch", "Accessories"),
                new Product(110, "Camera", "Electronics"),
                new Product(109, "Pen", "Stationery")
        };

        System.out.print("Enter product ID to search: ");
        int searchId = sc.nextInt();

        // Sort array for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Perform linear search
        Product linearResult = linearSearch(products, searchId);
        System.out.println("\nLinear Search Result:");
        if (linearResult != null)
            System.out.println("Found: " + linearResult.productName + " in " + linearResult.category);
        else
            System.out.println("Product not found.");

        // Perform binary search
        Product binaryResult = binarySearch(products, searchId);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != null)
            System.out.println("Found: " + binaryResult.productName + " in " + binaryResult.category);
        else
            System.out.println("Product not found.");

        sc.close();
    }
}