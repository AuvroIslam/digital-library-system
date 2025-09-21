/**
 * RealEBook class that represents the actual electronic book.
 * This class loads the book file immediately upon instantiation
 * and implements the actual display functionality.
 */
public class RealEBook implements EBook {
    private String filename;
    private String content;

    private long size;

    private String title;


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
        
        // Extract title from filename (remove file extension and replace underscores with spaces)
        this.title = filename.replaceAll("\\.[^.]+$", "").replace("_", " ");
        
        // Simulate loading content
        this.content = "Content of " + filename + " loaded successfully!";
        // Simulate file size based on filename length and content (in bytes)
        this.size = (long) (filename.length() * 1024 + content.length() * 2);
        System.out.println(filename + " has been loaded into memory.");
    }

    /**
     * Displays the content of the electronic book.
     */
    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }


    /**
     * Returns the size of the electronic book in bytes.
     * @return The size of the book file in bytes
     */
    @Override
    public long getSize() {
        return size;

    
    /**
     * Returns the title of the electronic book.
     * @return The title of the book
     */
    @Override
    public String getTitle() {
        return title;

    }
}