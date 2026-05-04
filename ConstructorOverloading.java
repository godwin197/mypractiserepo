package MyPkg;

public class ConstructorOverloading {
	
	static class Product {
	    int productId;
	    String productName;
	    double price;

	    
	    public Product() {
	        System.out.println("Product Created with default values.");
	    }

	  
	    public Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        System.out.println("Product Created with custom details: " + productName);
	    }

	   
	    void displayProduct() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("---------------------------");
	    }
	}

	
	public class ProductTest {
	    public static void main(String[] args) {
	        
	    
	        System.out.println("Creating p1...");
	        Product p1 = new Product();
	        p1.displayProduct();

	       
	        System.out.println("Creating p2...");
	        Product p2 = new Product(101, "SIRE 2.0 License", 1250.50);
	        p2.displayProduct();
	    }
	}	

}
