/**
 * EBook interface that defines the contract for displaying electronic books.
 * This interface will be implemented by both the real EBook and its proxy.
 */
public interface EBook {
    /**
     * Displays the content of the electronic book.
     */
    void display();

    /**
     * Returns the size of the electronic book in bytes.
     * @return The size of the book file in bytes
     */
    long getSize();

}
