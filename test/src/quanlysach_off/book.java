package quanlysach_off;

import java.util.Scanner;

public class book {
    private int id;
    private String title;
    private String author;
    private String category;
    private String publisher;
    private int year;

    public book(int id, String title, String author, String category, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "Thong tin sach (id: " + id +
                        ", title: " + title +
                        ", author: " + author +
                        ", category: " + category +
                        ", publisher: " + publisher +
                        ", year: " + year + " )";
    }

    // in sach
    public void inSach() {
        System.out.println("Thong tin sach (id: " + id +
                ", title: " + title +
                ", author: " + author +
                ", category: " + category +
                ", publisher: " + publisher +
                ", year: " + year + " )");
    }


}

