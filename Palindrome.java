import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Masukan : ");
        String iString = Scanner.nextLine();
        System.out.println("===============================");

        if (isPalindrome(iString)) {
            System.out.println("(Palindrome) ");
        } else {
            System.out.println("(Bukan Palindrome) ");
        }

    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int kiri = 0;
        int kanan = str.length() - 1;

        while (kiri < kanan) {
            if (str.charAt(kiri) != str.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }
}