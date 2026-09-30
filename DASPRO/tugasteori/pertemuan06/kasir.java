import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        int total1, diskon, bayar ;
        String kartu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda memiliki kartu member? (ya/tidak): ");
        kartu = sc.nextLine();
        System.out.print("Masukkan total belanja? Rp: ");
        total1 = sc.nextInt();
        if (kartu.equalsIgnoreCase("ya")) {
            if (total1 > 500000) {
                diskon = 50000;
            } else {
                    diskon = 25000;
                }
        }else {
            if (total1 > 200000) {
                diskon = 25000;
            } else {
                diskon = 0;
            }
        }
        bayar = total1 - diskon;
        System.out.println("Total belanja: Rp " + total1);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + bayar);
    }

}