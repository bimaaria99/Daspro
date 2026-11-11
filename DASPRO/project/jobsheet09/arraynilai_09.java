import java.util.Scanner;

public class arraynilai_09 {    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiAkhir[i] = input.nextInt();
            }

            for (int i = 0; i < nilaiAkhir.length; i++) {
                String status = (nilaiAkhir[i] >= 60) ? "Lulus" : "Tidak Lulus";
                System.out.println("Mahasiswa ke-" + (i + 1) + " dengan nilai " + nilaiAkhir[i] + " dinyatakan " + status);
            }
            int jumlahLulus = 0;
            int jumlahTidakLulus = 0;

            for (int i = 0; i < nilaiAkhir.length; i++) {
                String status = (nilaiAkhir[i] >= 60) ? "Lulus" : "Tidak Lulus";
                System.out.println("Mahasiswa ke-" + (i + 1) + " dengan nilai " + nilaiAkhir[i] + " dinyatakan " + status);

            if (nilaiAkhir[i] >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
        }
    }

            System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
            System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        }
    }

