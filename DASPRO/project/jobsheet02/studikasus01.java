import java.util.Scanner;

public class studikasus01 {

    public static void main (String [] args){

        try (Scanner input = new Scanner(System.in)) {
            int panjang;
            int lebar;
            int keliling;

            System.out.print("Masukkan panjang : ");
            panjang = input.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = input.nextInt();

            keliling = 2 *(panjang + lebar);

            System.out.println("Keliling persegi panjang adalah : " + keliling);
        }
    }
}