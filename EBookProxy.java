/**
 * EBookProxy class that implements the Proxy design pattern.
 * This class delays the loading of the actual EBook until display() is called
 * for the first time, providing lazy loading functionality.
 */
public class EBookProxy implements EBook {
    private String filename;
    private RealEBook realEBook;

    /**
     * Constructor that only stores the filename without loading the book.
     * @param filename The name of the book file to be loaded later
     */
    public EBookProxy(String filename) {
        this.filename = filename;
        System.out.println("EBookProxy created for: " + filename + " (not loaded yet)");
    }

    /**
     * Displays the content of the electronic book.
     * Loads the actual book on first call (lazy loading).
     */
    @Override
    public void display() {
        if (realEBook == null) {
            System.out.println("First time access - loading the real EBook...");
            realEBook = new RealEBook(filename);
        }
        realEBook.display();
    }

    /**
     * Returns the filename of the book.
     * @return The filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Checks if the real EBook has been loaded.
     * @return true if loaded, false otherwise
     */
    public boolean isLoaded() {
        return realEBook != null;
    }
}