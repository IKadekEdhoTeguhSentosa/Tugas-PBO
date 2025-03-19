/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author dexed
 */
public class hewan {
    // Atribut
    String nama;
    String jenis;
    int umur;

    // Konstruktor
    hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }
    
        // Metode untuk menambah umur hewan
    void bertambahUmur(int tahun) {
        this.umur += tahun;
        System.out.println(nama + " telah bertambah umur menjadi " + umur + " tahun.");
    }

    // Metode untuk menampilkan suara hewan
    void suaraHewan() {
        if (nama.equalsIgnoreCase("Kucing")) { //jenis hewan yang akan diterangkan
            System.out.println(nama + ": Meong!"); //suara hewan yang diterangkan
        } else if (nama.equalsIgnoreCase("Anjing")) { //jenis hewan yang akan diterangkan
            System.out.println(nama + ": Guk guk Auuuuu!"); //suara hewan yang diterangkan
        } else {
            System.out.println(nama + ": Suara tidak diketahui.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Hewan
        hewan hewan1 = new hewan("Kucing", "Mamalia", 6);
        hewan hewan2 = new hewan("Anjing", "Mamalia", 3);

        // Menampilkan informasi awal
        hewan1.tampilkanInfo();
        hewan1.suaraHewan();
        hewan1.bertambahUmur(2); // Menambah umur kucing
        hewan1.tampilkanInfo(); // Menampilkan info setelah umur bertambah

        System.out.println(); // Pemisah output

        hewan2.tampilkanInfo();
        hewan2.suaraHewan();
        hewan2.bertambahUmur(2); // Menambah umur anjing
        hewan2.tampilkanInfo(); // Menampilkan info setelah umur bertambah
    }
    
}
