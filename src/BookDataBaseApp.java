import java.util.Scanner;

public class BookDataBaseApp {
    public static void main(String[] args) {
        BookDatabase newDataBase = new BookDatabase();

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter SKU: ");
        String userSKU = scn.nextLine();

        Book userSearch = newDataBase.searchDatabase(userSKU);

        System.out.println(userSearch.getTitle());
    }
}
