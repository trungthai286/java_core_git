package quanlysach_off;
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
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public int getYear() {
        return year;
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

    //  in sach
    public void inSach() {
        System.out.println("Thong tin sach (id: " + id +
                ", title: " + title +
                ", author: " + author +
                ", category: " + category +
                ", publisher: " + publisher +
                ", year: " + year + " )");
    }


}

