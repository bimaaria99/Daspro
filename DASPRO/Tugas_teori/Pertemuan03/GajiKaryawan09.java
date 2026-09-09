import java.util.Scanner;

public class GajiKaryawan09 {
    public static void main(String[] args) {
        int gajiPokok;
        double bonus;
        double tunjTransp=60000;
        double tunjMkn=40000;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        bonus = 0.05 * gajiPokok;
        double totalGaji = gajiPokok + bonus + tunjTransp + tunjMkn - (0.01 * gajiPokok);
        System.out.println("Bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("gaji yang anda terima adalah Rp. " + totalGaji);
        sc.close();
    }
}
