import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] mang; //mảng
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap Size!");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("khong thuoc khong duoc qua 20");
        } while (size > 20);
        mang = new int[size];
        int i = 0;
        while (i < mang.length) {
            System.out.println("Nhap yeu to" + (i + 1) + " : ");
            mang[i] = scanner.nextInt();
            i++;
        }
        System.out.println("danh sach tai san: ");
        for (int j = 0; j < mang.length; j++) {
            System.out.println(mang[j] + "\t");

        }
    }
}