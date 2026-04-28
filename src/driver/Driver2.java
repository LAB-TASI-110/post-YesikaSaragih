// 12S24024 - Yesika Nadia Saragih

package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. jumlah data
        int N = sc.nextInt();

        // 2. deret stok
        int[] stok = new int[N];
        for (int i = 0; i < N; i++) {
            stok[i] = sc.nextInt();
        }

        // 3. kategori (PASTI TERBACA)
        String cariKategori = sc.next().toLowerCase();

        // data tetap
        String[] namaBarang = {"dasi sd", "gula", "rok pramuka", "minyak"};
        String[] kategoriBarang = {"pakaian", "sembako", "pakaian", "sembako"};

        Model2[] data = new Model2[N];

        for (int i = 0; i < N; i++) {
            data[i] = new Model2(namaBarang[i], stok[i], kategoriBarang[i]);
        }

        int total = 0;
        boolean ada = false;

        System.out.println("=== HASIL KATEGORI " + cariKategori.toUpperCase() + " ===");

        for (int i = 0; i < N; i++) {
            if (data[i].getKategori().equals(cariKategori)) {
                System.out.println(data[i].getNamaBarang() + " = " + data[i].getStok() + " pcs");
                total += data[i].getStok();
                ada = true;
            }
        }

        if (ada) {
            System.out.println("Total stok = " + total);
        } else {
            System.out.println("Tidak ada data untuk kategori tersebut");
        }

        sc.close();
    }
}