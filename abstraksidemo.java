/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraksidemo;

/**
 *
 * @author dexed
 */
// Abstract class Kendaraan
abstract class Kendaraan {
    String nama;

    // Constructor
    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Method abstrak (harus diimplementasikan oleh subclass)
    abstract void bergerak();

    // Method konkret (bisa langsung digunakan)
    public void info() {
        System.out.println(nama + " adalah kendaraan.");
    }
}

// Subclass Mobil yang mengimplementasikan method abstrak
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    // Implementasi method abstrak
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan roda.");
    }
}

// Subclass Kapal yang mengimplementasikan method abstrak
class Kapal extends Kendaraan {
    public Kapal(String nama) {
        super(nama);
    }

    // Implementasi method abstrak
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak di air.");
    }
}

// Main class untuk menjalankan program
public class abstraksidemo {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Titanic");

        mobil.info();
        mobil.bergerak();

        kapal.info();
        kapal.bergerak();
    }
}