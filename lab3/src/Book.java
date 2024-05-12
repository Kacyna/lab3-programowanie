public class Book {
    private final String title;
    private final String author;
    private final int pages;


    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void printInfo() {
        System.out.println("Tytuł:" + title);
        System.out.println("Autor" + author);
        System.out.println("Liczba stron" + pages);
        System.out.println();
    }
}