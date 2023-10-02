import java.util.Scanner;

public class Ganjil {
    
    public static void main(String[] args) throws Exception {
        /*menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
     }
}
