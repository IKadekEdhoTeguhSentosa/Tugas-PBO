/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penggunaan_super_latihan5;

/**
 *
 * @author dexed
 */
// Superclass Hewan
class Hewan {
    String nama;

    // Konstruktor Hewan
    Hewan(String nama) {
        this.nama = nama;
    }

    // Method info
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    // Konstruktor Kucing
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass (Hewan)
    }
}

// Class utama untuk menjalankan program
public class penggunaan_super_latihan5 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Law");

        // Memanggil method info() dari class Hewan
        kucing.info();
    }
}