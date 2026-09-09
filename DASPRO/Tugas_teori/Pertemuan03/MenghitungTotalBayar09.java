import java.util.Scanner;

public class MenghitungTotalBayar09 {
    public static void main(String[] args) {
        int harga;
        double potongan;
        double jml_Bayar;
        double diskon=0.15;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();

        potongan = harga * diskon;
        jml_Bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_Bayar);

        sc.close();
    }
}
