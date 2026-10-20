import java.util.Scanner;

public class Tugas2Pemilihan_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode pelayanan (1-4): ");
        int pelayanan = input.nextInt(); // Membaca input int pelayanan
        
        // Mengevaluasi input pelayanan menggunakan struktur IF-ELSE
        if (pelayanan == 1) {
            System.out.println("legalisir ijazah di Loket A");
        } else if (pelayanan == 2) {
            System.out.println("surat keterangan lulus di Loket B");
        } else if (pelayanan == 3) {
            System.out.println("pembayaran UKT di Loket C");
        } else if (pelayanan == 4) {
            System.out.println("pengajuan cuti akademik di Loket D");
        } else {
            System.out.println("kode tidak ditemukan");
        }
    }
} 