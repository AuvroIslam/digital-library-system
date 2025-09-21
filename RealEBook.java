/**
 * RealEBook class that represents the actual electronic book.
 * This class loads the book file immediately upon instantiation
 * and implements the actual display functionality.
 */
public class RealEBook implements EBook {
    private String filename;
    private String content;

    /**
     * Constructor that takes the filename and immediately loads the book.
     * @param filename The name of the book file to load
     */
    public RealEBook(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    /**
     * Simulates loading the book content from disk.
     * In a real implementation, this would read from an actual file.
     */
    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk...");
        // Simulate some loading time
        try {
            Thread.sleep(1000); // Simulate disk I/O delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Simulate loading content
        this.content = "Content of " + filename + " loaded successfully!";
        System.out.println(filename + " has been loaded into memory.");
    }

    /**
     * Displays the content of the electronic book.
     */
    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
        System.out.println("Content: " + content);
    }
}