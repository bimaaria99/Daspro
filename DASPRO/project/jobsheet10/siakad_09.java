import java.util.Scanner;

public class siakad_09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] nilai = new int[4][3];

            int jumlahMahasiswa;
                do {
                    System.out.print("Masukkan jumlah mahasiswa: ");
                    jumlahMahasiswa = input.nextInt();
                } while (jumlahMahasiswa <= 0);

                int jumlahMataKuliah;
                do {
                    System.out.print("Masukkan jumlah mata kuliah: ");
                    jumlahMataKuliah = input.nextInt();
                } while (jumlahMataKuliah <= 0);

               

            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");

                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                    nilai[i][j] = input.nextInt();
                }
            }

            System.out.println("\n========================================");
            System.out.println("Rata-rata nilai setiap mata kuliah:");

            for (int j = 0; j < nilai[0].length; j++) {
                double totalPerMataKuliah = 0;

                for (int i = 0; i < nilai.length; i++) {
                    totalPerMataKuliah += nilai[i][j];
                }

                double rataRata = totalPerMataKuliah / nilai.length;
                System.out.println("Rata-rata mata kuliah ke-" + (j + 1) + ": " + rataRata);
            }

            for (int i = 0; i < nilai.length; i++) {
                int totalPerSiswa = 0;

                for (int j = 0; j < nilai[i].length; j++) {
                    totalPerSiswa += nilai[i][j];
                }

                System.out.println("Total nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa);
            }
        }
    }
}
