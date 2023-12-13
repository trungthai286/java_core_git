package quanlysach_off;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanly {
    public static void main(String[] args) {
        ArrayList<book> arrBook = new ArrayList<>();
        book book1 = new book(01, "Toi co hoa vang tren co xanh",
                "Nguyen Nhat Anh", "Nhat ky", "Tien Phong", 2023);
        book book2 = new book(02, "Ban co 5 cho ngoi",
                "Nguyen Nhat Anh", "Nhat ky", "Bo GDDT", 2020);
        book book3 = new book(03, "Co gai den tu hom qua",
                "Nguyen Nhat Anh", "Tieu thuyet", "Thanh nien", 2023);
        arrBook.add(book1);
        arrBook.add(book2);
        arrBook.add(book3);
        System.out.println("Liet ke thong tin sach: ");
        for (book ttSach : arrBook) {
            System.out.println(ttSach);
        }
//        Tim sach theo ten
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sach can tim theo ten: ");
        String tenSach = sc.nextLine();
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getTitle().equalsIgnoreCase(tenSach)) {
                arrBook.get(i).inSach();
            } else ;
        }
//        Tim sach theo the loai
        System.out.println("Nhap sach can tim theo the loai: ");
        String theLoaiSach = sc.nextLine();
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getCategory().equalsIgnoreCase(theLoaiSach)) {
                arrBook.get(i).inSach();
            } else ;
        }
//        Liet ke cac sach xuat ban trong nam 2023
        System.out.println("Sach xuat ban nam 2023 la: ");
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getYear() == 2023) {
                arrBook.get(i).inSach();
            }
        }
    }
}


