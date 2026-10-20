import java.util.Scanner;

public class jamBelajar_09 {
    public static void main(String[] args) {
        // Deklarasi
        int total, hari, jamBelajar;
        Scanner input = new Scanner(System.in);

        // Algoritma
        total = 0;
        hari = 1;

        while (hari < 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jamBelajar = input.nextInt();

            if (jamBelajar > 10) {
                System.out.println("Error: jam belajar tidak boleh lebih dari 10");
            } else {
                total = total + jamBelajar;
                hari = hari + 1;
            }
        }

        System.out.println("Total jam belajar: " + total);
        input.close();
    }
}