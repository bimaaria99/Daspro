import java.util.Scanner;

public class arrayratanilai_09 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int jumlahMahasiswa;
            do {
                System.out.print("Masukkan jumlah mahasiswa: ");
                jumlahMahasiswa = scanner.nextInt();
                if (jumlahMahasiswa <= 0) {
                    System.out.println("Jumlah mahasiswa harus lebih dari 0.");
                }
            } while (jumlahMahasiswa <= 0);

            int[] nilaiMhs = new int[jumlahMahasiswa];
            int total = 0;
            int jumlahLulus = 0;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = scanner.nextInt();
                total += nilaiMhs[i];
            }

            for (int nilai : nilaiMhs) {
                if (nilai >= 70) {
                    jumlahLulus++;
                }
            }

            double rataRata = (double) total / nilaiMhs.length;
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rataRata);
            System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);

            int tertinggi = nilaiMhs[0];
            int terendah = nilaiMhs[0];

            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) {
                    tertinggi = nilaiMhs[i];
                }
                if (nilaiMhs[i] < terendah) {
                    terendah = nilaiMhs[i];
                }
            }

            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
        }
    }
}
