import java.util.Scanner;

public class bai_1 {

    /*Câu 1: Viết chương trình thực hiện công việc:
    Nhập vào từ bàn phím họ và tên bạn
    Thực hiện chuẩn hóa chuỗi vừa nhập (in hoa chữ cái đầu của họ và tên)*/

    public static void main(String[] args) {
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println(" Nhập vào chuỗi: ");
        a = sc.nextLine();
        char[] charArray = a.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        a = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + a);

    }
}
