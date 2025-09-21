/**
 * Main class to demonstrate the Proxy design pattern implementation
 * for the Digital Library System EBook functionality.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Digital Library System - EBook Proxy Pattern Demo ===\n");

        // Create EBook proxies (no loading happens yet)
        System.out.println("1. Creating EBook proxies...");
        EBook book1 = new EBookProxy("Java_Programming_Guide.pdf");
        EBook book2 = new EBookProxy("Design_Patterns_Explained.pdf");
        EBook book3 = new EBookProxy("Spring_Framework_Tutorial.pdf");
        
        System.out.println("\n2. Proxies created - no actual books loaded yet!");
        
        // Demonstrate lazy loading
        System.out.println("\n3. Accessing first book for the first time:");
        book1.display();
        
        System.out.println("\n4. Accessing the same book again (already loaded):");
        book1.display();
        
        System.out.println("\n5. Accessing second book for the first time:");
        book2.display();
        
        System.out.println("\n6. Comparison with direct RealEBook instantiation:");
        System.out.println("Creating RealEBook directly (loads immediately):");
        EBook directBook = new RealEBook("Direct_Load_Book.pdf");
        directBook.display();
        
        System.out.println("\n=== Demo completed ===");
        
        // Show the difference in memory usage pattern
        System.out.println("\nKey Benefits Demonstrated:");
        System.out.println("- Proxy delays loading until actually needed");
        System.out.println("- Memory efficient for large collections");
        System.out.println("- Transparent to client code (same interface)");
        System.out.println("- Caches the loaded object for subsequent calls");
    }
}