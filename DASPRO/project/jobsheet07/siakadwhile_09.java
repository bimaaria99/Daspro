import java.util.Scanner;

public class siakadwhile_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, jml, nilai;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: A ");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: B+");
            } else if (nilai > 65) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: B ");
            } else if (nilai > 60) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: C+");
            } else if (nilai > 50) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: C ");
            } else if (nilai > 39) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: D ");
            } else {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: E ");
            }
            i++;
        }
    }
}
