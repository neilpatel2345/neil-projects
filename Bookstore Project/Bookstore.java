
/**
 * Manages a collection of Book objects.
 */
public class Bookstore {

    private final Book[] books;
    private int totalbooks;
    private double gross;
    private final static int MAXNUMOFBOOKS = 1000; 

    /**
     * Creates an empty BookStore object.
     */
    public Bookstore() {
        books = new Book[MAXNUMOFBOOKS];
        totalbooks = 0;
        gross = 0.0;
        // Your code should go here
    }

    /**
     * Adds a new book to this bookstore.
     *
     * @param b the book to add
     */
    public void addNewBook(Book b) {
        if (totalbooks < books.length) {
            books[totalbooks] = b;
            totalbooks++;
        } else {
            System.out.println("The bookstore is full");
        }

    }

    /**
     * Adds a certain quantity of a book already in stock.
     *
     * @param title the title of the the book
     * @param quantity amount of copies to add
     */
    public void addBookQuantity(String title, int quantity) {
        // Search for the book...if found adjust the quantity, 	
        // otherwise, inform the user that the book is not available  
        String t = title;
        int q = quantity;
        for (int h = 0; h < books.length; h++) {
            if (title.equals(books[h].getTitle())) {
                books[h].addQuantity(q);
            } else {
                System.out.println("Sorry book was not found");
            }
        }
    }

    /**
     * Checks if at least a certain number of copies of a particular book are in
     * stock. Note: You can use this method to check if a book is already in the
     * bookstore. This way, you won't create duplicate records of the same book.
     *
     * @param title the title of the book to search for
     * @param quantity the desired number of copies
     * @return
     * @returns true if title exists with specified quantity; otherwise false
     */
    public boolean inStock(String title, int quantity) {
        // Search for the book...if found, adjust the quantity.      
        // otherwise, Book not in the BookStore.
        for (int i =0; i<books.length; i++) 
        {
          if (title.equals(books[i].getTitle())) 
          {
            if (quantity <= books[i].getQuantity()) 
              {
                return true;
              }
            else 
              {
                return false;
              }
          }
        }
    return false;

    }

    /**
     * Sells a particular number of copies of a certain book. If successful
     * (i.e. enough books are in stock to sell), the quantity of the book is
     * adjusted. Otherwise, no books are sold.
     *
     * @param title the title of the book to sell
     * @param quantity the amount of books to sell
     * @return
     * @returns true if successful; otherwise false
     */
    public boolean sellBook(String title, int quantity) {
        boolean worked = false;
        String T = title;
        int Q = quantity;
        for (int v = 0; v < books.length; v++) {
            if (books[v].getTitle().equals(T));
            {
                books[v].subtractQuantity(Q);
                gross += books[v].getPrice() * Q;
                worked = true;
            }//end of if statement               
        }//end if for loop
        return worked;
    }//end of method 

    /**
     * Lists information about each book in the bookstore
     */
    public void listBooks() {
        for (int g = 0; g < books.length; g++) {
            books[g].toString();
        }
// List all books in Bookstore
    }

    /**
     * Lists the titles of all the books in the bookstore
     */
    public void listTitles() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("The title of book" + (i + 1) + ": " + books[i].getTitle());
        }
    }

    /**
     * Returns the gross income of this bookstore.
     *
     * @return
     * @returns gross income
     */
    public double getIncome() {

        return gross;
    }
}
