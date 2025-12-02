package Praktikum5;

public abstract class Kendaraan {
    protected String merk;
    protected String model;
    protected int tahunProduksi;

    // Konstruktor
    public Kendaraan(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    // Method abstrak (harus diimplementasikan oleh subclass)
    public abstract void nyalakanMesin();

    // Method final agar tidak bisa dioverride
    public final void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}