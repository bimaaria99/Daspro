public class latihan02_09 {

    public static void main(String[] args) {
        int baris = 1;
        char huruf = 'a';

        while (baris <= 5) {
            int jumlah = 2 * baris - 1;
            int k = 1;
            while (k <= jumlah) {
                System.out.print(huruf);
                huruf++;
                k++;
            }
            System.out.println();   
            baris++;
        }
    }
}