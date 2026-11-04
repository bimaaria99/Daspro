public class latihan03_09 {
    
    public static void main(String[] args) {
        int n = 1;

        while (n <= 5) {
            int jumlah = 0;
            int i = 1;

            System.out.print("n = " + n + " -> jumlah kuadrat = ");

            while (i <= n) {
                int kuadrat = i * i;
                jumlah = jumlah + kuadrat;

                System.out.print(kuadrat);
                if (i < n) {
                    System.out.print(" + ");
                }

                i++;
            }

            System.out.println(" = " + jumlah);
            n++;
        }
    }
}