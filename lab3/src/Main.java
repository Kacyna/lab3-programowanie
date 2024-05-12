import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Władca Pierścieni", "J.R.R. Tolkien", 1178);
        Book book2 = new Book("Gra o Tron", "George R.R. Martin", 844);
        Book book3 = new Book("To", "Stephen King", 1101);
        Book book4 = new Book( "Zwiadowcy Ruiny Gorlanu", "John Flanagan", 318);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Wszystkie książki:");
        library.printAllBooks();

        System.out.println("\nKsiążki George R.R. Martin'a:");
        List<Book> foundBooks = library.findBooksByAuthor("George R.R. Martin");
        for (Book book : foundBooks) {
            book.printInfo();
        }
    }
}