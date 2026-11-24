import java.util.Scanner;

public class bioskopwithscannermodif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length) {
                        System.out.println("Baris tidak tersedia! Pilih baris 1 sampai " + penonton.length);
                    } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Kolom tidak tersedia! Pilih kolom 1 sampai " + penonton[baris - 1].length);
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan.");
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak tersedia!");
            }
        }
    }
}