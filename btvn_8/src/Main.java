import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> arrMovie = new ArrayList<>();
        Movie movie1 = new Movie(01, "a1", "b1", "c1", "11-11-2023", "180p");
        Movie movie2 = new Movie(02, "a3", "b2", "c2", "2-2-2023", "270p");
        Movie movie3 = new Movie(03, "a3", "b3", "c3", "3-3-2023", "90p");
        arrMovie.add(movie1);
        arrMovie.add(movie2);
        arrMovie.add(movie3);
        System.out.println("List Movie:");
        for (Movie inMovie : arrMovie) {
            System.out.println(inMovie);
        }
        System.out.println("\nList Serial:");
        ArrayList<Serial> arrSerial = new ArrayList<>();
        Serial serial1 = new Serial(04, "a3", "b4", "c4", "4-4-2023", 14, "25p");
        Serial serial2 = new Serial(05, "a2", "b5", "c5", "5-5-2023", 15, "30p");
        Serial serial3 = new Serial(06, "a3", "b6", "c6", "6-6-2023", 16, "28p");
        arrSerial.add(serial1);
        arrSerial.add(serial2);
        arrSerial.add(serial3);
        for (Serial inSerial : arrSerial) {
            System.out.println(inSerial);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap phim can tim theo tieu de:");
        String timPhim = sc.nextLine();
        for (int i = 0; i < arrSerial.size() || i < arrSerial.size(); i++) {
            if (arrMovie.get(i).getTieuDe().equalsIgnoreCase(timPhim))
                System.out.println(arrMovie.get(i));
            if (arrSerial.get(i).getTieuDe().equalsIgnoreCase(timPhim))
                System.out.println(arrSerial.get(i));
        }
    }


}
