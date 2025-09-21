/**
 * EBook interface that defines the contract for displaying electronic books.
 * This interface will be implemented by both the real EBook and its proxy.
 */
public interface EBook {
    /**
     * Displays the content of the electronic book.
     */
    void display();
}