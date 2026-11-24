import java.util.Scanner;
public class tugas03_09 {
    public static void main(String[] args) {
        final int RESPONDEN = 10;
        final int PERTANYAAN = 6;

        int[][] survei = new int[RESPONDEN][PERTANYAAN];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < RESPONDEN; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Nilai harus 1-5, ulangi!");
                    }
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }

        System.out.println("\n=== Rata-rata per Responden ===");
        for (int i = 0; i < RESPONDEN; i++) {
            int total = 0;
            for (int j = 0; j < PERTANYAAN; j++) {
                total += survei[i][j];
            }
            double rata = (double) total / PERTANYAAN;
            System.out.printf("Responden %2d : %.2f%n", (i + 1), rata);
        }

        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < PERTANYAAN; j++) {
            int total = 0;
            for (int i = 0; i < RESPONDEN; i++) {
                total += survei[i][j];
            }
            double rata = (double) total / RESPONDEN;
            System.out.printf("Pertanyaan %d : %.2f%n", (j + 1), rata);
        }

        int totalSemua = 0;
        for (int i = 0; i < RESPONDEN; i++) {
            for (int j = 0; j < PERTANYAAN; j++) {
                totalSemua += survei[i][j];
            }
        }
        double rataSemua = (double) totalSemua / (RESPONDEN * PERTANYAAN);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.printf("Rata-rata seluruh survei : %.2f%n", rataSemua);

        sc.close();
    }
}