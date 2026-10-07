import java.util.Scanner;

public class PemilihanNoPresensi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---: ");
        System.out.println("Apakah UKS sudah lunas? (true/false): ");
        boolean uksLunas = sc.nextBoolean();

       //Menggunakan operator ternary untuk menentukan apakah mahasiswa dapat mencetak KRS atau tidak
        String hasil = uksLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        //mencetak hanya menggunakan satu perintah saja
        System.out.println(hasil);

        sc.close();
     }
}