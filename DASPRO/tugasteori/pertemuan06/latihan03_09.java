import java.util.Scanner;

public class latihan03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuran, harga;

        System.out.print("Masukkan merk sepatu(Converse/Nike/Asics): ");
        String merk = sc.nextLine().trim();
        System.out.print("Masukkan kategori sepatu: ");
        String kategori = sc.nextLine().trim();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = sc.nextInt();
        harga = 0;

        if (merk.equals("Converse")) {
            if (kategori.equals("Slip On")) {
                harga = 800000;
            } else {
                if (kategori.equals("High Top")) {
                    harga = 1200000;
                } else {
                    System.out.println("Kategori tidak valid untuk Converse");
                }
            }
        } else {
            if (merk.equals("Nike")) {
                if (kategori.equals("Woman")) {
                    harga = 1000000;
                } else {
                    if (kategori.equals("Man")) {
                        harga = 1800000;
                    } else {
                        System.out.println("Kategori tidak valid untuk Nike");
                    }
                }
            } else {
                if (merk.equals("Asics")) {
                    if (kategori.equals("Running Kids")) {
                        harga = 750000;
                    } else {
                        if (kategori.equals("Running")) {
                            harga = 1500000;
                        } else {
                            System.out.println("Kategori tidak valid untuk Asics");
                        }
                    }
                } else {
                    System.out.println("Merk sepatu tidak ditemukan");
                }
            }
        }
        if (harga > 0) {
            System.out.println("Merk    : " + merk);
            System.out.println("Kategori: " + kategori);
            System.out.println("Ukuran  : " + ukuran);
            System.out.println("Harga   : Rp " + harga);
        }

        sc.close();
    }
}
