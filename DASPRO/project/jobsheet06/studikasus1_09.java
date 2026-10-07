import java.util.Scanner;

public class studikasus1_09 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int hargaPerCup = 180000;
      int jumlahCup, uangBayar;
      int totalHarga, diskon, totalBayar;
      int kembalian, kurang;

      System.out.print("jumlah cup\t: ");
      jumlahCup = sc.nextInt();
      System.out.print("uang bayar\t: ");
      uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        if (totalHarga > 100000) {
            diskon = totalHarga * 15 / 100;

            totalBayar = totalHarga - diskon;

            System.out.println("total harga\t: " + totalHarga);
            System.out.println("diskon\t\t: " +  diskon);
            System.out.println("total bayar\t: " + totalBayar);
       
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("total bayar\t: " + totalBayar);
            System.out.println("kembalian\t: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("total bayar\t: " + totalBayar);
            System.out.println("uang anda kurang: " + kurang);
        }

       
    }
  }
}
