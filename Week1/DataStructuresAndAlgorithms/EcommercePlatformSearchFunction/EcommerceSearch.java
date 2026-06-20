package EcommercePlatformSearchFunction;

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId){
        for(Product product : products){
            if(product.productId == targetId){
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId){
        int left = 0;
        int right = products.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(products[mid].productId == targetId){
                return products[mid];
            }

            if(products[mid].productId < targetId){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(103, "Book", "Education")
        };

        int targetId = 102;

        Product output1 = linearSearch(products, targetId);

        System.out.println("Linear Search Result:");
        System.out.println(output1.productId);

        Product output2 = binarySearch(products, targetId);

        System.out.println("\nBinary Search Result:");
        System.out.println(output2.productId);
    }
}