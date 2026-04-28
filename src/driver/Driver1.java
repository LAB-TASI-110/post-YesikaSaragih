// 12S24024 - Yesika Nadia Saragih

package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String kode = sc.next();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            double beratButet = sc.nextDouble();

            Model1 kota = Model1.getDataKota(kode);

            if (kota == null) {
                System.out.println("Kode kota tidak valid\n");
                continue;
            }

            double beratUcok = 1.5 * beratButet;
            double totalBerat = beratButet + beratUcok;

            double totalOngkir = totalBerat * kota.getOngkirPerKg();

            String promo = "-";

            if (totalBerat > 10) {
                totalOngkir *= 0.9;
                promo = "Diskon 10%";
            }

            if (kota.getKeterangan().equals("luar pulau")) {
                if (promo.equals("-")) {
                    promo = "Asuransi gratis";
                } else {
                    promo += " + Asuransi gratis";
                }
            }

            System.out.println("=== STRUK DEL EXPRESS ===");
            System.out.println("Kota Tujuan     : " + kota.getNamaKota());
            System.out.println("Berat Butet     : " + beratButet + " kg");
            System.out.println("Berat Ucok      : " + beratUcok + " kg");
            System.out.println("Total Berat     : " + totalBerat + " kg");
            System.out.println("Total Ongkir    : Rp " + (int) totalOngkir);
            System.out.println("Promo           : " + promo);
            System.out.println();
        }

        sc.close();
    }
}