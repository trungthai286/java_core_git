import java.util.Scanner;

public class bai_2 {

    /*Câu 2: Viết chương trình thực hiện:
    Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
    Nhập các phần tử mảng
    In mảng ra màn hình
    Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
    Ví dụ : [1,4,7,6,2,3] -> [1,5,7,7,3,3]*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng n=: ");
        int n = sc.nextInt();
        int[] soNguyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i + " vừa nhập là");
            soNguyen[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(soNguyen[i] + "\t");
        }
        System.out.println("\nMảng sau khi tăng số chẵn:");
        for (int i = 0; i < n; i++) {
            if (soNguyen[i] % 2 == 0) {
                soNguyen[i]++;
                System.out.print(+soNguyen[i] + "\t");
            } else System.out.print(+soNguyen[i] + "\t");


        }


    }
}