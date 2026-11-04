import java.util.Scanner;

public class latihan04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahProduk, jumlahHari;

        // Validasi: jumlah produk dan jumlah hari minimal 1
        do {
            System.out.print("Jumlah produk: ");
            jumlahProduk = input.nextInt();
            System.out.print("Jumlah hari: ");
            jumlahHari = input.nextInt();

            if (jumlahProduk < 1 || jumlahHari < 1) {
                System.out.println("Minimal 1, silakan ulangi.");
            }
        } while (jumlahProduk < 1 || jumlahHari < 1);

        int totalSemua = 0;
        int p = 1;

        // Outer loop: setiap produk
        while (p <= jumlahProduk) {
            int totalProduk = 0;

            // Inner loop: setiap hari
            for (int hari = 1; hari <= jumlahHari; hari++) {
                int terjual;

                // Ulangi input jika negatif
                do {
                    System.out.print("Terjual produk " + p + " hari ke-" + hari + ": ");
                    terjual = input.nextInt();

                    if (terjual < 0) {
                        System.out.println("Tidak boleh negatif, ulangi input.");
                    }
                } while (terjual < 0);

                totalProduk = totalProduk + terjual;
            }

            double rata = (double) totalProduk / jumlahHari;
            System.out.println("Produk " + p + ": total = " + totalProduk
                    + ", rata-rata = " + rata);

            totalSemua = totalSemua + totalProduk;
            p++;
        }

        System.out.println("Total seluruh produk = " + totalSemua);
        input.close();
    }
}