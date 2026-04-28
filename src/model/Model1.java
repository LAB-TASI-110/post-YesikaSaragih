// 12S24024 - Yesika Nadia Saragih

package model;

public class Model1 {
    private String kodeKota;
    private String namaKota;
    private int ongkirPerKg;
    private String keterangan;

    public Model1(String kodeKota, String namaKota, int ongkirPerKg, String keterangan) {
        this.kodeKota = kodeKota;
        this.namaKota = namaKota;
        this.ongkirPerKg = ongkirPerKg;
        this.keterangan = keterangan;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public int getOngkirPerKg() {
        return ongkirPerKg;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public static Model1 getDataKota(String kode) {
        kode = kode.toLowerCase();
        switch (kode) {
            case "mdn": return new Model1("mdn", "Medan", 8000, "dalam pulau");
            case "blg": return new Model1("blg", "Balige", 5000, "dalam pulau");
            case "jkt": return new Model1("jkt", "Jakarta", 12000, "luar pulau");
            case "sby": return new Model1("sby", "Surabaya", 13000, "luar pulau");
            default: return null;
        }
    }
}