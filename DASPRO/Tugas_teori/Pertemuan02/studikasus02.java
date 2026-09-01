import java.util.Scanner; 

public class studikasus02 {
    public static void main(String[] args){

         Scanner input = new Scanner(System.in);
            int jml_tabungan_awal, lama_menabung;
            double prosentase_bunga =1.02, bunga,jml_tabungan_akhir;

            System.out.println("Masukkan jumlah tabungan awal anda:");
            jml_tabungan_awal = input.nextInt();
            System.out.println("Masukkan lama menabung (dalam bulan):");
            lama_menabung = input.nextInt();

            bunga = jml_tabungan_awal * prosentase_bunga * lama_menabung;
            jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah : " + bunga);
        System.out.println("Jumlah tabungan akhir adalah : " + jml_tabungan_akhir);
        
    }
}
              
       