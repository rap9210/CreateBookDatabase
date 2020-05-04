import java.awt.print.Book;

public class BookDataBaseApp {
    public static void main(String[] args) {
        BookDatabase headFirstJava = new BookDatabase("Java1001");
        BookDatabase thinkingInJava = new BookDatabase("Java1002");
        BookDatabase ocpJavaSE = new BookDatabase("Orcl1003");
        BookDatabase automateWithPython = new BookDatabase("Python1004");
        BookDatabase makersGuide = new BookDatabase("Zombie1005");
        BookDatabase raspberryProjects = new BookDatabase("Rasp1006");

        System.out.println(headFirstJava.getBookInfo());
        System.out.println(thinkingInJava.getBookInfo());
        System.out.println(ocpJavaSE.getBookInfo());
        System.out.println(automateWithPython.getBookInfo());
        System.out.println(makersGuide.getBookInfo());
        System.out.println(raspberryProjects.getBookInfo());



    }
}
