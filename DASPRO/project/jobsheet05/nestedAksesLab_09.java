import java.util.Scanner;

public class nestedAksesLab_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Sedang disanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.print("Punya izin dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.print("Asisten lab? (true/false): ");
        boolean assistenLab = sc.nextBoolean();
        
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || assistenLab) {
                System.out.println("akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak : membutuhkan izin Dosen atau status assisten lab");
            }
        }else{
            System.out.println("Akses ditolak : status mahasiswa tidak memenuhi syarat");
        }
        sc.close();
    }
    
}
