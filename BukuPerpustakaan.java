import java.util.ArrayList;
import java.util.Stack;

public class BukuPerpustakaan {
    
    String judul;
    String author;
    String penerbit;
    String kategori;
    String tahun;

    BukuPerpustakaan(String judul, String author, String penerbit, String kategori, String tahun){
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    }

    public static void main(String[] args){

        System.out.println("=========================================================================================");
        System.out.println(" Daftar Buku yang Tersedia ");
        System.out.println("=========================================================================================");

        ArrayList<BukuPerpustakaan> daftarPerpustakaan = new ArrayList<BukuPerpustakaan>();
        daftarPerpustakaan.add(new BukuPerpustakaan(" Laskar Pelangi    ", " Andrea Hirata          ", " Bentang Pustaka        ", " Fiksi      ", " 2005   "));
        daftarPerpustakaan.add(new BukuPerpustakaan(" Bumi Manusia      ", " Pramoedya Ananta Toer  ", " Hasta Mitra            ", " Sastra     ", " 1980   "));
        daftarPerpustakaan.add(new BukuPerpustakaan(" Ayat Ayat Cinta   ", " Habiburrahman El-Shiray", " Republika              ", " Romansa    ", " 2004   "));
        daftarPerpustakaan.add(new BukuPerpustakaan(" Perahu kertas     ", " Dee Lestari            ", " Bentang Pustaka        ", " Romansa    ", " 2008   "));
        daftarPerpustakaan.add(new BukuPerpustakaan(" Tentang Kamu      ", " Tere Liye              ", " Gramedia Pustaka Utama ", " Romansa    ", " 2007   "));

        System.out.println(" Judul             "+ " Author                 " + " Penerbit               " + " Kategori   " + " Tahun "); 
        System.out.println("========================================================================================="); 

        for(BukuPerpustakaan item : daftarPerpustakaan){
            System.out.println(item.judul + item.author + item.penerbit + item.kategori + item.tahun); 
        }

        int bukuBaru = 0;
        int bukuLawas = 0;

        // Assuming you want to check the publication year of each book
        for (BukuPerpustakaan item : daftarPerpustakaan) {
            int year = Integer.parseInt(item.tahun.trim());
            if (year > 2000) {
                bukuBaru++;
            } else {
                bukuLawas++;
            }
        }

        System.out.println("=========================================================================================");
        System.out.println("Jumlah buku yang tersedia : "+daftarPerpustakaan.size());
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);

        // Adding Stack functionality
        Stack<BukuPerpustakaan> stackBuku = new Stack<>();
        for(BukuPerpustakaan item : daftarPerpustakaan){
            stackBuku.push(item);
        }

        System.out.println("Stack buku: " + stackBuku);
    }
}
