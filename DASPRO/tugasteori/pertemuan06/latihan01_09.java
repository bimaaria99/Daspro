import java.util.Scanner;

public class latihan01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bill01: ");
        int bill01 = sc.nextInt();
        System.out.print("Masukkan bill2: ");
        int bill02 = sc.nextInt();
        System.out.print("Masukkan bill03: ");
        int bill03 = sc.nextInt();
        int terbesar;

       if (bill01 > bill02) {
            if (bill01 > bill03) {
                terbesar = bill01;
            } else {
                terbesar = bill03;
            }
        } else {
            if (bill02 > bill03) {
                terbesar = bill02;
            } else {
                terbesar = bill03;
            }
        }
        System.out.println("Terbesar: " + terbesar);

        sc.close();
    }
}
