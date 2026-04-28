// 12S24024 - Yesika Nadia Saragih

package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Model3[] produk = {
            new Model3("A1", "Pulpen", 3000),
            new Model3("A2", "Pin Del", 10000),
            new Model3("A3", "Baju Del", 80000),
            new Model3("M1", "Keripik", 5000),
            new Model3("D1", "Kopi", 10000),
            new Model3("D2", "Minuman Rasa", 7000),
            new Model3("L1", "Print", 500)
        };

        int total = 0;

        System.out.println("=== DELSHOP (Input Kode Barang) ===");

        while (true) {
            System.out.print("Masukkan kode barang (atau END): ");
            String kodeInput = sc.next();

            if (kodeInput.equalsIgnoreCase("END")) break;

            Model3 barangDipilih = null;

            for (Model3 p : produk) {
                if (p.getKode().equalsIgnoreCase(kodeInput)) {
                    barangDipilih = p;
                    break;
                }
            }

            if (barangDipilih == null) {
                System.out.println("Kode tidak ditemukan!");
                continue;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = sc.nextInt();

            int subtotal = barangDipilih.getHarga() * jumlah;
            total += subtotal;

            System.out.println("Ditambahkan: " + barangDipilih.getNama() + " x" + jumlah);
        }

        // Pembayaran
        System.out.println("\nTotal bayar: Rp" + total);
        System.out.print("Metode bayar (cash/qris): ");
        String metode = sc.next();

        if (metode.equalsIgnoreCase("cash")) {
            System.out.print("Masukkan uang: ");
            int uang = sc.nextInt();

            if (uang < total) {
                System.out.println("Uang kurang!");
            } else {
                System.out.println("Kembalian: Rp" + (uang - total));
            }
        } else {
            System.out.println("Silakan scan QRIS");
        }

        System.out.println("Terima kasih");
        sc.close();
    }
}