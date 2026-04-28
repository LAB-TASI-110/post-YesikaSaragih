// 12S24024 - Yesika Nadia Saragih  

package model;

public class Model3 {
    private String kode;
    private String nama;
    private int harga;

    public Model3(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}