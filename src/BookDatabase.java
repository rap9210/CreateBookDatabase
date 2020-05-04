import java.util.ArrayList;

public class BookDatabase {

    private ArrayList<Book> bookArray;

    public BookDatabase(){
        ArrayList<Book> tempArray = new ArrayList<>();
        Book book1 = new Book("Java1001");
        Book book2 = new Book("Java1002");
        Book book3 = new Book("Orcl1003");
        Book book4 = new Book("Python1004");
        Book book5 = new Book("Zombie1005");
        Book book6 = new Book("Rasp1006");

        tempArray.add(book1);
        tempArray.add(book2);
        tempArray.add(book3);
        tempArray.add(book4);
        tempArray.add(book5);
        tempArray.add(book6);

        this.setBookArray(tempArray);
    }

    public ArrayList<Book> getBookArray() {
        return bookArray;
    }

    public void setBookArray(ArrayList<Book> bookArray) {
        this.bookArray = bookArray;
    }

    public Book searchDatabase(String sku){
        for (Book i: getBookArray()) {
            if (i.getSku().equalsIgnoreCase(sku)) {
                return i;
            }
        }
        Book userBook = new Book();
        userBook.setSku(sku);
        userBook.setTitle(sku+" not found");

        return userBook;

    }
}
