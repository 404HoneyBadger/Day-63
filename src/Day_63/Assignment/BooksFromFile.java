package Day_63.Assignment;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]),  Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> books.add(book));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }

    public class Book {

        private String name;
        private int publishingYear;
        private int pageCount;
        private String author;

        public Book(String name, int ReleaseYear, int pages, String author) {
            this.name = name;
            this.publishingYear = ReleaseYear;
            this.pageCount = pages;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public int getPublishingYear() {
            return publishingYear;
        }

        public String getAuthor() {
            return author;
        }

        public int getPagecount() {
            return pageCount;
        }

    }
}
