import java.util.Scanner;

public class Pecahanuang {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        // Uang yang dimiliki //
        System.out.print("Jumlah masukan uang :" + "Rp :");
        int jumlahuang = input.nextInt();

        // Nominal uanng yang ada di indonesia //
        int[] pecahan = {100000, 75000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int[] jumlahpecahan = new int[pecahan.length];

        // Menghitung nominal uang //
        for (int i = 0; i < pecahan.length; i++) {
            if (jumlahuang >= pecahan [i]) {
                jumlahpecahan[i] = jumlahuang / pecahan[i];
                jumlahuang %= pecahan[i];

            }
        }

        for (int i = 0; i < pecahan.length; i++) {
            if (jumlahpecahan[i] > 0) {
                System.out.println(jumlahpecahan [i] + " x " + " Rp " + pecahan[i]);
            }
        }

        input.close();
    }
}
