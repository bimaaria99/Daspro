import java.util.Scanner;

public class nestedujianskripsi_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = "bebasKompen";
        System.out.print("Apakah mahasiswa memiliki bebas kompen? (ya/tidak): ");
        String jawaban = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing01: ");
        int pembimbing01 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing02: ");
        int pembimbing02 = sc.nextInt();

        if (jawaban.equalsIgnoreCase("ya")) {
            if (pembimbing01 >= 8 && pembimbing02 >= 4) {
               pesan = "Semua syarat terpenuhi. Mahasiswa dapat mengikuti ujian skripsi.";
            } else if (pembimbing01 < 8 && pembimbing02 >= 4) {
                pesan = "Syarat log bimbingan tidak terpenuhi. Mahasiswa tidak dapat mengikuti ujian skripsi.";
            } else if (pembimbing01 >= 8 && pembimbing02 < 4) {
                pesan = "Syarat log bimbingan tidak terpenuhi. Mahasiswa tidak dapat mengikuti ujian skripsi.";
            } else {
                pesan = "Syarat log bimbingan tidak terpenuhi. Mahasiswa tidak dapat mengikuti ujian skripsi.";
            }
        } else {
            pesan = "Mahasiswa tidak memiliki bebas kompen. Mahasiswa tidak dapat mengikuti ujian skripsi.";
        }
        System.out.println(pesan);
        sc.close();
    }
}