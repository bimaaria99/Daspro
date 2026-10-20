import java.util.Scanner;

public class bonusPegawai_09 {
    public static void main(String[] args) {
        // Deklarasi
        int jamKerja;
        double gajiHarian, bonus;
        Scanner input = new Scanner(System.in);

        // Algoritma
        while (true) {
            System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
            jamKerja = input.nextInt();

            if (jamKerja < 0) {
                break;
            }

            System.out.print("Masukkan gaji harian: ");
            gajiHarian = input.nextDouble();

            if (jamKerja > 8) {
                bonus = 0.2 * gajiHarian;
            } else {
                bonus = 0;
            }

            System.out.println("Bonus yang diterima: " + bonus);
            System.out.println();
        }

        System.out.println("Program selesai.");
        input.close();
    }
} 
    

