import java.util.Scanner;

public class PemilihanNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---: ");
        System.out.println("Apakah UKS sudah lunas? (true/false): ");
        boolean uksLunas = sc.nextBoolean();

        if (uksLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Pembayaran UKT belum terverifikasi");
            System.out.println("Silahkan lakukan pembayaran UKT terlebih dahulu");
        }
     }
}