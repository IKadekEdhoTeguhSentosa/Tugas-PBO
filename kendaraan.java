/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author dexed
 */
// Membuat objek kendaraan
public class kendaraan {
    // Atribut
    private String merk;
    private String tipe;
    private int kecepatan;

    // Konstruktor
    public kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan
    public void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk mengurangi kecepatan
    public void kurangiKecepatan(int km) {
        kecepatan -= km;
        if (kecepatan < 0) {
            kecepatan = 0; // Kecepatan tidak boleh kurang dari 0
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    // Main class untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek kendaraan
        kendaraan mitsubishi = new kendaraan("Mitsubishi", "Mobil", 60);
        kendaraan honda = new kendaraan("Honda", "Motor", 40);

        // Menampilkan informasi awal
        mitsubishi.tampilkanInfo();
        mitsubishi.tambahKecepatan(20); // Menambah kecepatan mitsubishi
        mitsubishi.kurangiKecepatan(10); // Mengurangi kecepatan mitsubishi
        mitsubishi.berhenti(); // Menghentikan mitsubishi
        mitsubishi.tampilkanInfo(); // Menampilkan info setelah berhenti

        System.out.println(); // Pemisah output

        honda.tampilkanInfo();
        honda.tambahKecepatan(30); // Menambah kecepatan honda
        honda.kurangiKecepatan(40); // Mengurangi kecepatan honda
        honda.berhenti(); // Menghentikan honda
        honda.tampilkanInfo(); // Menampilkan info setelah berhenti
    }
}